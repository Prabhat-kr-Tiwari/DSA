package Array4Matrix.Practice;

import java.util.Arrays;

public class maximumTripletProduct {

    static Long maxTripletProduct(Long arr[], int n)
    {
        // Complete the
        Arrays.sort(arr);

        long p1=arr[n-3]*arr[n-2]*arr[n-1];
        long p2=arr[0]*arr[1]*arr[n-1];
        return Math.max(p1,p2);
    }

    public static void main(String[] args) {
        //int a[]={1,2,3,5};
        Long a[]={-3L, -5L, 1L, 0L, 8L, 3L, -2L};
        System.out.println(maxTripletProduct(a,a.length));

    }
}
