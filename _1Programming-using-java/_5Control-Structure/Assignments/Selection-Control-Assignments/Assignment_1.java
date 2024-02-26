/**
 * Implement a program to display the sum of two given numbers if the numbers are same. 
 * If the numbers are not same, display the double of the sum.
 * Sample Input     Expected Output 
 * 5,5              10
 * 5,6              22
 */
import java.util.Scanner;
class Assignment_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
		int a = scan.nextInt();
		System.out.println("Enter the second number");
        int b = scan.nextInt();
		if(a==b){
		System.out.println(a+b);
		}
		else{
		System.out.println((a+b)*2);
		}
	}
}

