package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

import java.util.Arrays;

public class CountwaystoexpressNasthesumof13and4 {



    static int countWays(int n) {
        // code here
        if(n==0) return 1;
        if (n<0) return 0;
        return countWays(n-1)+countWays(n-3)+countWays(n-4);
    }
    //dp
    static int  countWaysDP(int n){
        int dpArray[]=new int[n+1];
        Arrays.fill(dpArray, -1);

        return countWayss(n,dpArray);
    }
    static int  countWayss(int n, int[] dp){
        if (n==0) return 1;
        if (n<0) return 0;
        if (dp[n]!=-1) return dp[n];
        int result= countWayss(n-1,dp)+countWayss(n-3,dp)+countWayss(n-4,dp);
         dp[n]=result;
         return dp[n];
    }

    public static void main(String[] args) {

        System.out.println(countWays(4));
        System.out.println(countWaysDP(4));
    }
}
