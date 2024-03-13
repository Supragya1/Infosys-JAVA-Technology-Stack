/**
 * Implement a program to convert temperature from Fahrenheit to Celsius degree by using the formula 
 * given below and display the converted value. 
 * C = ((F-32)/9)*5 where, C represents temperature in Celsius and F represents temperature in Fahrenheit.
 * Sample Input             Expected Output
 * Fahrenheit = 32          Celsius = 0.0
 * Fahrenheit = 50          Celsius = 10.0
 */
import java.util.Scanner;
public class Assignment_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scan.nextDouble();
        double celsius = ((fahrenheit - 32) / 9) * 5;
        System.out.println("Celsius = " + celsius);
        scan.close();
    }
}
