package DynamicProgramming.AnujBhaiya.Dp4LeetcodeProblems;

public class MaximumSumIncreasingSubsequence {


    static int maxLIS(int a[]){
        int n=a.length;
        int dp[]=new int[n];
        dp[0]=a[0];
        for (int i = 1; i < n; i++) {
            dp[i]=a[i];
            for (int j = 0; j <i ; j++) {
                if (a[i]>a[j]){

                    dp[i]=Math.max(dp[i],dp[j]+a[i]);
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
    public static void main(String[] args) {

    }
}
