/**
 * You have x number of $5 notes and y number of $1 notes. You want to purchase an item for amount z. 
 * The shopkeeper wants you to provide exact change. You want to pay using a minimum number of notes. 
 * How many $5 notes and $1 notes will you use?
 * Implement a program to find out how many $5 notes and $1 notes will be used. 
 * If an exact change is not possible, then display -1.
 *     Sample Input                    Expected Output
 * $1 notes available: 2              $1 notes needed: 1
 * $5 notes available: 4              $5 notes needed: 4  
 * Purchase Amount: 21  
 * 
 * $1 notes available: 3        
 * $5 notes available: 3                    -1
 * Purchase Amount: 19
 */
import java.util.Scanner;
public class Assignment_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of $1 notes available: ");
        int oneNotes = scan.nextInt();
        System.out.println("Enter the number of $5 notes available: ");
        int fiveNotes = scan.nextInt();
        System.out.println("Enter the purchase amount: ");
        int purchaseAmount = scan.nextInt();
        int five_count = 0;
        int one_count = 0;
        if(purchaseAmount>=5){
            five_count = purchaseAmount/5;
            purchaseAmount %= 5;
        }
        if(purchaseAmount>0){
            one_count = purchaseAmount;
        }
        if(five_count>fiveNotes || one_count>oneNotes){
            System.out.println("-1");
        }
        else {
            System.out.println("Number of $1 notes needed: "+one_count);
            System.out.println("Number of $5 notes needed: "+five_count);
        }
    }
}
