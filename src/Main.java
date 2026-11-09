class Main {
    public static void main(String[] args) {
        ;
        Customer customer1 = new Customer ();
        customer1.customerName = " Cesia";
        customer1.sayName();

        Customer customer2 = new Customer();
        customer2.customerName = " Elena";
        customer2.sayName();


       Server server = new Server();
       server.serverName = "Mr. Hernandez";
        server.sayName();

        customer1.server = server;


                server.customer = customer1;
        server.takeOrder();
        customer1.placeOrder();
        customer1.pay();

        server.prepareOrder();

        server.announceOrder();
    }

}
