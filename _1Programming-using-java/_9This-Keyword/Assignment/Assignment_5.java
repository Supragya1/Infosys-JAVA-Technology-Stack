/**
 * Method Description
 * Order()
 * Set the value of status to 'Ordered'.
 * Order(int orderId, String orderedFoods)
 * Initialize the instance variables appropriately with the values passed to the constructor. 
 * Set the value of status to 'Ordered'.
 * Create an object of the Order class by using the parameterless constructor and display the value of the status 
 * instance variable in the main() method of the Tester class. 
 * Create one more object of the Order class by using the parameterized constructor and display the value of 
 * orderId, orderFoods and status instance variables in the main() method of the Tester class.
 * Sample Output
 * Status of order1: Ordered
 * Status of order2: Ordered
 * Id of order2: 101
 * Items in order2: Pizza, Burger
 */
class Order{
    private int orderId;
    private String orderedFoods;
    private String status;
    public Order(){
        status = "Ordered";
    }
    public Order(int orderId, String orderedFoods){
        this.orderId = orderId;
        this.orderedFoods = orderedFoods;
        status = "Ordered";
    }
    public String getStatus(){
        return status;
    }
    public int getOrderId(){
        return orderId;
    }
    public String getOrderedFoods(){
        return orderedFoods;
    }
}
public class Assignment_5 {
    public static void main(String[] args) {
        Order order1 = new Order();
        System.out.println("Status of order1: "+order1.getStatus());
        Order order2 = new Order(101,"Pizza, Burger");
        System.out.println("Status of order2: "+order2.getStatus());
        System.out.println("Id of order2: "+order2.getOrderId());
        System.out.println("Items in order2: "+order2.getOrderedFoods());
    }
}
