package slidingWIndow.gfgPractice.slidingWIndowTag.easy.Smallestwindowcontaining01and2;

import java.util.HashMap;

public class Smallestwindowcontaining01and2 {


    static int smallestSubstring(String S) {
        // Code here
        int i = 0;
        int j = 0;
        int size = S.length();
        int k = 0;
        int ans = Integer.MAX_VALUE;
        String pat = "102";
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char ch : pat.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }
        int count = hashMap.size();
        while (j < size) {
            //calculatio
            char ch = S.charAt(j);
            if (hashMap.containsKey(ch)) {
                hashMap.put(ch, hashMap.get(ch) - 1);
                if (hashMap.get(ch) == 0) {
                    count--;
                }
            }

            if (count < k) {
                j++;
            } else if (count>k) {
                j++;
            } else if (count == k) {
                // shrink to keep minimum window
                while (count == 0) {

                    ans = Math.min(ans, j - i + 1);

                    char start = S.charAt(i);
                    if (hashMap.containsKey(start)) {
                        hashMap.put(start, hashMap.get(start) + 1);
                        if (hashMap.get(start) == 1) {
                            count++;   // we lost a required char
                        }
                    }
                    i++;
                }
                j++;
            }


        }
        return ans==Integer.MAX_VALUE?-1:ans;


    }

    public static void main(String[] args) {

        System.out.println(smallestSubstring("022001"));
    }
}
