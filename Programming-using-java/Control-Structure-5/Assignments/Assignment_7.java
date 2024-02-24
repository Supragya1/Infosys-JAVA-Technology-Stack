/**
 * Implement a program to generate and display the next date of a given date.
 * The date will be provided as day, month and year as shown in the below table.
 * The output should be displayed in the format: day-month-year.
 * Assumption: The input will always be a valid date.
 * Sample Input         Sample Output
 *   Day 1
 *   Month 9               2-9-2015       
 *   Year 15
 */
import java.util.Scanner;
public class Assignment_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the day: ");
        int day = scan.nextInt();
        System.out.println("Enter the month: ");
        int month = scan.nextInt();
        System.out.println("Enter the year: ");
        int year = scan.nextInt();
        if(day < 1 || day > 31 || month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid date");
            return;
        }
        if(day == 31 && month == 12) {
            day = 1;
            month = 1;
            year++;
        } else if(day == 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
            day = 1;
            month++;
        } else if(day == 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            day = 1;
            month++;
        } else if(day == 28 && month == 2) {
            if(year % 4 == 0) {
                if(year % 100 == 0) {
                    if(year % 400 == 0) {
                        day++;
                    } else {
                        day = 1;
                        month++;
                    }
                } else {
                    day++;
                }
            } else {
                day = 1;
                month++;
            }
        } else {
            day++;
        }
        System.out.println(day + "-" + month + "-" + year);
    }
}
