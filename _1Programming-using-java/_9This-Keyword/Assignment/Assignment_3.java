/**
 * Implement a class Calculator with the instance variable and method mentioned below. 
 * Instance variable: num int
 * Method: sumOfDigits(int num)
 * Method Description
 * sumOfDigits()
 * Calculate and return the sum of the digits of the num member variable
 * Test the functionalities using the provided Tester class. 
 * Sample Input                 Expected Output
 *   123                        Sum of digits: 6
 *   6547                       Sum of digits: 22
 */
import java.util.Scanner;
class Calculator {
private int num;
public int sum_of_digits(){
    int sum =0;
    while(num>0){
    int ld = num%10;
    num/=10;
    sum+=ld;
    }
    return sum;
}
public int getNum(){
    return num;
}
public void setNum(int num){
    this.num = num;
}
}

class Assignment_3 {

	public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
		Calculator calculator = new Calculator();
		int num= scan.nextInt();
		calculator.setNum(num);
		System.out.println(calculator.sum_of_digits());

	}
}
