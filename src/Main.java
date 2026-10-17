public class Main {

    public static void main(String[] args) {

        OrderFacade orderFacade = new OrderFacade();

        orderFacade.placeOrder(
                "Laptop",
                2,
                1000,
                "Alibi"
        );
    }
}