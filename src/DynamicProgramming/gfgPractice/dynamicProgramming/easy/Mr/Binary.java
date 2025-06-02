package DynamicProgramming.gfgPractice.dynamicProgramming.easy.Mr;

import java.util.Arrays;

public class Binary {
    static int maximum_index(String s) {
        int dp[] = new int[s.length() + 1];
        Arrays.fill(dp, -1);
        return helper(s, dp, 1);
    }

    static int helper(String s, int dp[], int curr) {
        if (curr >= s.length()) { // Fix: Ensure curr does not exceed string length
            return 0;
        }

        if (dp[curr] != -1) return dp[curr];

        int currAscii = s.charAt(curr - 1);
        int nextAscii = s.charAt(curr);

        // Move
        int move = 0;
        if (nextAscii >= currAscii) { // Fix: Prevent out-of-bounds error
            move =  1+helper(s, dp, curr +1);
        }

        // Skip
        int skip = helper(s, dp, curr + 1);

        return dp[curr] = Math.max(move, skip);
    }
    static int maximum_index2(String s) {
        int n = s.length();
        int lastSeen[] = new int[26]; // Stores the last index of each character
        Arrays.fill(lastSeen, -1);

        int maxIndex = 0;

        // Iterate through the string
        for (int i = 0; i < n; i++) {
            char curr = s.charAt(i);
            int currCharIndex = curr - 'a'; // Convert character to index (0 for 'a', 1 for 'b', ...)

            // If the character is 'a', update the max index (starting point)
            if (currCharIndex == 0) {
                maxIndex = Math.max(maxIndex, i);
            }

            // If the previous character exists, update the max index
            if (currCharIndex > 0 && lastSeen[currCharIndex - 1] != -1) {
                maxIndex = Math.max(maxIndex, i);
            }

            // Update last seen index of this character
            lastSeen[currCharIndex] = i;
        }

        return maxIndex;
    }

    public static void main(String[] args) {
        String s = "aaabbcdbdt";
        System.out.println(maximum_index2(s));
    }
}
