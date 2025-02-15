package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

import java.util.Arrays;
import java.util.Comparator;

public class Pairswithcertaindifference {



    public static int maxSumPairWithDifferenceLessThanK(int[] arr, int N, int K)
    {
        int ans=0;
        Arrays.sort(arr);
        int i=N-1;
        while (i>0){

            if (Math.abs(arr[i]-arr[i-1])<K){
                ans+=arr[i]+arr[i-1];
               i-=2;
            }
            else{
                i--;
            }


        }
        return ans;
    }
    public static void main(String[] args) {

        int[] arr = {3, 5, 10, 15, 17, 12, 9};
       int  K = 4;
//        Output :
//        62
//        than K are, (3, 5), (10, 12), (15, 17)
//        disjoint pairs is,(3, 5), (9, 12), (15, 17)
        System.out.println(arr.length);
        System.out.println(maxSumPairWithDifferenceLessThanK(arr,arr.length,K));
    }
}
