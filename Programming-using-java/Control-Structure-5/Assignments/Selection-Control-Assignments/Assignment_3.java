/**
 * Implement a program to calculate the product of three positive integer values. 
 * However, if one of the integers is 7, consider only the values to the right of 7 for calculation. 
 * If 7 is the last integer, then display -1.
 * Note: Only one of the three values can be 7.
 * Sample Input     Expected Output
 * 1 5 3               15
 * 3 7 8               8
 * 7 2 9               18
 * 2 6 7               -1
 */
import java.util.Scanner;
public class Assignment_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scan.nextInt();
        System.out.println("Enter the second number");
        int b = scan.nextInt();
        System.out.println("Enter the third number");
        int c = scan.nextInt();
        if (a == 7) {
            System.out.println(b * c);
        } else if (b == 7) {
            System.out.println(c);
        } else if (c == 7) {
            System.out.println(-1);
        } else {
            System.out.println(a * b * c);
        }
    }
}
