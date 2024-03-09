/**
 * Complete the removeWhiteSpaces() method given in the Tester class.
 * Method Description
 * removeWhiteSpaces(String str)
 * Remove all the white spaces from the string passed to the method and return the modified string.
 * Test the functionalities using the main() method of the Tester class. 
 *    Sample Input             Expected Output
 * "Hello How are you"        "HelloHowareyou"
 * "J    ava pro   gramming"  "Javaprogramming"
 */
public class Exercise{

    public static String removeWhiteSpaces(String str){ 
		str = str.replaceAll("\\s", "");
        return str;
	}
	
	public static void main(String args[]){
		String str = "Hello   How are you   ";
		str = removeWhiteSpaces(str);
		System.out.println(str);
	}
}