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