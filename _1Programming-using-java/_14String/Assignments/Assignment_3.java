/**
 * Complete the reverseEachWord() method given in the Tester class.
 * Method Description
 * reverseEachWord(String str)
 * Reverse each word in the string passed to the method without changing the order of the words and return the modified string.
 * Test the functionalities using the main() method of the Tester class.
 * Note: There should not be any extra blank/white space(s) in the output string.
 * Sample Input                 Expected Output
 * all cows eat grass           lla swoc tae ssarg
 * I love programming           I evol gnimmargorp
 */
public class Assignment_3 {
    public static String reverseEachWord(String str){
        String [] words = str.split(" ");
        for(int i=0;i<words.length;i++){
            char [] wordchar = words[i].toCharArray();
            for(int j=0;j<wordchar.length/2;j++){
                char temp = wordchar[j];
                wordchar[j] = wordchar[wordchar.length-1-j];
                wordchar[wordchar.length-1-j] = temp;
            }
            words[i] = String.valueOf(wordchar);
        }
        return String.join(" ",words);
	}
    public static void main(String args[]){
        String str = "all cows eat grass";
        System.out.println(reverseEachWord(str));
	}
}
