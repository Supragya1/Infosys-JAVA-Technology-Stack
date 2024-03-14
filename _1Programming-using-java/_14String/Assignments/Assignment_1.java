/**
 * Complete the moveSpecialCharacters() method given in the Tester class.
 * Method Description
 * moveSpecialCharacters(String str)
 * Move all the special characters present in the string passed to the method to the end of the string and return the modified string.
 * Note: Assume that the input string does not have any space.
 * Test the functionalities using the main() method of the Tester class. 
 * Sample Input                 Expected Output
 * He@#$llo!*&                  Hello@#$!*&
 * %$Wel*&come!                Welcome%$!*&
 */
public class Assignment_1{
    public static String moveSpecialCharacters(String str){
        StringBuilder letter = new StringBuilder();
        StringBuilder special = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(Character.isLetterOrDigit(str.charAt(i))){
                letter.append(str.charAt(i));
            }
            else{
                special.append(str.charAt(i));
            }
        }
        str= letter.toString() + special.toString();
        return str;
	}
	
	public static void main(String args[]){
        String str = "He@#$llo!*&";
        System.out.println(moveSpecialCharacters(str));
	}
	
}