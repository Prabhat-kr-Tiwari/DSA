package leetcode75.slidingWindow.MaximumAverageSubarrayI;

public class MaximumAverageSubarrayI {


    static double findMaxAverageBruteforce(int[] nums, int k) {

        double max = Integer.MIN_VALUE;
        for (int i = 0; i <=nums.length-k; i++) {
            int sum = 0;
            for (int j = i; j < i+k; j++) {
                sum += nums[j];
            }
            double result = (double) sum /k;
            max =  Math.max(max,result);
        }
        return max;


    }
    static double findMaxAverage(int[] nums, int k) {

        if (nums.length==1){
            return (double) nums[0] /k;
        }
        int i=0;
        int j=0;
        int size = nums.length;
        double max = Double.NEGATIVE_INFINITY;
        int sum = 0;
        while (j<size){

            //calculation
            sum +=nums[j];



            if ((j-i+1)<k){
                j++;
            } else if ((j-i+1)==k) {

                //get ans  from calculation
                double result = (double) sum /k;
                max = Math.max(max,result);


                // maintain window size
                sum = sum-nums[i];


                //slide
                i++;
                j++;
            }


        }
        return max;

    }
    public static void main(String[] args) {

        int [] nums = {1,12,-5,-6,50,3};
                int k = 4;
        /*Output: 12.75000
        Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75*/

        System.out.println(findMaxAverageBruteforce(nums,k));
        System.out.println(findMaxAverage(nums,k));
    }
}
