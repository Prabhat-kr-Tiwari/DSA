package ArrayPractice;

import java.util.Arrays;

public class productarray {

    public static long[] productExceptSelf(int nums[], int n)
    {
        long res=1;
        // code here
        long a[]=new long[n];
        for(int i=0;i<n;i++){
            res=1;
            for (int j = 0; j <n ; j++) {
                if (i!=j){
                    res*=nums[j];
                }


            }
            a[i]=res;
        }
        return a;
    }

    public static void main(String[] args) {
       int n = 5;
       int nums[] = {10, 3, 5, 6, 2};
        System.out.println(Arrays.toString(productExceptSelf(nums, n)));

    }
}
