package Recursion.RecursionandBackTracking2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenerateAllSubsequenceofstring {

    public static List<String> AllPossibleStrings(String s)
    {
        // Code here
        List<String>l=new ArrayList<>();
        List<String>l2=new ArrayList<>();
        util(s,0,"",l);
        for(String st:l)
        {
            l2.add(st);
        }
        Collections.sort(l2);
        l2.removeAll(Arrays.asList("", null));
        return l2;

    }
    static void util(String s,int i,String currentstring,List<String>l)
    {

        if(i==s.length())
        {
            l.add(currentstring);
            return;
        }

        util(s,i+1,currentstring+s.charAt(i),l);
        util(s,i+1,currentstring,l);

    }

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
        System.out.println(AllPossibleStrings("abc"));
    }
}
