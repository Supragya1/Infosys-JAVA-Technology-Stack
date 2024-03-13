/**Implement a program to find the number of rabbits and chickens in a farm. Given the number of heads and legs of 
 * the chickens and rabbits in a farm, identify and display the number of chickens and rabbits in the farm.
 * If the given input cannot make a valid number of rabbits and chickens, then display an appropriate message.
 *      Sample Input                Expected Output
 *   heads=150, legs=500          Chickens=50, Rabbits=100
 *   heads=3, legs=11      The number of rabbits and chickens cannot be determined
  */
import java.util.Scanner;
public class Assignment_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of heads");
        int heads = scan.nextInt();
        System.out.println("Enter the number of legs");
        int legs = scan.nextInt();
        int rabbits = 0;
        int chickens = 0;
        if (heads < 1 ||  legs < 1 || legs%2 != 0) {
            System.out.println("The number of rabbits and chickens cannot be determined");
        } else {
            rabbits = (legs - (2 * heads)) / 2;
            chickens = heads - rabbits;
            if(rabbits < 0 || chickens < 0) {
                System.out.println("The number of rabbits and chickens cannot be determined");
            } else {
                System.out.println("Chickens=" + chickens + ", Rabbits=" + rabbits);
            }
        }
        scan.close();
    }
}