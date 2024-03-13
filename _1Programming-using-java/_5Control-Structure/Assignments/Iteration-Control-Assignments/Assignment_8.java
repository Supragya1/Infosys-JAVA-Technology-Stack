/**
 * Implement a program to display the below pattern.
*****
****
***
**
*
 */
import java.util.Scanner;
public class Assignment_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        scan.close();
    }
}
