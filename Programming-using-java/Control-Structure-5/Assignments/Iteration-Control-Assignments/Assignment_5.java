/**
 * Implement a program to check whether a given number is an Armstrong number.
 * An Armstrong number is an n-digit number that is equal to the sum of the nth powers of its individual digits.
 * E.g.: 371 is an Armstrong number as 33 + 73 + 13=371
 * 1634 is an Armstrong number as 14 + 64 + 34+ 44=1634
 * Sample Input             Expected Output
 *     371              371 is an Armstrong number
 *    1635             1634 is not an Armstrong number
 */
import java.util.Scanner;
public class Assignment_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
		int x =num;
        int sum =0;
        while(x>0){
            int ld = x%10; 
            sum += Math.pow(ld,(int)Math.log10(num)+1);
            x/=10;
        }
        if(sum==num){
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
