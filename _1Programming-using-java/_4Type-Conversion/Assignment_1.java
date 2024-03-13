/**
 * Implement a program to find the area of a circle by using the formula given below and display the calculated area. 
 * Area = pi*radius*radius 
 * The value of pi is 3.14.
 * Sample Input             Expected Output
 * radius = 5               Area of the circle = 78.5
 * radius = 10              Area of the circle = 314.0
 */
import java.util.Scanner;
public class Assignment_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = scan.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("Area of the circle = " + area);
        scan.close();
    }
}
