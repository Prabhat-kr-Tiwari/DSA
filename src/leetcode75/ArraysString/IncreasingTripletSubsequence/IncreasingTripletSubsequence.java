package leetcode75.ArraysString.IncreasingTripletSubsequence;

public class IncreasingTripletSubsequence {


    //    static boolean increasingTriplet(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            if (i< nums.length-2){
//                if (nums[i]<nums[i+1]){
//                    if (nums[i+1]<nums[i+2]){
//                        System.out.println(nums[i]);
//                        System.out.println(nums[i+1]);
//                        System.out.println(nums[i+2]);
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//
//    }
    static boolean increasingTriplet(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 2) {
                for (int j = i+1; j < nums.length; j++) {
                    for (int k = j+1; k < nums.length ; k++) {
                        if ((nums[i]<nums[j])){
                            if (nums[j]<nums[k]){
                                System.out.println(nums[i]);
                                System.out.println(nums[j]);
                                System.out.println(nums[k]);


                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;

    }
    static boolean increasingTripletOptimize(int[] nums) {

     
        int left= Integer.MAX_VALUE;
        int mid  =Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>mid){
                System.out.println(left);
                System.out.println(mid);
                System.out.println(nums[i]);

                return true;
            } else if (nums[i]>left&&nums[i]<mid) {
                mid =nums[i];
                
            } else if (nums[i]<left) {
                left = nums[i];
            }
        }
        return false;
    }

    public static void main(String[] args) {

//        int [] nums = {1,2,3,4,5};
//        int [] nums = {5,4,3,2,1};
//        int[] nums = {2, 1, 5, 0, 4, 6};
        int[] nums = {20,100,10,12,5,13};
//        [20,100,10,12,5,13]
//        10 12 13


//        Output: true
//        Explanation: Any triplet where i < j < k is valid.
        System.out.println(increasingTripletOptimize(nums));
    }
}
