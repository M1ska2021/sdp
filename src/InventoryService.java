public class InventoryService {
    private int stock = 10;

    public boolean reserveItem(String product, int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            System.out.println("Reserved " + quantity + " x " + product);
            return true;
        }

        System.out.println("Not enough stock.");
        return false;
    }

    public void releaseItem(String product, int quantity) {
        stock += quantity;
        System.out.println("Released " + quantity + " x " + product);
    }
}