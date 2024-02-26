/**
 * Implement a program to find and display the maximum number out of the given three numbers.
 * Sample Input         Expected Output
 *  3 4 1                   4
 *  4 4 1                   4
 */
import java.util.Scanner;
public class Selection_Exercise_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scan.nextInt();
        System.out.println("Enter the second number: ");
        int b = scan.nextInt();
        System.out.println("Enter the third number: ");
        int c = scan.nextInt();
        if(a > b && a > c){
            System.out.println(a+" is the maximum number");
        }
        else if(b > c){
            System.out.println(b+" is the maximum number");
        }
        else{
            System.out.println(c+" is the maximum number");
        }
    }
}
