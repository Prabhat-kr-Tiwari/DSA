package Recursion.RecursionandBackTracking2;

public class GenerateAllSubsequenceofstring {

    static void subsequence(String s)
    {
        utilSubsequence(s,0,"");


    }
    static void utilSubsequence(String s,int i,String currentString){

        if (i==s.length())
        {
            System.out.println(currentString);
            return;
        }
        utilSubsequence(s,i+1,currentString);
        utilSubsequence(s,i+1,currentString+s.charAt(i));
    }

    public static void main(String[] args) {
        subsequence("abc");
    }
}
