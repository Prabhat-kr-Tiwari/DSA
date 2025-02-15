package DynamicProgramming.gfgPractice;

public class reachntpoint {

    public static int countWaysToReachN(int n) {
        int MOD = 1000000007; // Define the modulo value

        if (n == 0) return 1; // Base case: only 1 way to stay at point 0
        if (n == 1) return 1; // Base case: only 1 way to reach point 1

        // Create a dp array to store the number of ways to reach each point
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        // Fill the dp array using the recurrence relation
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(countWaysToReachN(4));
    }
}

