package GreedyAlgorithm.Practice.Easy;

import java.util.Arrays;

public class MaximizeToys {



    static int toyCount(int N, int K, int arr[])
    {
        // code here

        Arrays.sort(arr);
        int currsum=0;
        int count=0;
        for (int i = 0; i <N ; i++) {

            if (K>=0){
                count++;
                K-=arr[i];
            }
            if (K<0)
            {
                count=count-1;
                break;

            }

        }
        return count;
    }
    public static void main(String[] args) {

       int N = 7;
       int  K = 50;
      int   arr[] = {1, 12, 5, 111, 200, 1000, 10};
        System.out.println(toyCount(N,K,arr));

    }
}
