package leetcode75.ArraysString.ReverseVowelsofaString345;

public class Solution {


    static String reverseVowels(String s) {

        char[] arr =s.toCharArray();
        int left =0;
        int right = s.length()-1;
        while (left<right){
            if (isVowel(s.charAt(left))&&isVowel(s.charAt(right))){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right]=temp;
                left++;
                right--;
            } else if (isVowel(arr[left])) {
                right--;
            } else if (isVowel(arr[right])) {
                left++;
            }else {
                left++;
                right--;
            }


        }
        return new String(arr);
    }
    static boolean isVowel(char c){
        if (c == 'a'||c=='A'){
            return true;
        }else if (c=='e'||c=='E'){
            return true;
        }
        else if (c=='i'||c=='I'){
            return true;
        }
        else if (c=='o'||c=='O'){
            return true;
        }
        else if (c=='u'||c=='U'){
            return true;
        }
        return false;


    }
    public static void main(String[] args) {

        String s = "IceCreAm";
        System.out.println(reverseVowels(s));


    }
}
