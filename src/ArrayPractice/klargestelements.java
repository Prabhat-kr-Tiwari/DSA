package ArrayPractice;

import java.util.Arrays;

public class klargestelements {

    static int[] kLargest(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int a[]=new int[k];
        int j=0;
        for(int i=n-1;i>=n-a.length;i--){
            a[j++]=arr[i];
        }
        return a;
    }


    public static void main(String[] args) {

       int N = 5, K = 2;
       int  Arr[] = {12, 5, 787, 1, 23};
        System.out.println(Arrays.toString(kLargest(Arr, N, K)));

    }
}
