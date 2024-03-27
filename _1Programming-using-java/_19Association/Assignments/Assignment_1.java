/**
 * A dance club is conducting auditions to admit interested candidates. You need to implement a 
 * Participant class for the dance club based on the class diagram and description given below.
 * Method Description
 * Partcipant(String name, long contactNumber, String city)
 * Initialize the name, contactNumber and city instance variables appropriately with the values passed to the constructor.
 * Generate the registrationId using the static variable counter. The value of registrationId should start from 'D10001' and the numerical part should be incremented by 1 for the subsequent values. Initialize the counter in static block.
 * Implement the appropriate getter and setter methods.
 * Test the functionalities using the provided Tester class. Create two or more Participant objects and validate that the values of the member variables are proper.
 * Sample Input and Output
 * For constructor
 * Input
 * For first Participant object
 */
class Participant{
    private String name;
    private long contactNumber;
    private String city;
    private String registrationId;
    private static int counter = 10000;
    static{
        counter++;
    }
    public Participant(String name, long contactNumber, String city){
        this.name = name;
        this.contactNumber = contactNumber;
        this.city = city;
        this.registrationId = "D" + counter;
    }
    public String getName(){
        return name;
    }
    public long getContactNumber(){
        return contactNumber;
    }
    public String getCity(){
        return city;
    }
    public String getRegistrationId(){
        return registrationId;
    }

}
public class Assignment_1 {
    public static void main(String[] args) {
        Participant p1 = new Participant("John", 9876543210L, "Bangalore");
        System.out.println("Name: " + p1.getName());
        System.out.println("Contact Number: " + p1.getContactNumber());
        System.out.println("City: " + p1.getCity());
        System.out.println("Registration Id: " + p1.getRegistrationId());
        Participant p2 = new Participant("Jane", 9876543211L, "Chennai");
        System.out.println("Name: " + p2.getName());
        System.out.println("Contact Number: " + p2.getContactNumber());
        System.out.println("City: " + p2.getCity());
        System.out.println("Registration Id: " + p2.getRegistrationId());
    }
}
