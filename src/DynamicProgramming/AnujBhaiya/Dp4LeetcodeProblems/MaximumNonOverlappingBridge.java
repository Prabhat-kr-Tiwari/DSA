package DynamicProgramming.AnujBhaiya.Dp4LeetcodeProblems;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumNonOverlappingBridge {


    static int longestIncreasingSubsequence(int a[]){
        int n=a.length;
        int dp[]=new int[n];
        dp[0]=1;
        for (int i = 1; i < n; i++) {
            dp[i]=1;
            for (int j = 0; j <i ; j++) {
                if (a[i]>a[j]){

                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int max=0;
        for (int e:dp
        ) {

            max=Math.max(max,e);
        }
        System.out.println("ans");
        return max;
    }
/*
    static int maxNonOverlappingBridge(int a[][]){
        Arrays.sort(a, new Comparator<Integer[]>(){

            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if (o1[0]==o2[0]){
                    return o1[1]-o2[1];
                }else{
                    return o1[0]-o2[0];
                }
            }
        });
        int n=a.length;
        int b[]=new int[n];
        for (int i = 0; i < n; i++) {
            b[i]=a[i][1];

        }
        return longestIncreasingSubsequence(b);
    }*/
  /*  static int maxNonOverlappingBridge(int a[][]){
        Arrays.sort(a, new Comparator<Integer[]>(){

            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if (o1[0]==o2[0]){
                    return o1[1]-o2[1];
                }else{
                    return o1[0]-o2[0];
                }
            }
        });
        int n=a.length;
        int b[]=new int[n];
        for (int i = 0; i < n; i++) {
            b[i]=a[i][1];

        }
        return longestIncreasingSubsequence(b);
    }*/

    public static void main(String[] args) {

    }
}
