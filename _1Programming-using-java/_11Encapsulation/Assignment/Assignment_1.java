/**
 * You have already created the Order and Food classes in the SwiftFood project. 
 * Make necessary changes to the Order and Food classes by making all the instance variables 
 * private and adding getter and setter methods for the instance variables.
 */
class Food {
    private String name;
    private double price;
    private int quantity;

    public Food(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
public class Assignment_1 {
    public static void main(String[] args) {
        Food food = new Food("Pizza", 200, 2);
        System.out.println("Name: " + food.getName());
        System.out.println("Price: " + food.getPrice());
        System.out.println("Quantity: " + food.getQuantity());
    }
}