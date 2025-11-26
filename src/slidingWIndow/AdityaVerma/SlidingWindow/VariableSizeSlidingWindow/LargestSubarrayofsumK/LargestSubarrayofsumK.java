package slidingWIndow.AdityaVerma.SlidingWindow.VariableSizeSlidingWindow.LargestSubarrayofsumK;

public class LargestSubarrayofsumK {


    static int longestSubarray(int[] arr, int k) {
        // code here
        int i = 0;
        int j = 0;
        int max = 0;
        int sum = 0;
        int size = arr.length;
        while (j < size) {
            sum = sum + arr[j];
            if (sum < k) {
                j++;

            }
            if (sum == k) {
                max = Math.max(max, j - i + 1);
                j++;
            }
            while (sum > k && i <= j) {
                sum -= arr[i];
                i++;
            }

            j++;

        }

        return max;
    }

    static int longestSubarray1(int[] arr, int k) {
        int i = 0;
        int j = 0;
        int max = 0;
        int sum = 0;
        int size = arr.length;

        while (j < size) {
            sum += arr[j];

            // shrink window until sum <= k
            while (sum > k && i <= j) {
                sum -= arr[i];
                i++;
            }

            // check if sum == k
            if (sum == k) {
                max = Math.max(max, j - i + 1);
            }

            // always move right end of window forward
            j++;
        }

        return max;
    }

    public static void main(String[] args) {


        int a[] = {4, 1, 1, 1, 2, 3, 5};
        int k1 = 5;

        System.out.println(longestSubarray(a, k1));
        System.out.println(longestSubarray1(a, k1));

    }
}
