/**
 * Quadratic equation is an equation with degree 2 in the form of ax2 +bx + c = 0 where a, b and c are the coefficients.
Implement a program to solve a quadratic equation.
Find the discriminant value using the formula given below.
discriminant = b2 - 4ac
If the discriminant is 0, the values of both the roots will be same. Display the value of the root.
If the discriminant is greater than 0, the roots will be unequal real roots. Display the values of both the roots.
If the discriminant is less than 0, there will be no real roots. Display the message "The equation has no real root"
Use the formula given below to find the roots of a quadratic equation.
x = (-b ± discriminant)/2a
Sample Input     Expected Output
a=1 b=4 c=4       The root is -2.0
a=1 b=4 c=6       The equation has no real root
a=1 b=5 c=6       The roots are -2.0 and -3.0
 */
import java.util.Scanner;
public class Assignment_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of a");
        float a = scan.nextFloat();
        System.out.println("Enter the value of b");
        float b = scan.nextFloat();
        System.out.println("Enter the value of c");
        float c = scan.nextFloat();
        float discriminant = (b * b) - (4 * a * c);
        if (discriminant == 0) {
            float root = (-b) / (2 * a);
            System.out.println("The root is " + root);
        } else if (discriminant > 0) {
            float root1 = (-b + (float) Math.sqrt(discriminant)) / (2 * a);
            float root2 = (-b - (float) Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else {
            System.out.println("The equation has no real root");
        } 

    }
}
