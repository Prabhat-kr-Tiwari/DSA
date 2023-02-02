package Recursion.RecursionandBackTracking2.Practice;

public class swapstring {
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
        System.out.println(swap("gfg",0,1));
    }
}
