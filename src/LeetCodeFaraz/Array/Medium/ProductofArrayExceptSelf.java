package LeetCodeFaraz.Array.Medium;

public class ProductofArrayExceptSelf {

    public static void productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];

        int leftproduct=0;
        int rightproduct=0;
        int i=0;
        int k=0;
        for (; i < nums.length; i++) {

            leftproduct=1;
            rightproduct=1;
            int x=0;
            while (x<i){
                leftproduct*=nums[x++];
            }
            int y=i+1;
            while (y< nums.length){
                rightproduct*=nums[y++];
            }
            ans[k]=leftproduct*rightproduct;
            k++;

        }
        for (int e:ans
             ) {
            System.out.println(e);

        }


    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        productExceptSelf(nums);


    }
}
