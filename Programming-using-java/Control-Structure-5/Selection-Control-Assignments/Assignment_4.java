/**
 * Food Corner home delivers vegetarian and non-vegetarian meals to its customers based on the order.
A vegetarian combo costs $12 per plate and a non-vegetarian combo costs $15 per plate. 
Apart from the cost per plate of food, customers are also charged for home delivery based on the distance in kms 
from the restaurant to the delivery point. The delivery charges are as mentioned below:
Distance  Delivery charge (per km)
0-3 kms         $0
4-6 kms         $1
Remaining kms   $2
Given the type of food, quantity (no. of plates) and the distance in kms from the restaurant to the delivery point, 
implement a program to calculate the final bill amount to be paid by a customer.
The below information must be used to check the validity of the data provided by the customer: 
* Type of food must be 'V' for vegetarian and 'N' for non-vegetarian.
* Distance in kms must be greater than 0.
* Quantity ordered should be minimum 1.
If any of the input is invalid, the bill amount should be displayed as -1.
Sample Input                                    Expected Output
Food Type:   Order Quantity:   Distance in kms:   
    N              2                  3                 30
    V              1                  7                 17
 */
import java.util.Scanner;
public class Assignment_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the type of food (V/N)");
        char foodType = scan.next().charAt(0);
        System.out.println("Enter the order quantity");
        int quantity = scan.nextInt();
        System.out.println("Enter the distance in kms");
        int distance = scan.nextInt();
        int billAmount = 0;
        if(Character.toUpperCase(foodType) == 'V'){
            billAmount = quantity * 12;
        }
        else if(Character.toUpperCase(foodType) == 'N'){
            billAmount = quantity * 15;
        }
        else{
            billAmount = -1;
        }
        if(distance<=3){
            billAmount +=0;
        }
        else if(distance>3 && distance<=6){
            billAmount += 1*(distance-3);
        }
        else if(distance>6){
            billAmount += 3+2*(distance-6);
        }
        else{
            billAmount = -1;
        }
        System.out.println("Your bill amount is: "+billAmount);
    }
}
