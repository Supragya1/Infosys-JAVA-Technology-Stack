/**
 * Implement a class Calculator with the method mentioned below. 
 * Methods - find Average(int num1, int num2, int num3) : double
 * Method Description
 * findAverage()
 * Calculate the average of three numbers
 * Return the average rounded off to two decimal digits
​ * Test the functionalities using the provided Tester class. 
 * Sample Input             Expected Output
 * 12 8  15                     11.67
 * 10 20 30                     20.00
 */
import java.util.Scanner;
class calculator{
    public double findAverage(int num1, int num2, int num3){
        double avg = (num1 + num2 + num3) / 3.0;
        return Math.round(avg * 100.0) / 100.0;
    }
}
public class Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        calculator c = new calculator();
        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = scan.nextInt();
        System.out.println("The average of the three numbers is: " + c.findAverage(num1, num2, num3));
        scan.close();
    }
}