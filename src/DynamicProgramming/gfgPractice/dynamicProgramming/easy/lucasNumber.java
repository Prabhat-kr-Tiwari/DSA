package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

import java.util.Arrays;

public class lucasNumber {



    static long lucas(int n)
    {
        //code here.
        if (n==0) return 2;
        if (n==1) return 1;
        long result=0;
        if(n>1){
            result= lucas(n-1)+lucas(n-2);

        }
        return result;
    }
    //memo
    static long lucasdp(int n){
        long dp[]=new long[n+1];
        Arrays.fill(dp,-1);
        return helper( n, dp);
    }
    static long helper(int n,long  dp[]){
        if (n==0) return 2;
        if (n==1) return 1;
        if (dp[n]!=-1) return dp[n];
        dp[n]=helper(n-1,dp)+helper(n-2,dp);
        return dp[n];
    }
    public static void main(String[] args) {

        System.out.println(lucasdp(7));

    }
}
