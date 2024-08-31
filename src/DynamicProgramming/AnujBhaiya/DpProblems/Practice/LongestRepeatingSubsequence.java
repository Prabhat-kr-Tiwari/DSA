package DynamicProgramming.AnujBhaiya.DpProblems.Practice;

import java.util.Arrays;

public class LongestRepeatingSubsequence {


 /*   static int lcs(String a,String b){
        int m=a.length();
        int n=b.length();
        int dp[][]=new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {

            Arrays.fill(dp[i],-1);
        }
        return lcsTabular(a,b,m,n,dp);
    }
    static int lcsdp(String a,String b,int m,int n,int dp[][]){
        if (m==0||n==0){
            return 0;
        }
        if (dp[m][n]!=-1) return dp[m][n];

        if (a.charAt(m-1)==b.charAt(n-1)){
            return dp[m][n]=lcsdp(a,b,m-1,n-1,dp)+1;
        }else {
            return dp[m][n]=Math.max(lcsdp(a,b,m-1,n,dp),lcsdp(a,b,m,n-1,dp));
        }
    }*/


    static int lcs(String a,String b){
        int m=a.length();
        int n=b.length();
        int dp[][]=new int[m+1][n+1];

        return lcsTabular(a,b,m,n,dp);
    }
    static int lcsTabular(String a,String b,int m,int n,int dp[][]){


        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <= n ; j++) {

                if (a.charAt(i-1)==b.charAt(j-1)&&i!=j){
                    dp[i][j]=dp[i-1][j-1]+1;

                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }

            }
        }
        return dp[m][n];
    }




    public static void main(String[] args) {

        String a = "AABEBCDD";
        String b = "AABEBCDD";
        System.out.println(lcs(a, b));
    }
}
