class Main {
    public static void main(String[] args) {
        ;
        Drink drink1 = new Drink ();
        drink1.drinkName = "THEE Latte";
        drink1.latteFlavor = " Strawberry flavor";

        Customer customer1 = new Customer ();
        customer1.customerName = " Cesia";
        customer1.sayName();
        customer1.drink = drink1;

        Customer customer2 = new Customer();
        customer2.customerName = " Elena";
        customer2.sayName();
        //Customer customer = new Customer();
        //customer.customerName ="ALex";
       // customer.sayName();
       Server server = new Server();
       server.serverName = "Mr. Hernandez";
       server.customer = customer1;
        server.sayName();
        server.takeOrder();
        customer1.placeOrder();
        server.customer = customer1;
        server.prepareOrder();
        //drink1.drinkGiven();
        server.announceOrder();
        drink1.custumerOrder();
        server.argueOrder();
    }

}
