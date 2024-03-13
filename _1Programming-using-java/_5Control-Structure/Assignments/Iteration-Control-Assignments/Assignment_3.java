/**
 * Implement a program to find out whether a number is divisible by the sum of its digits. 
 * Display appropriate messages.
 * Sample Input         Expected Output
 *    2250             2250 is divisible by sum of its digits
 *    123              123 is not divisible by sum of its digits
 */
import java.util.Scanner;
public class Assignment_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        int sum = 0;
        int x = num;
        while(x>0){
            int ld = x%10;
            sum += ld;
            x/=10;
        }
        if(num%sum==0){
            System.out.println(num + " is divisible by sum of its digits");
        } else {
            System.out.println(num + " is not divisible by sum of its digits");
        }
        scan.close();
    }
}
