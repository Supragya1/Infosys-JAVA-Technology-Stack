/**
 * Implement a program to find and display the least common multiple (LCM) of two whole numbers.
 * Least Common Multiple (LCM) of two numbers, num1 and num2 is the smallest positive number 
 * that is divisible by both num1 and num2.
 * Sample Input             Expected Output
 *  4 6                     LCM of 4 and 6 is 12
 *  5 10                    LCM of 5 and 10 is 10
 *  7 9                     LCM of 7 and 9 is 63
 */
import java.util.Scanner;
public class Assignment_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first numbers");
        int num1 = scan.nextInt();
        System.out.println("Enter the second numbers");
        int num2 = scan.nextInt();
        int lcm = Math.max(num1, num2);
        while(true){
            if(lcm%num1==0 && lcm%num2==0){
                break;
            }
            lcm++;
        }
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
        scan.close();
    }
}
