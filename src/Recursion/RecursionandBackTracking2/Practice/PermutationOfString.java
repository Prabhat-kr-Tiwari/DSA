package Recursion.RecursionandBackTracking2.Practice;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {
    /*public List<String> find_permutation(String S) {
        // Code here

        *//*ArrayList<String>al=new ArrayList<>();
        permute(S,0,S.length());


        return al;*//*

        //return permute(S,0,S.length());

    }*/
    static ArrayList<String> permute(String s, int l, int r)
    {
        ArrayList<String> al=new ArrayList<>();
        if(l==r)
        {
            //al.add(s);
            /*return;*/
            //System.out.println(s);
            al.add(s);
            //return;
        }
        for(int i=l;i<=r;i++)
        {
            s=swap(s,l,i);
            permute(s,l+1,r);
            s=swap(s,l,i);

        }
        return al;


    }
    static String swap(String s, int l, int r)
    {
        /*int temp=s.charAt(l);
        s.charAt(l)=s.charAt(r);
        s.charAt(r)=temp;
        return s;*/

        char ch[] = s.toCharArray();
        char temp = ch[l];
        ch[l] = ch[r];
        ch[r] = temp;
        String s1 = String.copyValueOf(ch);
        return s1;
    }

    public static void main(String[] args) {
        String s="ABC";
        System.out.println(permute(s,0,2));




    }
}
