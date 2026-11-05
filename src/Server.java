public class Server {
// Fields
String serverName;
float moneyInRegister;
int numberOfOrders;
int customerPresent;
Drink drink;
Customer customer;

    void takeOrder() {
    System.out.println(serverName + " says"  + customer.customerName + "what would you like to order");
    }
    void prepareOrder() {
    System.out.println( customer.customerName + ,"Order is being prepared" );
    }
    void announceOrder() {

    }
}
