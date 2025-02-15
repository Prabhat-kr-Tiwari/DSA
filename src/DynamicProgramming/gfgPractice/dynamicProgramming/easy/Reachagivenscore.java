package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

import java.util.Arrays;

public class Reachagivenscore {



    static long count(int n) {



        long dp[]=new long[n+1];
        Arrays.fill(dp,-1);
        return countways(n,dp);
    }
    static long countways(int n, long dp[]){

        dp[0]=3;
        if(n>=5) dp[1]=5;
        if(n>=10) dp[2]=10;

        for (int i = 3; i <=n ; i++) {
            if (dp[i]==-1){
                dp[i]=dp[i-3]+dp[i-5]+dp[i-10];
            }
        }
        return dp[n];

    }

    public static void main(String[] args) {

        System.out.println(count(10));
    }
}
