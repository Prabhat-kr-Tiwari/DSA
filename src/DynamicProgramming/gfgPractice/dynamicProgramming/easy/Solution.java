package DynamicProgramming.gfgPractice.dynamicProgramming.easy;


class LongestBitonicSubsequenceSum {
    static int LongestBitonicSequenceSum(int[] nums) {
        int n = nums.length;

        // Array to store the sum of the longest increasing subsequence ending at each index
        int[] incSum = new int[n];
        for (int i = 0; i < n; i++) {
            incSum[i] = nums[i]; // Initialize with the current element
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && incSum[j] + nums[i] > incSum[i]) {
                    incSum[i] = incSum[j] + nums[i];
                }
            }
        }

        // Array to store the sum of the longest decreasing subsequence starting at each index
        int[] decSum = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            decSum[i] = nums[i]; // Initialize with the current element
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[i] && decSum[j] + nums[i] > decSum[i]) {
                    decSum[i] = decSum[j] + nums[i];
                }
            }
        }

        // Calculate the maximum sum of the bitonic subsequence
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            maxSum = Math.max(maxSum, incSum[i] + decSum[i] - nums[i]);
        }

        return maxSum;
    }

    public static void main(String[] args) {
       int arr[] = {80, 60, 30, 40, 20, 10};
        System.out.println(LongestBitonicSequenceSum(arr));
    }
}
