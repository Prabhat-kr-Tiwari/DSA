package leetcode75.ArraysString.ReverseWordsinaString;

public class ReverseWordsinaString {


    static String reverseWords(String s) {

        char[] stringArray = s.toCharArray();
        StringBuilder  sb = new StringBuilder();
        StringBuilder currString = new StringBuilder();

        for (int i = stringArray.length - 1; i >= 0; i--) {
            if (stringArray[i] != ' ') {
                currString.append(stringArray[i]);
            } else {
                if (!currString.isEmpty()) {
                    sb.append(" ");
                    sb.append(reverseCharacter(currString.toString()));
                    currString.setLength(0);
                }
            }
        }
        if (!currString.isEmpty()) {
            sb.append(" ");
            sb.append(reverseCharacter(currString.toString()));
        }

        return sb.toString().trim();

    }
   static String reverseCharacter(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i>=0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String  s = "the sky is blue";
//        Output: "blue is sky the"
        String s3 = "a good   example";


//        System.out.println(reverseWords(s));
        System.out.println(s3);
        System.out.println(reverseWords(s3));
    }
}
