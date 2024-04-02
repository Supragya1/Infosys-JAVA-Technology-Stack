/**
 * A dance club is conducting auditions to admit interested candidates. 
 * You need to implement a Participant class for the dance club based on the class diagram and description given below.
 * Method Description
 * Partcipant(String name, long contactNumber, String city)
 * Initialize the name, contactNumber and city instance variables appropriately with the values passed to the constructor.
 * Generate the registrationId using the static variable counter. The value of registrationId should start from 'D10001' 
 * and the numerical part should be incremented by 1 for the subsequent values. Initialize the counter in static block.
 * Implement the appropriate getter and setter methods.
 * Test the functionalities using the provided Tester class. Create two or more 
 * Participant objects and validate that the values of the member variables are proper.
 * Sample Input and Output
 * For constructor
 * Input
 * For first Participant object
 * Parameters           Values
 * name                 Franklin
 * contactNumber        9876543210
 * city                 Bangalore
 * For second Participant object
 * name                 George
 * contactNumber        9876543211
 * city                 Chennai
 * 
 * Output
 * Hi! Franklin, your registration id is D10001
 * Hi! George, your registration id is D10002
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
public class Assignment_2 {
    public static void main(String[] args) {
        Participant p1 = new Participant("Franklin", 9876543210L, "Bangalore");
        System.out.println("Hi! " + p1.getName() + ", your registration id is " + p1.getRegistrationId());
        Participant p2 = new Participant("George", 9876543211L, "Chennai");
        System.out.println("Hi! " + p2.getName() + ", your registration id is " + p2.getRegistrationId());
    }
}
