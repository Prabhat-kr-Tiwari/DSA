package leetcode75.TwoPointers.MaxNumberofKSumPairs;

import java.util.Arrays;

public class MaxNumberofKSumPairs {


    static int maxOperations(int[] nums, int k) {

        Arrays.sort(nums);
        int l=0;
        int r= nums.length-1;
        int operation=0;

        while (l<r){

            if ((nums[l]+nums[r])==k){
                operation++;
                l++;
                r--;
            } else if (k>(nums[l]+nums[r])) {
                l++;

            }else {
                r--;
            }

        }
        return operation;
    }
    public static void main(String[] args) {

        int [] nums = {1,2,3,4};
       int k = 5;
        System.out.println(maxOperations(nums, k));

    }
}
