/**
 * Implement a program to find out whether a number is a seed of another number.
 * A number X is said to be a seed of number Y if multiplying X by its every digit equates to Y.
 * E.g.: 123 is a seed of 738 as 123*1*2*3 = 738
 * Sample Input         Expected Output
 *  123, 738            123 is a seed of 738
 *  45,1000             45 is not a seed of 1000
 */
import java.util.Scanner;
public class Assignment_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the seed");
        int seed = scan.nextInt();
        System.out.println("Enter the number");
        int num = scan.nextInt();
        int x = seed;
        int mul=1;
        while(x>0){
            int ld = x%10;
            mul *= ld;
            x/=10;
        }
        mul *= seed;
        if(mul==num){
            System.out.println(seed + " is a seed of " + num);
        } else {
            System.out.println(seed + " is not a seed of " + num);
        }
        scan.close();
    }
}
