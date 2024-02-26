/**
 * Create a new class Food in the Java project SwiftFood with the details given below.
 * Attributes
 * foodName - String
 * cuisine - String
 * foodType - String
 * quantityAvailable - int
 * unitPrice - double
 */
class Food{
    String foodName;
    String cuisine;
    String foodType;
    int quantityAvailable;
    double unitPrice;
    public void display(){
        System.out.println("Food Name: "+foodName);
        System.out.println("Cuisine: "+cuisine);
        System.out.println("Food Type: "+foodType);
        System.out.println("Quantity Available: "+quantityAvailable);
        System.out.println("Unit Price: "+unitPrice);
    }
}
public class Exercise {
    public static void main(String[] args) {
        Food food = new Food();
        food.foodName = "Biryani";
        food.cuisine = "Indian";
        food.foodType = "Non-Veg";
        food.quantityAvailable = 10;
        food.unitPrice = 200.00;
        food.display();
    }
}
