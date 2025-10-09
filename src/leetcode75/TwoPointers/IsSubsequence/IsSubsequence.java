package leetcode75.TwoPointers.IsSubsequence;

import java.util.ArrayList;
import java.util.List;

public class IsSubsequence {

    static boolean isSubsequence(String s, String t) {


        List<String> sub= new ArrayList<>();
        subsequence(t,sub);
        return sub.contains(s);

    }
    static void utilubseqnece(String s,int index,String currentString ,int size,List<String > sub){

        if (index==size){
            sub.add(currentString);
            return;
        }
        utilubseqnece(s,index+1,currentString,size,sub);
        utilubseqnece(s,index+1,currentString+s.charAt(index),size,sub);
    }
    static void subsequence(String s, List<String> sub){
        utilubseqnece(s,0,"",s.length(),sub);
    }
    static boolean isSubsequencenew(String s, String t) {


       int firstPointer =0;
        for (int i = 0; i <t.length() ; i++) {
            if (firstPointer==s.length()){
                return true;
            }
            if (firstPointer<s.length()&&s.charAt(firstPointer)==t.charAt(i)){

                firstPointer++;
            }
        }
        return firstPointer==s.length();

    }

    public static void main(String[] args) {

        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequencenew(s,t));
    }
}
