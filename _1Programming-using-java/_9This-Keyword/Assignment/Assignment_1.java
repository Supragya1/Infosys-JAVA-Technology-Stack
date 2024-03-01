/**
 * Create a new class Order in the Java project SwiftFood with the instance variables and methods mentioned below.
 * Instance variables:  orderId, orderFoods, orderPrice, orderStatus
 * Methods: CalculatePrice
 * Method Description

calculateTotalPrice(int unitPrice)
Calculate the total price by applying a service charge of 5% on the food item ordered and store it in the instance variable totalPrice.
Return the calculated total price.
Create an object of the Order class, initialize the instance variables, 
invoke the calculateTotalPrice() method and display the values of the instance variables in 
the main() method of the Tester class. 

Sample Output
Order Details
Order Id: 101
Order Foods: Pizza
Order Status: Delivered
Total Price: 1050.0
 */
class Order {
    int orderId;
    String orderFoods;
    double orderPrice;
    String orderStatus;
    double totalPrice;

    public double calculateTotalPrice(int unitPrice) {
        orderPrice = unitPrice;
        totalPrice = orderPrice + (orderPrice * 0.05);
        return totalPrice;
    }
}
public class Assignment_1 {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderId = 101;
        order.orderFoods = "Pizza";
        order.orderStatus = "Delivered";
        System.out.println("Order Details");
        System.out.println("Order Id: " + order.orderId);
        System.out.println("Order Foods: " + order.orderFoods);
        System.out.println("Order Status: " + order.orderStatus);
        System.out.println("Total Price: " + order.calculateTotalPrice(1000));
    }
}