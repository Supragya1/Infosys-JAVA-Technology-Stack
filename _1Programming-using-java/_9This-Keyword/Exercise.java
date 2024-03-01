/**
 * SwiftFood also provides the feature for non-registered customers to order food. 
 * Add one more constructor to the Customer class to implement this functionality.
 * Methods - Customer (String CustomerName, long ContactNumber, String address)
 * Method Description

Customer(String customerName, long contactNumber, String address)
Initialize the customerName, contactNumber and address instance variables appropriately with the values 
passed to the constructor.
Create an object of the Customer class by using the parameterized constructor and display the customer details by 
invoking the displayCustomerDetails() method in the main() method of the Tester class. 
Sample Output
Displaying customer details
Customer Id : Null
Customer Name : Supragya
Contact Number : 9199923456
Address : 1st Main, 2nd Cross, Mumbai
 */
class Customer {
    private int customerId;
    private String customerName;
    private long contactNumber;
    private String address;
    private static int counter;
    public Customer(String customerName, long contactNumber, String address) {
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.address = address;
        counter++;
        customerId = counter;
    }
    public Customer(String customerName, long contactNumber) {
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        counter++;
        customerId = counter;
    }
    public void displayCustomerDetails() {
        System.out.println("Displaying customer details");
        System.out.println("Customer Id : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Contact Number : " + contactNumber);
        System.out.println("Address : " + address);
    }
}
public class Exercise {
    public static void main(String[] args) {
        Customer customer = new Customer("Supragya", 9199923456L, "Jammu");
        customer.displayCustomerDetails();
    }
}