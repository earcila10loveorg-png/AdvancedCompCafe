import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Server> servers;
        servers = new ArrayList<Server>();
      //  Server someone = servers.get(0);
       // servers.remove();


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
        Server server1 = new Server();
//        servers.add()
       server1.serverName = "Mr. Hernandez";
       servers.add(server1);

       server1.customer = customer1;
       server1.sayName();
       server1.takeOrder();
       customer1.placeOrder();


        server1.customer = customer1;
        server1.prepareOrder();
        //drink1.drinkGiven();
        server1.announceOrder();
        drink1.custumerOrder();
        server1.argueOrder();
    }

}
