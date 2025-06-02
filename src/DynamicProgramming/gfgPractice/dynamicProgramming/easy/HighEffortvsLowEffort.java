package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

import java.util.Arrays;

public class HighEffortvsLowEffort {
    static int maxAmt(int n, int hi[], int li[]) {
        int[] dp = new int[n];  // Memoization table
        Arrays.fill(dp, -1);
        return helper(n, hi, li, 0, dp);
    }

    static int helper(int n, int hi[], int li[], int curr, int[] dp) {
        if (curr >= n) return 0;  // Base case: No more days left

        if (dp[curr] != -1) return dp[curr];  // Memoization lookup

        // Option 1: Skip current work
        int skip = helper(n, hi, li, curr + 1, dp);

        // Option 2: Take low-effort work
        int lowEffort = li[curr] + helper(n, hi, li, curr + 1, dp);

        // Option 3: Take high-effort work and **skip the next day**
        int highEffort = hi[curr] + helper(n, hi, li, curr + 2, dp);

        return dp[curr] = Math.max(skip, Math.max(lowEffort, highEffort));
    }
    static int maxAmt1(int n, int hi[], int li[]) {
        if (n == 0) return 0;

        int[] dp = new int[n + 1];  // DP table

        // Base cases
        dp[0] = 0;  // No earnings on day -1
        dp[1] = Math.max(li[0], hi[0]);  // First day: Take max of low or high effort

        for (int i = 2; i <= n; i++) {
            int takeLowEffort = li[i - 1] + dp[i - 1];  // Take low effort today
            int takeHighEffort = hi[i - 1] + (i > 1 ? dp[i - 2] : 0);  // Take high effort (skip previous day)
            dp[i] = Math.max(dp[i - 1], Math.max(takeLowEffort, takeHighEffort));  // Take max
        }

        return dp[n];
    }

    public static void main(String[] args) {
     /*   int n = 3;
        int hi[] = {2, 8, 1};
        int li[] = {1, 2, 1};*/
        int n = 6;
        int hi[] = {13, 15, 11, 9, 10, 12};
        int li[] = {6, 7, 7, 6, 1, 2};
        System.out.println(maxAmt(n, hi, li));  // Correct Output: **9**
    }
}