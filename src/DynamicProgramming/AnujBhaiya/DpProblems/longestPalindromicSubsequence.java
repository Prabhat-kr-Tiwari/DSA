package DynamicProgramming.AnujBhaiya.DpProblems;

import java.util.Arrays;

public class longestPalindromicSubsequence {



    static int lcs(String a,String b){

        int m=a.length();
        int n=b.length();
        int dp[][]=new int[m+1][n+1];

        for (int i = 0; i <= m; i++) {

            Arrays.fill(dp[i], -1);

        }

        int ans= lcsdp(a,b,m,n,dp);

        //min i and d
        return ans;
    }


    static int lcsdp(String a,String b,int m,int n,int dp[][]){
        if(m==0||n==0) return 0;
        if (dp[m][n]!=-1 ) return dp[m][n];

        if (a.charAt(m-1)==b.charAt(n-1))
        {
            return dp[m][n]=lcsdp(a,b,m-1,n-1,dp)+1;
        }else{
            return dp[m][n]=Math.max(lcsdp(a,b,m-1,n,dp),lcsdp(a,b,m,n-1,dp));
        }

    }

    public static void main(String[] args) {
        String a="prlalcaeqcratrm";
        StringBuffer sbr = new StringBuffer(a);
        // To reverse the string
        sbr.reverse();
        System.out.println(lcs(a, sbr.toString()));
    }
}
