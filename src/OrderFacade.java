public class OrderFacade {

    private final InventoryService inventoryService;
    private final PaymentProcessor paymentProcessor;
    private final ShippingService shippingService;
    private final NotificationService notificationService;

    public OrderFacade() {
        inventoryService = new InventoryService();
        paymentProcessor = new PaymentProcessor();
        shippingService = new ShippingService();
        notificationService = new NotificationService();
    }

    public boolean placeOrder(
            String product,
            int quantity,
            double amount,
            String customer
    ) {

        System.out.println("Starting order...");

        boolean reserved =
                inventoryService.reserveItem(product, quantity);

        if (!reserved) {
            notificationService.sendFailureNotification(customer);
            return false;
        }

        boolean paid =
                paymentProcessor.processPayment(amount);

        if (!paid) {
            inventoryService.releaseItem(product, quantity);
            notificationService.sendFailureNotification(customer);
            return false;
        }

        try {
            String trackingNumber =
                    shippingService.createShipment(product, quantity);

            notificationService.sendOrderConfirmation(
                    customer,
                    trackingNumber
            );

            System.out.println("Order completed successfully.");

            return true;

        } catch (Exception e) {

            paymentProcessor.refund(amount);
            inventoryService.releaseItem(product, quantity);
            notificationService.sendFailureNotification(customer);

            return false;
        }
    }
}