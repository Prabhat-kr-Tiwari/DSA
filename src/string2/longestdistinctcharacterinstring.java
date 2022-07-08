package string2;

import java.util.HashSet;
import java.util.Set;

public class longestdistinctcharacterinstring {

    static int longestSubstrDistinctChars(String S){
        // code here
        Set<Character> hs=new HashSet<>();
        int i=0;
        int j=0;
        int cnt=0;
        int mx=0;
        while(i<S.length())
        {if(hs.contains(S.charAt(i)))
        {
            hs.remove(S.charAt(j));
            j++;
        }
        else
        {
            hs.add(S.charAt(i));
            i++;
            cnt=hs.size();
            mx=Math.max(cnt,mx);
        }
        }
        return mx;

    }

    public static void main(String[] args) {
        System.out.println(longestSubstrDistinctChars("geeksforgeeks"));
    }
}
