/**
 * An e-commerce company has made it mandatory for all the customers to pay tax on every purchase and also 
 * for all the sellers to pay a certain amount of tax based on their location. You need to help the e-commerce 
 * company by implementing an application for paying tax based on the class diagram and description given below.
 * Method Description
 * PurchaseDetails
 * Purchase(String purchaseId, String paymentType)
 * Initialize the purchaseId and paymentType instance variables using the values passed to the constructor.
 * calculateTax(double price) 
 * Initialize the value of the taxPercentage instance variable based on the details given below.
 * 
 * Payment Type                 Tax%
 * Debit Card                   2
 * Credit Card                  3
 * For all other payment types  4
 * 
 * Calculate and return the total amount (including the tax amount) that needs to be paid.
 * Implement the getter and setter methods appropriately.
 * Seller
 * Seller(String location
 * Initialize the location instance variable using the value passed to the constructor.
 * calculateTax(double price) 
 * Initialize the value of taxPercentage instance variable based on the details given below.
 * 
 * Location                    Tax%
 * Middle east                  15
 * Europe                       25
 * Canada                       22
 * Japan                        12
 * 
 * Calculate and return the tax amount that needs to be paid
 * Implement the getter and setter methods appropriately.
 * Test the functionalities using the provided Tester class.
 * Sample Input and Output
 * 
 * Input
 * PurchaseDetails object
 * Instance variables        Values
 * purchaseId                "P1001"
 * paymentType               "credit Card"
 * 
 * calculateTax parameters
 * Parameter                 Values
 * price                     100
 * 
 * Output
 * Purchase Details
 * Total purchase amount: 103.0
 * Tax percentage: 3
 * 
 * Input 
 * seller object
 * Instance variables        Values
 * location                  "Canada"
 * 
 * calculateTax parameters
 * Parameter                 Values
 * price                     100
 * 
 * Output
 * Seller Details
 * Tax to be paid by the seller: 22.0
 * Tax percentage: 22.0
 */
interface Tax{
    double calculateTax(double price);
    double getTaxPercentage();
}
class PurchaseDetails implements Tax{
    private String purchaseId;
    private String paymentType;
    private double taxPercentage;
    public PurchaseDetails(String purchaseId, String paymentType) {
        this.purchaseId = purchaseId;
        this.paymentType = paymentType;
    }
    public double calculateTax(double price) {
        if(paymentType.equalsIgnoreCase("Debit Card")) {
            taxPercentage = 2;
        } else if(paymentType.equalsIgnoreCase("Credit Card")) {
            taxPercentage = 3;
        } else {
            taxPercentage = 4;
        }
        return price + (price * taxPercentage / 100);
    }
    public double getTaxPercentage() {
        return taxPercentage;
    }
}
class Seller implements Tax{
    private String location;
    private double taxPercentage;
    public Seller(String location) {
        this.location = location;
    }
    public double calculateTax(double price) {
        if(location.equalsIgnoreCase("Middle east")) {
            taxPercentage = 15;
        } else if(location.equalsIgnoreCase("Europe")) {
            taxPercentage = 25;
        } else if(location.equalsIgnoreCase("Canada")) {
            taxPercentage = 22;
        } else {
            taxPercentage = 12;
        }
        return price * taxPercentage / 100;
    }
    public double getTaxPercentage() {
        return taxPercentage;
    }
}
public class Exercise {
    public static void main(String args[]) {
		System.out.println("Purchase Details\n***************");
		PurchaseDetails purchaseDetails = new PurchaseDetails("P1001","Credit Card");
		System.out.println("Total purchase amount: " + Math.round(purchaseDetails.calculateTax(100)*100)/100.0);
		System.out.println("Tax percentage: "+purchaseDetails.getTaxPercentage());

        System.out.println("Seller Details\n***************");
		Seller seller = new Seller("Canada");
		System.out.println("Tax to be paid by the seller: " + Math.round(seller.calculateTax(100)*100)/100.0);
		System.out.println("Tax percentage: "+seller.getTaxPercentage());
	}
}
