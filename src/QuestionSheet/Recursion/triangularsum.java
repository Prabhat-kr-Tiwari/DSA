package QuestionSheet.Recursion;

import java.util.Arrays;

public class triangularsum {


    //leetcode
    static void sum(int nums[])
    {
        int temp[]=new int[nums.length-1];
        if(nums.length==1)
        {

            return;
        }



        for(int i=0;i<nums.length - 1;i++)
        {
            int x=(nums[i]+nums[i+1])%10;
            temp[i]=x;
        }
        //System.out.println(Arrays.toString(temp));


        sum(temp);
        System.out.println(Arrays.toString(temp));
        //int b[] = new int[a.length];

        // Copying elements of a[] to b[]
        for (int i = 0; i < temp.length; i++)
            nums[i] = temp[i];


        // Copying elements of a[] to b[]
        System.arraycopy(temp, 0, nums, 0, temp.length);


    }
    //gfg
    static void triangularSum(int nums[])
    {
        int temp[]=new int[nums.length-1];
        if(nums.length < 1)
        {

            return;
        }
        for(int i=0;i<nums.length - 1;i++)
        {
            int x=(nums[i]+nums[i+1]);
            temp[i]=x;
        }
        //System.out.println(Arrays.toString(temp));
        triangularSum(temp);
        System.out.println(Arrays.toString(temp));
        //int b[] = new int[a.length];
        // Copying elements of a[] to b[]
       // System.arraycopy(temp, 0, nums, 0, temp.length);

    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        triangularSum(a);
        //sum(a);
        //System.out.println(a[0]);
    }
}
