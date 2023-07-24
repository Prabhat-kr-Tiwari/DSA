package Top100Codes.HappiestMind;

public class palindromeString {
    static boolean ispalin(String s,int l,int r){
        if (l>=r)
            return true;
        if (s.charAt(l)!=s.charAt(r)){
            return false;
        }
        return ispalin(s,l+1,r-1);

    }
}
