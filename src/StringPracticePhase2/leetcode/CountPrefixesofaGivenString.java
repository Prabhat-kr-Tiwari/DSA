package StringPracticePhase2.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CountPrefixesofaGivenString {


    public  static int countPrefixes(String[] words, String s) {
        int count =0;
        for (int i = 0; i < words.length ; i++) {
            if (           s.startsWith(words[i])){
                count++;
            }
        }

        return count;


    }

    public static void main(String[] args) {


       /* String[] words = {"a", "b", "c", "ab", "bc", "abc"};
        String s = "abc";*/

      String[]  words = {"a","a"};
              String s = "aa";
        System.out.println(countPrefixes(words,s));
    }
}
