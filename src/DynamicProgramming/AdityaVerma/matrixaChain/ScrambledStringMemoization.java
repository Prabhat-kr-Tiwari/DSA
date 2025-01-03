package DynamicProgramming.AdityaVerma.matrixaChain;

import java.util.HashMap;

public class ScrambledStringMemoization {


    static boolean solve(String a,String b,boolean isTrue){
        HashMap<String ,Boolean>hm=new HashMap<>();
        return scrambledString(a,b,hm);
    }
    public static boolean scrambledString(String a, String b,HashMap<String ,Boolean> hm) {
        // Base cases
        if (a.equals(b)) return true;
        if (a.length() != b.length()) return false;
        if (a.length() <= 1) return a.equals(b);

        int n = a.length();
        boolean flag = false;
        // Memoization key generation
        String key = a + " " + b;
        if (hm.containsKey(key)){
            return hm.get(key);
        }

        // Recursively check for each split
        for (int i = 1; i <= n - 1; i++) {
            // Check if swapping or no-swapping gives scrambled match
            if ((scrambledString(a.substring(0, i), b.substring(n - i),hm) &&
                    scrambledString(a.substring(i), b.substring(0, n - i),hm)) ||
                    (scrambledString(a.substring(0, i), b.substring(0, i),hm) &&
                            scrambledString(a.substring(i), b.substring(i),hm))) {
                flag = true;
                break;
            }
        }
        hm.put(key,flag);
        return flag;
    }

    public static void main(String[] args) {
        String a = "great";
        String b = "rgeat";
        String S1="coder", S2="ocder";
        System.out.println(solve(S1, S2,true)); // Output: true
    }
}
