package DynamicProgramming.AnujBhaiya.Dp3LeetcodeProblems;

import java.util.Arrays;

public class countNoOfWaytoCoveraDistance {


 /*   static int count(int n){

        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        for (int e:dp
             ) {
            System.out.print(e);
        }
        return countways(n,dp);
    }

    static int countways(int n,int dp[]){
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;

        for (int i = 3; i <= n ; i++) {

            if (dp[i]!=-1) return dp[i];
            else dp[i]=dp[i-1]+dp[i-2]+dp[i-3];

        }
        return dp[n];

    }*/

    static final long MOD = 1000000007;

    static long count(int n) {
        long dp[] = new long[n + 1];
        Arrays.fill(dp, -1);
        return countways(n, dp);
    }

    static long countways(int n, long dp[]) {
        // Base cases
        dp[0] = 1;
        if (n >= 1) dp[1] = 1;
        if (n >= 2) dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            if (dp[i] == -1) {  // Only compute if dp[i] is not already computed
                dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % MOD;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(count(54));
        long ans = count(5);
        System.out.println(ans);
    }
}
