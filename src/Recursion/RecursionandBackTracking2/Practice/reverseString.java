package Recursion.RecursionandBackTracking2.Practice;

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
    public static String reverseString(String str) {
        // Write your code here.
        rev(str,0,str.length()-1);
        return str;

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

    public static void main(String[] args) {
        System.out.println(reverseString("abb"));
    }
}
