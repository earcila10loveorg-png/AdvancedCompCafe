public class Drink {
    Boolean drink;
    String latteFlavor;
    int orderNumber;
    Customer customer;
    Server server;


    void custumerOrder() {
        System.out.println( orderNumber + "Drink me" );
    }
    void drinkGiven () {
        System.out.println( latteFlavor + "Drink for" + customer.customerName);
    }

}
