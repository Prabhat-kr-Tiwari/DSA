package tenDaysRecursionChalengeloveBabbar.RecursionDay4;

public class isPalin {
    static boolean ispalin(String str,int l,int r)
    {
        if (l>=r)
            return true;
        if (str.charAt(l)!=str.charAt(r))
            return false;
        return ispalin(str,l+1,r-1);
    }

    public static void main(String[] args) {
        String s="adbbba";
        System.out.println(ispalin(s,0,s.length()-1));
    }
}
