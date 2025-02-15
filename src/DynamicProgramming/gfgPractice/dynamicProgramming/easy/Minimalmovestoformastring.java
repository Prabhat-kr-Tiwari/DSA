package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

public class Minimalmovestoformastring {

    public static int minSteps(String S) {
        int n = S.length();
        int[] dp = new int[n + 1]; // DP array to store the minimum steps

        // Base case
        dp[0] = 0; // No moves needed for an empty string

        for (int i = 1; i <= n; i++) {
            // Default move: Add one character at a time
            dp[i] = dp[i - 1] + 1;

            // If the first half matches the second half, we can use doubling
            if (i % 2 == 0) {
                int half = i / 2;
                if (S.substring(0, half).equals(S.substring(half, i))) {
                    dp[i] = Math.min(dp[i], dp[half] + 1);
                }
            }
        }

        return dp[n]; // Minimum steps to form the string S
    }


    public static void main(String[] args) {

        System.out.println(minSteps("kkbkkb"));
        String s="aaaa";
        System.out.println(s.startsWith("aa"));
    }
}
