/**
 * Find out all the possible permutations of the characters in the string passed to the method findPermutations(). 
 * Implement the logic inside findPermutations() method and return a string array containing all the permutations.
 * Assumption: The length of the string will be 3.
 * E.g.: For the string "abc", the permutations will be abc, acb, bac, bca, cab and cba.
 * Sample Input         Expected Output
 * abc                  [abc, acb, bac, bca, cab, cba]
 * aad                  [aad, ada, daa]
 */
public class Assignment_7 {
    public static String[] findPermutations(String str){
        int n = str.length();
        int l=0;
        String arr[]=new String[6];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i!=j&&j!=k&&k!=i){
                        arr[l]= ""+str.charAt(i)+str.charAt(j)+str.charAt(k);
                        l++;
                    }
                }
            }
        }
        l=0;
        String temp[] = new String[6];
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    flag=true;
                }
            }
            if(flag==false){
                temp[l]=arr[i];
                l++;
            }
            flag=false;
        }
        return temp;
    }
    
    public static void main(String args[]){
        String str = "aaa";
        String permutations[] = findPermutations(str);
        for(String permutation: permutations){
            if (permutation!=null)
                System.out.println(permutation);
        }
    }
}


