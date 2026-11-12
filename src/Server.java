public class Server {
    // Fields
    String serverName;
    boolean orderTaken = false;
    float moneyInRegister;
    int numberOfOrders;
    int customerPresent;
    Customer customer;

    void sayName() {
        System.out.println("Server " + serverName);
    }

    void takeOrder() {
        orderTaken = true;
        System.out.println(serverName + " says" + customer.customerName + " what would you like to order");
    }

    void prepareOrder() {
        System.out.println(customer.customerName + "'s Order is being prepared");
    }

    void announceOrder() {
        System.out.println(customer.customerName + " waits very impatiently");
        System.out.println(customer.customerName + "'s Order is completed");
    }

    void argueOrder() {
        System.out.println(customer.customerName + " says: " + serverName + " THIS COFFEE IS TERRIBLE! HOW DARE YOU GIVE ME WHOLE MILK!");
        System.out.println(customer.customerName + " says: " + serverName + " How are you going to fix this!");
        System.out.println(serverName + " says: " + " You know what! IM QUITTING");


    }
}
