/**
 * Complete the findHighestOccurrence() method given in the Tester class.
 * Method Description
 * findHighestOccurrence(String str)
 * Find the count of the highest occurring character in the string passed to the method and return the count
 * Test the functionalities using the main() method of the Tester class.
 * Input            Output
 * success            3 
 * associated         2
 */
class Tester {

	public static int findHighestOccurrence(String str){
        int count =0;
        int ch[] = new int[256];
		for(int i=0;i<str.length();i++){
            ch[str.charAt(i)]++;
		}
		for(int i=0;i<ch.length;i++){
            if(ch[i]>count){
                count=ch[i];
            }
		}
        return count;
	}
	
	public static void main(String args[]){
        String str = "success";
        System.out.println(findHighestOccurrence(str));
	}
}