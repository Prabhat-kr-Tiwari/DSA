package DynamicProgramming.AdityaVerma.LCS;

import java.util.Arrays;

public class LongestCommonSubstring {


    static int longestCommonSubstring(String x,String y,int n,int m){

        int t[][]=new int[n+1][m+1];
        for (int i = 0; i <=n ; i++) {
            Arrays.fill(t[i],0);
        }

        return longestCommonSubstring(x,y,n,m,t);

    }

    static int longestCommonSubstring(String x,String y,int n,int m,int t[][]){


        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                if (x.charAt(i-1)==y.charAt(j-1)){
                    t[i][j]=t[i-1][j-1]+1;
                }else{
                    t[i][j]=0;
                }
            }
        }
        int max=0;
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=m ; j++) {
                max=Math.max(max,t[i][j]);
            }
        }
        return max;

    }

    public static void main(String[] args) {
        String s1 = "ABCDGH", s2 ="ACDGHR";
        System.out.println(longestCommonSubstring(s1,s2,s1.length(),s2.length()));


    }
}
