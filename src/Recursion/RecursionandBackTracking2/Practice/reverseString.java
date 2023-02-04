package Recursion.RecursionandBackTracking2.Practice;

import java.sql.Array;
import java.util.Arrays;

public class reverseString {

    public static void rev(String s,int first,int last)
    {
        if(first>last) return;

        char temp=s.charAt(first);
        char a=s.charAt(first);
        char b=s.charAt(last);
        a=b;
        b=temp;
        //s.charAt(last)=temp;

        rev(s,first+1,last-1);
        return;
    }
    static String swap(String s,int l,int r)
    {
        char ch[]=s.toCharArray();
        char temp=ch[l];
        ch[l]=ch[r];
        ch[r]=temp;
        String s1 = String.copyValueOf(ch);
        return s1;
    }

    static String revString(/*char[]*/ String str, int start, int end){
        if(start >= end){
            return str;
        }
        str=swap(str,start,end);
       /* char temp = str[start];
        str[start] = str[end];
        str[end] = temp;
*/
        return revString(str, ++start, --end);
    }

    public static String reverseString(String str) {
        // Write your code here.
        //rev(str,0,str.length()-1);
//        for (int i = 0; i <str.length()-1 ; i++) {
//            swap(str,i,str.length()-1);
//        }
        if(str.length()==1)
            return str;

        while (str.length()!=0)
        {
            swap(str,0,str.length()-1);
        }
        return str;
    }
    public static void main(String[] args) {
//        System.out.println(reverseString("abcd"));
        /*String str = "abc";
        char[] arr = str.toCharArray();
        revString(arr, 0, str.length()- 1);
        System.out.println(Arrays.toString(arr));*/
//        String str="abc";
//        revString(str,0,str.length()-1)
        String str = "shabaj";
        System.out.println(revString(str, 0, str.length() - 1));
    }
}
