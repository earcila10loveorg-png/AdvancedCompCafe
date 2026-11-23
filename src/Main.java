import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ;

        ArrayList<Customer> customers;
        customers = new ArrayList<Customer>();

        ArrayList<Drink> drink;
        drink = new ArrayList<Drink>();

        ArrayList<Server> servers;
        servers = new ArrayList<Server>();
      //  Server someone = servers.get(0);
       // servers.remove();


        Drink drink1 = new Drink ();
        drink1.drinkName = "Unicorn Latte";
        drink1.drinkFlavor = " Strawberry flavor";
        drink.add(drink1);

        Drink drink2 = new Drink();
        drink2.drinkName = " Mermaid cappuccino";
        drink2.drinkFlavor = "Rum flavor";
        drink.add(drink2);


        Customer customer1 = new Customer ();
        customer1.customerName = " Cesia";
        customers.add(customer1);
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
        customers.add(customer2);
        customer2.drink = drink2;

       Server server = new Server();
       server.serverName = "Mr. Hernandez";
       server.customer = customer1;
        customer2.server = server;
        customer1.server = server;

        Customer custumer = customers.get(0);


        //customer1.sayName();
        //customer1.drinkDrink();

        //drink1.drinkFlavor = "Strawberry";
       // drink1.custumerOrder();

        customer1.server = server;


        server.customer = customer1;
        server.takeOrder();
        customer1.placeOrder();
        server.customer = customer1;
        server.prepareOrder();
        //drink1.drinkGiven();
        server1.announceOrder();
        drink1.custumerOrder();
        server1.argueOrder();
    }

}
