/**
 * Implement a program to calculate the factorial of a given number.
 * Sample Input         Expected Output
 *      5                      120
 *     6                       720
 */
import java.util.Scanner;
public class Iteration_Exercise_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scan.nextInt();
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        System.out.println("The factorial of "+n+" is "+fact);
    }
}
