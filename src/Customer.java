public class Customer {
    // Fields
    String customerName;
    boolean hasOrdered;
    Drink drink;
    float moneyGiven;
    String argue;
    Server server;

    // Methods
    void sayName() {
        System.out.println("Customer"  +  customerName);
    }
    void placeOrder(){
        System.out.println(customerName + ": Can I get " + drink.drinkName + drink.latteFlavor);

    }
    void pay(){
        System.out.println( server.serverName + "here you go" + moneyGiven);
    }
    void argue(){
        System.out.println( server.serverName + argue  );
    }
   // void wait(){
        //System.out.println( customerName + "This is taking too long"  );
    //}
    void drinkDrink(){
        System.out.println(server.serverName + "drink for" + customerName);
    }

}