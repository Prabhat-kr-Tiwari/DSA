package Array3.PracticeProblems;

import java.util.Arrays;

public class rotateAnArrayByOneStep {
    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp=arr[0];

        for(int i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return arr;

    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        //System.out.println(rotateArray(a,a.length-1));
        System.out.println(Arrays.toString(rotateArray(a,5)));
    }
}
