/**
 * Implement the method findNumbers accepting two numbers num1 and num2 based on the conditions given below:
 * Validate that num1 should be less than num2
 * If the validations are successful populate all the 2 digit positive numbers between num1 and num2 into the provided
 *  numbers array if sum of the digits of the number is a multiple of 3
 * number is a multiple of 5
 * Return the numbers array
 * Test the functionalities using the main method of the Tester class.
 * Sample Input                 Expected Output
 * num1 = 10, num2 = 30          {15,30,0,0,0,0}
 * num1 = -20, num2 = 30         {15,30,0,0,0,0}
 * num1 = 1, num2 = 9            {0,0,0,0,0,0}
 * num1 = -20, num2 = -4         {0,0,0,0,0,0}
 */
public class Assignment_5{

	public static int[] findNumbers(int num1, int num2) {
		int[] numbers = new int[6];
		int j =0; 
		if(num1<num2){
		    for(int i=num1;i<=num2;i++){
		        if(i<=99&&i>=10){
		        if(i%5==0&&sum(i)%3==0){
		            numbers[j]=i;
		            j++;
		        }
		        if(j>6){
		            break;
		        }
		        }
		    }
		}
		return numbers;
	}
	public static int sum(int n) {
		int sum=0;
		while(n!=0){
		    int ld=n%10;
		    sum+=ld;
		    n/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;

		int[] numbers = findNumbers(num1, num2);
		if (numbers[0] == 0) {
			System.out.println("There is no such number!");
		} else {
			for (int index = 0; index <= numbers.length - 1; index++) {
				if (numbers[index] == 0) {
					break;
				}
				System.out.println(numbers[index]);
			}
		}

	}
}