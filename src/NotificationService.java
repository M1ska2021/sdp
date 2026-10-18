public class NotificationService {

    public void sendOrderConfirmation(String customer, String trackingNumber) {
        System.out.println(
                "Confirmation sent to " + customer
                        + ". Tracking number: " + trackingNumber
        );
    }

    public void sendFailureNotification(String customer) {
        System.out.println(
                "Order failure notification sent to " + customer
        );
    }
}