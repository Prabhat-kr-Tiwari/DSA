package GreedyAlgorithm.Practice.Medium;

import java.util.Arrays;

public class MinimizetheHeightsII {



    static int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int ans=arr[n-1]-arr[0];
        int mini=0;
        int maxi=0;
        int small=arr[0]+k;
        int large=arr[n-1]-k;
        for (int i = 1; i <=n-1; i++) {

            if (arr[i]>=k){
                mini=Math.min(arr[i]-k,small);
                maxi=Math.max(arr[i-1]+k,large);
                ans=Math.min(ans,maxi-mini);
            }
            else{
                continue;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
      /*  int K = 2, N = 4;
        int Arr[] = {1, 5, 8, 10};*/

       int K= 5;
        int N=10;
        int Arr[] = {8, 1 ,5 ,4 ,7 ,5, 7, 9, 4, 6};
        System.out.println(getMinDiff(Arr,Arr.length,K));



    }
}
