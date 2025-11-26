package slidingWIndow.AdityaVerma.SlidingWindow.VariableSizeSlidingWindow.MinimumWindowSubstring;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {


    static int minWindow(String s, String t) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = map.size();
        int i = 0, j = 0;
        int ans = Integer.MAX_VALUE;

        while (j < s.length()) {

            char ch = s.charAt(j);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);

                if (map.get(ch) == 0) {
                    count--;
                }
            }

            // Try shrinking when valid
            while (count == 0) {

                ans = Math.min(ans, j - i + 1);

                char left = s.charAt(i);

                if (map.containsKey(left)) {
                    map.put(left, map.get(left) + 1);

                    if (map.get(left) == 1) { // became invalid
                        count++;
                    }
                }
                i++; // shrink
            }

            j++; // expand
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    static String minWindows(String s, String t) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = map.size();
        int i = 0, j = 0;
        int ans = Integer.MAX_VALUE;
        int start=0;

        while (j < s.length()) {

            char ch = s.charAt(j);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);

                if (map.get(ch) == 0) {
                    count--;
                }
            }

            // Try shrinking when valid
            while (count == 0) {

                if (j - i + 1 < ans) {
                    ans = j - i + 1;
                    start = i; // store start index
                }
                char left = s.charAt(i);

                if (map.containsKey(left)) {
                    map.put(left, map.get(left) + 1);

                    if (map.get(left) == 1) { // became invalid
                        count++;
                    }
                }
                i++; // shrink
            }

            j++; // expand
        }

        return ans == Integer.MAX_VALUE ? "" : s.substring(start, start + ans);
    }
    public static void main(String[] args) {

       String s = "ADOBECODEBANC";
       String t = "ABC";
        System.out.println(minWindow(s,t));
        System.out.println(minWindows(s,t));

    }
}
