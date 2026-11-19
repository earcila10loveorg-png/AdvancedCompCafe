public class Drink {
    String drinkName;
    String latteFlavor;
    int orderNumber;
    Customer customer;
    Server server;

    void custumerOrder() {
        System.out.println( latteFlavor + ": Drink me!" );
    }

    void drinkGiven () {
        System.out.println( latteFlavor + "Drink for" +  customer.customerName);
    }
   // void drinkSpilled() {
       // System.out.println( customer.customerName +  "oh noo the drink"     );
    //}
}
