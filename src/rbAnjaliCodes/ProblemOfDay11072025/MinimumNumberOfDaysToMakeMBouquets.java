package rbAnjaliCodes.ProblemOfDay11072025;

import java.util.Arrays;

//leetcode 1482
public class MinimumNumberOfDaysToMakeMBouquets {

    static boolean possible(int[] bloomDay, int mid, int m, int k){
        int count = 0;
        int noOfB = 0;
        for (int j : bloomDay) {

            if (j <= mid) {
                count++;
            } else {
                noOfB += (count / k);
                count = 0;
            }

        }
         noOfB+=(count/k);
        return noOfB >= m;

    }
    public static int minDays(int[] bloomDay, int m, int k) {

        long val = (long) m *k;
        if (bloomDay.length<val) return -1;
        //find max and min
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
        for (int j : bloomDay) {
            min = Math.min(j, min);
            max = Math.max(j, max);
        }
        System.out.println(min+"  "+max);
        int low = min;
        int high = max;
        while (low<=high){
            int mid = (low+high)/2;
            if (possible(bloomDay,mid,m,k)){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return low;

    }

    public static void main(String[] args) {
       int  []bloomDay =  {1, 10, 3, 10, 2};
       int m = 3, k = 1;
        System.out.println(minDays(bloomDay,m,k));
    }
}
