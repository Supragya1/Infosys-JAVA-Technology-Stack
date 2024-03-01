/**
 * Create a new class Restaurant in the Java project SwiftFood with the instance variables and methods mentioned below.
 * Instance variables:  restaurantName, restaurantContact, restaurantAddress, restaurantRating
 * Methods: displayRestaurantDetails
 * Method Description
displayRestaurantDetails() 
Display the details of the restaurant (the values of the member variables)
Create an object of the Restaurant class, initialize the instance variables, 
and invoke the displayRestaurantDetails() method in the main() method of the Tester class. 
 */
class Restaurant {
    String restaurantName;
    String restaurantContact;
    String restaurantAddress;
    double restaurantRating;

    public void displayRestaurantDetails() {
        System.out.println("Restaurant Name: " + restaurantName);
        System.out.println("Restaurant Contact: " + restaurantContact);
        System.out.println("Restaurant Address: " + restaurantAddress);
        System.out.println("Restaurant Rating: " + restaurantRating);
    }
}
public class Assignment_2 {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.restaurantName = "Pizza Hut";
        restaurant.restaurantContact = "1234567890";
        restaurant.restaurantAddress = "123, ABC Street, XYZ City";
        restaurant.restaurantRating = 4.5;
        restaurant.displayRestaurantDetails();
    }
}
