package ArrayPractice;

public class MaximumSumCircularSubarray {

    static void max(int a[], int n) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;


        int x = 0;
        for (int i = 0; i < n; i++) {
            x = ((i + n - n / 2 - 1) % n);
            System.out.println("X   :" + x);
            currsum += a[(i + n - n / 2 - 1) % n];
            System.out.println("currsum" + currsum);
            if (currsum > maxsum) {
                maxsum = currsum;
                System.out.println("maxsum" + maxsum);
            }
            if (currsum < 0) {
                currsum = 0;
            }


        }
        int curr = 0;

        for (int i = 0; i < n; i++) {
            curr += a[i];
            if (curr > maxsum) {
                maxsum = curr;
            }
            if (curr < 0) {
                curr = 0;
            }

        }
        System.out.println(maxsum);
    }


    static void k(int a[], int n) {

        int array_sum = 0;
        int max_subarray_sum = 0;
        int original_max_subarray_sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = (-1) * a[i];

        }
        System.out.println("After -1 *");
        for (int e : a
        ) {
            System.out.print(e + " ");

        }
        for (int i = 0; i < n; i++) {
            array_sum += a[i];

        }

        System.out.println("Array sum:  " + array_sum);

        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            currsum += a[i];
            if (currsum > maxsum) {
                maxsum = currsum;
            }
            if (currsum < 0) {
                currsum = 0;
            }

        }
        System.out.println("maxsum:    :" + maxsum);
        original_max_subarray_sum = -(array_sum - (maxsum));
        System.out.println(original_max_subarray_sum);
    }

    static int maxoptimised(int a[], int n) {

        int max_straight_sum = Integer.MIN_VALUE;
        int temp_max_sum = 0;
        int array_sum = 0;
        int min_straight_sum = Integer.MAX_VALUE;
        int temp_min_sum = 0;
        for (int i = 0; i < n; i++) {

            temp_max_sum += a[i];
            if (temp_max_sum > max_straight_sum) {
                max_straight_sum = temp_max_sum;
            }
            if (temp_max_sum < 0) {
                temp_max_sum = 0;
            }
            array_sum += a[i];
            temp_min_sum += a[i];
            if (temp_min_sum < min_straight_sum) {
                min_straight_sum = temp_min_sum;
            }
            if (temp_min_sum > 0) {
                temp_min_sum = 0;
            }
        }
        //all array elements array are negative
        if(array_sum==min_straight_sum){
            return max_straight_sum;
        }
        return Math.max(max_straight_sum,(array_sum-min_straight_sum));
    }


    public static void main(String[] args) {
        int[] nums = {1, -2, 3, -2};
        System.out.println(maxoptimised(nums, nums.length));


    }
}
