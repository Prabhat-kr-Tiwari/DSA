package DynamicProgramming.AdityaVerma.LCS;

import java.util.Arrays;

public class LongestCommonSubsequence {



    //recursive

    static int lcsR(String x, String y, int n, int m) {


        if (n == 0 || m == 0) {
            return 0;
        }
        if (x.charAt(n - 1) == y.charAt(m - 1)) {
            return  lcs(x, y, n - 1, m - 1)+1;
        } else {
           return Math.max(lcs(x, y, n - 1, m), lcs(x, y, n, m - 1));
        }


    }

    //memoiz bottom up
   /* static int lcs(String x,String y,int n,int m){

        int t[][]=new int[n+1][m+1];
        for (int i = 0; i <=n; i++) {
            Arrays.fill(t[i],-1);
        }
        return lcs(x,y,n,m,t);
    }
    static int lcs(String x,String y,int n,int m,int t[][]){
        if (n==0||m==0){
            return 0;
        }
        if (t[n][m]!=-1){
            return t[n][m];
        }
        if (x.charAt(n-1)==y.charAt(m-1)){
            t[n][m]=lcs(x,y,n-1,m-1,t)+1;
        }else{
            t[n][m]=Math.max(lcs(x,y,n-1,m,t),lcs(x,y,n,m-1));
        }
        return t[n][m];


    }*/


    //top dowm
    static int lcs(String x,String y,int n,int m){

        int t[][]=new int[n+1][m+1];
        for (int i = 0; i <=n; i++) {
            Arrays.fill(t[i],0);
        }
        return lcs(x,y,n,m,t);
    }
    static int lcs(String x,String y,int n,int m,int t[][]){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= m ; j++) {
                if (x.charAt(i-1)==y.charAt(j-1)){
                    t[i][j]=t[i-1][j-1]+1;
                }else {
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=m ; j++) {
                System.out.print(t[i][j]+"  ");
            }
            System.out.println();
        }

        return t[n][m];


    }



    public static void main(String[] args) {
        String x = "abcde";
        String y = "ace";
        System.out.println(lcs(x, y, x.length(), y.length()));
    }

}
