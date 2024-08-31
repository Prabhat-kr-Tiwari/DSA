package DynamicProgramming.AnujBhaiya.DpBasic;

import java.util.Arrays;

public class minCoins {


    static int minCoins(int a[],int n){

        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        minCoins(a,n,dp);
        for (int e:dp
             ) {
            System.out.print(e+"  ");

        }
        return dp[n];
    }

    static int minCoins(int a[],int n,int dp[]){
//        if(a.length==1){
//            if(a[0]<n) return -1;
//        }
        if (n<0) return Integer.MAX_VALUE;
        if (dp[n]!=-1) return dp[n];

        int min=Integer.MAX_VALUE;
        for (int i = 0; i <a.length ; i++) {
            min=Math.min(min,minCoins(a,n-a[i],dp));

        }
        return dp[n]=min+1;

    }

    public static void main(String[] args) {

        int a[]={8,6,1},n=15;
        int []coins = {2};
        int amount = 3;
        System.out.println(minCoins(a,n));
    }
}
