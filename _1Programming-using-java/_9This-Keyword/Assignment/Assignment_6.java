/**
 * Modify the Restaurant class created before and add the below mentioned constructor.
 * Methods: Restaurant(String Name, long restaurantContact, String restaurantAddress, float rating)
 * Method Description
 * Restaurant(String name, long restaurantContact, String restaurantAddress, float rating)
 * Initialize the instance variables appropriately with the values passed to the constructor.
 * Create an object of the Restaurant class and invoke the displayRestaurantDetails() method in the main() method of the Tester class. 
 * Sample Output
 * Restraunt Details
 * **********************
 * Restraunt Name : McDonalds
 * Restraunt Rating : 4.5
 * Restraunt Contact : 9876543210
 * Restraunt Address : 123, MG Road, Bangalore
 */ 
class Restaurant{
    private String Name;
    private long restaurantContact;
    private String restaurantAddress;
    private float rating;
    public Restaurant(String Name, long restaurantContact, String restaurantAddress, float rating){
        this.Name = Name;
        this.restaurantContact = restaurantContact;
        this.restaurantAddress = restaurantAddress;
        this.rating = rating;
    }
    public void displayRestaurantDetails(){
        System.out.println("Restraunt Details");
        System.out.println("**********************");
        System.out.println("Restraunt Name : "+Name);
        System.out.println("Restraunt Rating : "+rating);
        System.out.println("Restraunt Contact : "+restaurantContact);
        System.out.println("Restraunt Address : "+restaurantAddress);
    }
}
public class Assignment_6 {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("McDonalds",9876543210L,"123, MG Road, Bangalore",4.5f);
        restaurant.displayRestaurantDetails();
    }
}
