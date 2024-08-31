package DynamicProgramming.AnujBhaiya.DpBasic;

import java.util.Arrays;

public class findNthFibonacciNumber {


    static int fibSeries(int n){

       if (n==0) return 0;
       if (n==1) return 1;
        int res=0;
        res=(fibSeries(n-1)+fibSeries(n-2));
        return res;

    }

    static int fib(int n){

        if(n==0) return 0;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        fibDp(n,dp);
        return dp[n];

    }
    static int fibDp(int n,int dp[]){

        if (dp[n]!=-1) return dp[n];
        return dp[n]=fibDp(n-1,dp)+fibDp(n-2,dp);

    }
    public static void main(String[] args) {

        System.out.println(fib(5));
        System.out.println(fibSeries(4));
    }
}
