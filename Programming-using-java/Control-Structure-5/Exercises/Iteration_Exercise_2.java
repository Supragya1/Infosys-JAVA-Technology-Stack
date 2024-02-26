/**
 * Implement a program to display the geometric sequence as given below for a given value n, 
 * where n is the number of elements in the sequence.
 * 1, 2, 4, 8, 16, 32, 64, ......, 1024
 * Sample Input         Expected Output
 *     5                   1, 2, 4, 8, 16
 *     8                   1, 2, 4, 8, 16, 32, 64, 128
 */
import java.util.Scanner;
public class Iteration_Exercise_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scan.nextInt();
        int num = 1;
        for(int i = 1; i <= n; i++){
            System.out.print(num+" ");
            num = num * 2;
        }
    }
}
