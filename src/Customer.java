public class Customer {
    // Fields
    String customerName;
    boolean hasOrdered;
    Drink drink;
    float moneyGiven;
    String argue;

    // Methods
    void sayName() {
        System.out.println("Customer"  +  customerName);
    }
    void placeOrder(){
        System.out.println("Can I get" + drink);

    }
    void pay(){
        System.out.println("Here you go" + moneyGiven);
    }
    void argue(){
        System.out.println("This Is too expencive!" + argue  );
    }
   // void wait(){
        //System.out.println( customerName + "This is taking too long"  );
    //}
    void drinkDrink(){

    }

}