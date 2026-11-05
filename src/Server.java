public class Server {
// Fields
String serverName;
boolean orderTaken= false;
float moneyInRegister;
int numberOfOrders;
int customerPresent;
Drink drink;
Customer customer;
    void sayName() {
        System.out.println("Server "  +  serverName);
    }
    void takeOrder() {
        orderTaken =true;
    System.out.println(serverName + " says"  + customer.customerName + "what would you like to order");
    }
    void prepareOrder() {
    System.out.println( customer.customerName + "Order is being prepared" );
    }
    void announceOrder() {
        System.out.println( customer.customerName + "Order is completed" );
    }
}
