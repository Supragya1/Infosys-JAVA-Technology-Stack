/**
 * Implement a program to calculate the Simple Interest by using the formula given below and display 
 * the calculated Simple Interest.
 * Simple Interest = (principal*rate of interest*time)/100 
 *          Sample Input                          Expected Output
 * Principal: 1000,rate: 10,time: 5                     2500.0
 * Principal: 3250,rate: 7,time: 3                    682.5
 */
import java.util.Scanner;
public class Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Principal amount: ");
        int principal = scan.nextInt();
        System.out.println("Enter the rate of interest: ");
        int rate = scan.nextInt();
        System.out.println("Enter the time: ");
        int time = scan.nextInt();
        double simpleInterest = (principal*rate*time)/100;
        System.out.println("Simple Interest: "+simpleInterest);
    }
}
