package String1.practice;

import java.util.Arrays;

public class minimumdifferencebetweentwoelementinanarray {

    static int minimum_difference(int[] nums)
    {
        // code here
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;
        // int ans1=0;
        for(int i=1;i<nums.length;i++)
        {

            ans=Math.min((nums[i]-nums[i-1]),ans);

        }
        return ans;
    }

    public static void main(String[] args) {
        int a[]={6,18,1,9,14};
        System.out.println(minimum_difference(a));


    }
}
