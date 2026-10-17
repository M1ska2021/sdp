public class ShippingService {

    public String createShipment(String product, int quantity) {
        String trackingNumber = "TRK" + System.currentTimeMillis();

        System.out.println("Shipment created for "
                + quantity + " x " + product);

        System.out.println("Tracking number: " + trackingNumber);

        return trackingNumber;
    }

    public void cancelShipment(String trackingNumber) {
        System.out.println("Shipment cancelled: " + trackingNumber);
    }
}