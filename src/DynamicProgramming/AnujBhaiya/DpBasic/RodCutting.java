package DynamicProgramming.AnujBhaiya.DpBasic;

import java.util.Arrays;

public class RodCutting {


   /* static int rodCutting(int price[],int n){

        if (n==0) return 0;
        if(n<0) return -100000;
        int max=-1;
        for (int i = 0; i < price.length ; i++) {
             max=Math.max(max,price[i]+rodCutting(price,n-i-1) );
        }
        return max;
    }*/
   static int rodCutting(int price[],int n){
       int dp[]=new int[n+1];
       Arrays.fill(dp,-1);
       dp[0]=0;
       rodCuttingDp(price,n,dp);
       for (int e:dp
            ) {
           System.out.print(e+" ");
       }
       return dp[n];
   }
    static int rodCuttingDp(int price[],int n,int dp[]){
        if(n<0) return -100000;
        if (dp[n]!=-1) return dp[n];
        int max=-1;
        for (int i = 0; i < price.length ; i++) {
            max=Math.max(max,price[i]+rodCuttingDp(price,n-i-1,dp) );
        }
        return dp[n]=max;
    }

    public static void main(String[] args) {

        int price[]={4,6,10,9,12};
        int n=5;
        System.out.println( rodCutting(price,n));
    }
}
