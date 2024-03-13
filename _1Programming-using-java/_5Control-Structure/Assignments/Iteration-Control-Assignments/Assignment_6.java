/**Implement a program to check whether a given number is a lucky number.
 * A lucky number is a number whose sum of squares of every even-positioned digit 
 * (starting from the second position) is a multiple of 9.
 * E.g. - 1623 = 62+32 = 45 is a multiple of 9 and hence is a lucky number. 
 * Sample Input             Expected Output
 *   1623                1623 is a lucky number
 *    15                 15 is not a lucky number
 */
import java.util.Scanner;
public class Assignment_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        int x = num;
        int sum = 0;
        while (x>0) {
            int count = (int)Math.log10(x)+1;
            if(count%2==0){
                int ld = x%10;
                sum += ld*ld;
            }
            x/=10;
        }
        if(sum%9==0 && sum!=0){
            System.out.println(num + " is a lucky number");
        } else {
            System.out.println(num + " is not a lucky number");
        }   
        scan.close();
    }
}
