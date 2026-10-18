public class PaymentProcessor {

    public boolean processPayment(double amount) {
        if (amount > 0 && amount <= 1000) {
            System.out.println("Payment successful: $" + amount);
            return true;
        }

        System.out.println("Payment declined.");
        return false;
    }

    public void refund(double amount) {
        System.out.println("Refund completed: $" + amount);
    }
}