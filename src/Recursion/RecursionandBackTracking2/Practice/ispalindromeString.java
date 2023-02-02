package Recursion.RecursionandBackTracking2.Practice;

public class ispalindromeString {
    static boolean isPalin( String s,int l,int r)
    {
        if (l>=r) return true;
        if (s.charAt(l)!=s.charAt(r))
            return false;
        return isPalin(s,l+1,r-1);
    }

    public static void main(String[] args) {
        System.out.println(isPalin("abac",0,3));
    }
}
