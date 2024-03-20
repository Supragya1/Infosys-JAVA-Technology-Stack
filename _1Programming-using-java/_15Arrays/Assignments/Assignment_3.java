/**
 * Find the next 15 leap years from the year passed as parameter to the findLeapYears() method. 
 * Include the year passed as parameter if it is a leap year. Implement the logic inside 
 * findLeapYears() method and return an int array containing all the leap years.
 * Test the functionalities using the main method of the Tester class.
 * [Hint: Any year which is divisible by 4 and not by 100 are leap years. Otherwise, any year 
 * which is divisible by 400 is also a leap year]
 * Sample Input                                         Output
 * 2000                     2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, 2048, 2052, 2056
 * 1900                     1904, 1908, 1912, 1916, 1920, 1924, 1928, 1932, 1936, 1940, 1944, 1948, 1952, 1956, 1960
 */
public class Assignment_3{
    
    public static int[] findLeapYears(int year){
        int start=year;
        int years[]=new int[15];
        for(int i=0;i<15;){
            if(leapYear(start)){
                years[i]=start;
                i++;
            }
            start++;
        }
        return years;
    }
    public static boolean leapYear(int year){
        boolean ans= false;
        if(year%400==0){
            ans=true;
        }
        else if(year%100==0){
            ans=false;
        }
        else if(year%4==0){
            ans=true;
        }
        return ans;
    }
    public static void main(String[] args) {
        int year = 2001;
        int[] leapYears;
        leapYears=findLeapYears(year);
        for ( int index = 0; index<leapYears.length; index++ ) {
            System.out.println(leapYears[index]);
        }
    }
} 