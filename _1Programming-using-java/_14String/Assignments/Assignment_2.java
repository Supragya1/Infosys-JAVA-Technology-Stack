/**
 * Complete the checkPalindrome() method given in the Tester class.
 * Method Description
 * checkPalindrome(String str)
 * Check whether the string passed to the method is a palindrome or not. 
 * Return true if the string is palindrome, else return false.
 * Test the functionalities using the main() method of the Tester class. 
 * Sample Input                 Expected Output
 *    radar                         true 
 *    apple                         false
 */
public class Assignment_2{
    public static boolean checkPalindrome(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
	}
	
	public static void main(String args[]){
		String str = "radar";
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}
}