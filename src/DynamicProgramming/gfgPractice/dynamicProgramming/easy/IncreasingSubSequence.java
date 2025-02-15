package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

import java.util.Arrays;

public class IncreasingSubSequence {
/*
    int n=nums.length;
    int[]inc=new int[n];
        for(int i=0;i<n;i++){
        inc[i]=1;
        for(int j=i-1;j>=0;j--){
            if(nums[j]<nums[i] && inc[j]+1>inc[i]){
                inc[i]=inc[j]+1;
            }
        }
    }*/

    static int maxLength(String s) {

        int count=0;
        for (int i = 1; i <s.length() ; i++) {
            for (int j = 0; j <i ; j++) {
                char first=s.charAt(i);
                int firstAccci=first;
                char second=s.charAt(i);
                int secondAscci=second;
                if (secondAscci>firstAccci){
                    count++;
                }

            }
        }
        return count;

    }
    static int maxLength2(String s) {
        int n = s.length();
        int[] dp = new int[n];
        int maxLen = 1;

        // Initialize DP array to 1 (each character is a subsequence of length 1)
        Arrays.fill(dp, 1);

        // Compute LIS using DP
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) > s.charAt(j)) { // Increasing order condition
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }

        return maxLen;
    }


    public static void main(String[] args) {
        String s = "abcdapzfqh";
        System.out.println(maxLength2(s));

    }
}
