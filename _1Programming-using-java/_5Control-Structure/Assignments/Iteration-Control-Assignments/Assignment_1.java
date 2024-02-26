/**
 * Implement a program to check whether a given number is a palindrome.
 * Palindrome is a sequence that reads the same backwards as forwards.
 * E.g.: 121, 1331, 2332, 78900987, 123456654321,  etc.
 * Sample Input         Sample Output
 *    1331            1331 is a palindrome
 *    46763          46763 is not a palindrome
 */
import java.util.Scanner;
class Assignment_1 {
	public static void main(String[] args) {
		// Implement your code here
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check for palindrome: ");
		int num = 46763;
		int reverse = 0;
		int n= num;
		while(n>0){
		int ld = n%10;
		reverse = reverse*10+ld;
		n/=10;
		}
		if(num==reverse){
		System.out.printf("%d is a palindrome",num);
		}
		else{
		System.out.printf("%d is not a palindrome",num);
		}
	}
}

