public class Drink {
    String drinkName;
    String drinkFlavor;
    int orderNumber;
    Customer customer;
    Server server;

    void custumerOrder() {
        System.out.println( drinkFlavor + ": Drink me!" );
    }

    void drinkGiven () {
        System.out.println( drinkFlavor + "Drink for" +  customer.customerName);
    }
   // void drinkSpilled() {
       // System.out.println( customer.customerName +  "oh noo the drink"     );
    //}
}
