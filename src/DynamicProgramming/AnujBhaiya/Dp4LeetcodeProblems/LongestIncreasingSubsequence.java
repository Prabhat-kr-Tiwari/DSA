package DynamicProgramming.AnujBhaiya.Dp4LeetcodeProblems;

public class LongestIncreasingSubsequence {


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

    public static void main(String[] args) {


        int a[]={4,6,1,3,5,9,8};
        System.out.println(longestIncreasingSubsequence(a));

    }
}
