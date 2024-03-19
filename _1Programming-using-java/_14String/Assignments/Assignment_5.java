/**
 * Complete the removeDuplicatesandSpaces() method given in the Tester class.
 * Method Description
 * removeDuplicatesandSpaces(String str)
 * Remove all the duplicate characters and white spaces from the string passed to the method and return the modified string.
 * Test the functionalities using the main() method of the Tester class. 
 *      Sample Input                Expected Output
 * object oriented programming      objectrinprgam
 * hello world                      helowrd
 */
public class Assignment_5{
    public static String removeDuplicatesandSpaces(String str){
        StringBuilder result = new StringBuilder();   
        boolean[] visited = new boolean[256]; 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!visited[ch] && ch != ' ') {
                visited[ch] = true;
                result.append(ch);
            }
        }
        return result.toString();
	}
    public static String removeDuplicatesandSpaces2(String str){
        char arr[] = str.toCharArray();
        int len = arr.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
            if(arr[i]==arr[j]||arr[j]==' '){
                for(int k=j;k<len-1;k++){
                    arr[k]=arr[k+1];
                }
                len--;
                j--;
            }
            }
        }
        String str1 = new String(arr,0,len);
        return str1;
	}
        public static void main(String args[]){
                String str = "object oriented programming";
                System.out.println(removeDuplicatesandSpaces(str));
                System.out.println(removeDuplicatesandSpaces2(str));
    }
}