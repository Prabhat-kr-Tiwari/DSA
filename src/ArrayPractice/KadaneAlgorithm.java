package ArrayPractice;


public class KadaneAlgorithm {

    // Function to find the maximum sum subarray using Kadane's algorithm
    public static int kadane(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    // Function to find the maximum sum subarray from the left half of the array
    public static int kadaneFromLeft(int[] arr) {
        return kadane(arr);
    }

    // Function to find the maximum sum subarray from the right half of the array
    public static int kadaneFromRight(int[] arr) {
        int n = arr.length;
        int[] reversedArr = new int[n];
        for (int i = 0; i < n; i++) {
            reversedArr[i] = arr[n - 1 - i];
        }
        return kadane(reversedArr);
    }

    // Function to find the maximum sum subarrays from both the left and right halves of the array
    public static int[] maxSumSubarrays(int[] arr) {
        int leftMaxSum = kadaneFromLeft(arr);
        int rightMaxSum = kadaneFromRight(arr);
        return new int[]{leftMaxSum, rightMaxSum};
    }

    public static void main(String[] args) {
        int[] arr = {1, -3, 4, -2, -1, 6};
        int[] maxSums = maxSumSubarrays(arr);

        System.out.println("Maximum sum subarray in the left half: " + maxSums[0]);
        System.out.println("Maximum sum subarray in the right half: " + maxSums[1]);
    }
}

