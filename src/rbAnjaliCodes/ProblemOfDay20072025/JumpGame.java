package rbAnjaliCodes.ProblemOfDay20072025;

public class JumpGame {


    public static boolean canJump(int[] nums) {

        int maxindex=0;
        for (int i = 0; i < nums.length; i++) {
            if (i>maxindex) return false;
            maxindex = Math.max(nums[i]+i,maxindex);
        }
        System.out.println(maxindex);
        return maxindex >= nums.length;
    }

    public static void main(String[] args) {
        int [] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));

    }
}
