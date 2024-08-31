package DynamicProgramming.AnujBhaiya.Dp3LeetcodeProblems;

import java.util.Arrays;

public class EditDistance {


       /* static int editDistance(String s1,String s2){
            int n=s1.length();
            int m=s2.length();
            return editDistanceRecursion(s1,s2,n,m);
        }


    static int editDistanceRecursion(String s1, String s2, int n, int m) {

        if (n == 0) return m;
        if (m == 0) return n;

        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return editDistanceRecursion(s1, s2, n - 1, m - 1);
        } else {
            return Math.min(Math.min(editDistanceRecursion(s1, s2, n - 1, m), editDistanceRecursion(s1, s2, n, m - 1)), editDistanceRecursion(s1, s2, n - 1, m - 1)) + 1;
        }


    }*/
    //TC O(n raise to power m)

    //top down
/*    static int editDistance(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int dp[][]=new int[n+1][m+1];
        for (int i = 0; i <=n; i++) {
            Arrays.fill(dp[i],-1);

        }
        return editDistanceRecursion(s1, s2, n, m,dp);
    }
    static int editDistanceRecursion(String s1, String s2, int n, int m,int dp[][]) {

        if (n == 0) return m;
        if (m == 0) return n;

        if (dp[n][m]!=-1) return dp[n][m];

        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return dp[n][m] =editDistanceRecursion(s1, s2, n - 1, m - 1,dp);
        } else {
            return dp[n][m]= Math.min(Math.min(editDistanceRecursion(s1, s2, n - 1, m,dp), editDistanceRecursion(s1, s2, n, m - 1,dp)), editDistanceRecursion(s1, s2, n - 1, m - 1,dp)) + 1;
        }


    }*/

    //bottom up
    static int editDistance(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int dp[][]=new int[n+1][m+1];
        for (int i = 0; i <=n; i++) {
            Arrays.fill(dp[i],-1);

        }
        return editDistanceTabular(s1, s2, n, m,dp);
    }
    static int editDistanceTabular(String s1, String s2, int n, int m,int dp[][]){
        for (int i = 0; i <= m ; i++) {
            dp[0][i]=i;
        }
        for (int i = 0; i <= n ; i++) {
            dp[i][0]=i;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=m  ; j++) {
                if (s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                }
            }
        }
        return dp[n][m];
    }



    public static void main(String[] args) {

        String s1 = "cat";
        String s2 = "cut";
        System.out.println(editDistance(s1, s2));
    }
}
