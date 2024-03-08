/**
 * Implement the class MovieTicket with the instance variables and methods mentioned below.
 * Instance variables:  movieid:int , noOfSeats:int , costPerTicket:double;

 * Methods: MovieTicket(int movieid, int noOfSeats),calculateTotalAmount():double
 * getMovieid():int, setMovieid(int):void, getNoOfSeats():int, setNoOfSeats(int):void, 
 * getCostPerTicket():double, setCostPerTicket(double):void
 * 
 * Method Description
 * MovieTicket (int movieId, int noOfSeats)
 * Initialize the member variables movieId and noOfSeats appropriately with the values passed to the constructor.
 * 
 * calculateTotalAmount()
 * Calculate the total amount to be paid based on the costPerTicket and noOfSeats by applying a 2% tax on the total amount.
 * The costPerTicket for the movies are provided in the below table. Set the value of costPerTicket instance 
 * variable appropriately.
 * 
 * MovieId      CostPerTicket
 * 111              $7
 * 112              $8
 * 113              $8.5
 * Note: Return the total amount calculated after rounding off using the Math.round(double a) method.     
 * Test the functionalities using the provided Tester class.                                                                                              
 * Sample Input             Expected Output
 *     112,3         Total Amount for booking : $24.0
 *     114,3         Sorry! Please enter a valid movie ID and number of seats
 */
class MovieTicket{
    private int movieid;
    private int noOfSeats;
    private double costPerTicket;

    public MovieTicket(int movieid, int noOfSeats) {
        this.movieid = movieid;
        this.noOfSeats = noOfSeats;
        if (movieid==111)
            costPerTicket = 7;
        else if (movieid==112)
            costPerTicket = 8;
        else if (movieid==113)
            costPerTicket = 8.5;
    }

    public double calculateTotalAmount() {
        if (movieid==111 || movieid==112 || movieid==113)
            return Math.round((costPerTicket*noOfSeats*1.02)*100.0)/100.0;
        else
            return 0;
    }

    public int getMovieid() {
        return movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public double getCostPerTicket() {
        return costPerTicket;
    }

    public void setCostPerTicket(double costPerTicket) {
        this.costPerTicket = costPerTicket;
    }

}
public class Assignment_2 {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(112, 3);
        double amount = movieTicket.calculateTotalAmount();
        if (amount==0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + amount);
    }
}
