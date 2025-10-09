package leetcode75.TwoPointers.MoveZeroes;

public class MoveZeros {


    static void moveZeroes(int[] nums) {


        int count =0;
        for(int i=0;i< nums.length;i++){

            if (nums[i]!=0){
                nums[count++]= nums[i];
            }

        }
        while (count<nums.length){
            nums[count++]=0;
        }
        for(int num:nums){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {

        int [] nums = {0,1,0,3,12};
//        Output: [1,3,12,0,0]
        moveZeroes(nums);
    }
}
