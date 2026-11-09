class Main {
    public static void main(String[] args) {
        ;

        Customer customer1 = new Customer ();
        customer1.customerName = " Cesia";
        customer1.sayName();


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
        server.announceOrder();
        server.argueOrder();
    }

}
