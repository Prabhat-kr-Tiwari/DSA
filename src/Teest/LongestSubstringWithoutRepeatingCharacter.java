package Teest;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter {


    static int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int max =0;
        HashSet<Character> hashSet = new HashSet<>();
        while (i<s.length()){
            if (hashSet.contains(s.charAt(i))){
                hashSet.remove(s.charAt(j));
                j++;

            }else{
                hashSet.add(s.charAt(i));
                i++;
                int count =  hashSet.size();
                max = Math.max(count,max);

            }
        }
        return max;

    }
    public static void main(String[] args) {

        String s = "abcabcbb";
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
        System.out.println(lengthOfLongestSubstring(s));

    }
}
