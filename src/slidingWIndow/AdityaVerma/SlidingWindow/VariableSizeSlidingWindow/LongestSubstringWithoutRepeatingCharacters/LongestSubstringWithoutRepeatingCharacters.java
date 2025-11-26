package slidingWIndow.AdityaVerma.SlidingWindow.VariableSizeSlidingWindow.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {


    static int lengthOfLongestSubstring(String s) {

        int i=0;
        int j=0;
        int size= s.length();
        int ans=0;
        Map<Character,Integer> hashMap= new HashMap<>();
        while (j<size){
            hashMap.put(s.charAt(j),hashMap.getOrDefault(s.charAt(j),0)+1);


            if (hashMap.size()==(j-i+1)){
                ans=Math.max(ans,j-i+1);
                j++;

            }
            //maintain window size
            while (hashMap.size()<(j-i+1)){
                int currentCount = hashMap.get(s.charAt(i));
                hashMap.put(s.charAt(i),currentCount-1);
                if (hashMap.get(s.charAt(i))==0){
                    hashMap.remove(s.charAt(i));
                }
                //slide
                i++;
            }

            //slid
            j++;
        }
        return  ans;
    }
    static int lengthOfLongestSubstring1(String s) {

        int i = 0, j = 0, ans = 0;
        Map<Character, Integer> hashMap = new HashMap<>();

        while (j < s.length()) {

            hashMap.put(s.charAt(j), hashMap.getOrDefault(s.charAt(j), 0) + 1);

            //  We check duplicates
            while (hashMap.get(s.charAt(j)) > 1) {
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) - 1);
                if (hashMap.get(s.charAt(i)) == 0) {
                    hashMap.remove(s.charAt(i));
                }
                i++; // shrink window
            }

            // Now window has all unique characters
            ans = Math.max(ans, j - i + 1);

            j++; // slide forward
        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring1("pwwkew"));
    }
}
