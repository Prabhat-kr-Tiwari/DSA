package GreedyAlgorithm.Practice.Easy;

import java.util.Arrays;
import java.util.Map;

public class SwapandMaximize {



    long maxSum(long arr[] ,int n)
    {

        Arrays.sort(arr);
        int i=0;
        int j=n-1;
        int sum=0;
        while (i<j){

            sum+= Math.abs(arr[i]-arr[j]);

            sum+= Math.abs(arr[i+1]-arr[j]);
        }

        sum+= Math.abs(arr[0]-arr[i]);
        return sum;

    }
    public static void main(String[] args) {

    }
}
