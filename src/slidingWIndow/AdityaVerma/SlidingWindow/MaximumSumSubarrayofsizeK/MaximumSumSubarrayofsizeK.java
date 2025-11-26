package slidingWIndow.AdityaVerma.SlidingWindow.MaximumSumSubarrayofsizeK;

public class MaximumSumSubarrayofsizeK {


    static int maxSubarraySum(int[] arr, int k) {
        // Code here
        int i = 0;
        int j = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while (j < arr.length) {
            sum = sum + arr[j];
            if ((j - i + 1) < k) {
                j++;
            } else if ((j - i + 1) == k) {
                max = Math.max(max, sum);
                sum = sum - arr[i];
                i++;
                j++;
            }


        }
        return max;
    }


    public static void main(String[] args) {

        int[] arr = {100, 200, 300, 400};
        int k = 2;
        System.out.println(maxSubarraySum(arr, k));
    }

}
