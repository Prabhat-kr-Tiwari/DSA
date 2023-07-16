package A2ZDSA_Course.ARRAYS.MEDIUM;

import java.util.HashMap;

public class CountSubarraySumEqualsK {
    //brute force
    //TC: O(n3) big oh of n cube
    public static int findAllSubarraysWithGivenSum(int arr[], int k) {
        int n = arr.length; // size of the given array.
        int cnt = 0; // Number of subarrays:

        for (int i = 0; i < n; i++) { // starting index i
            for (int j = i; j < n; j++) { // ending index j

                // calculate the sum of subarray [i...j]
                int sum = 0;
                for (int K = i; K <= j; K++)
                    sum += arr[K];

                // Increase the count if sum == k:
                if (sum == k)
                    cnt++;
            }
        }
        return cnt;
    }

    //tc : O(n2) big oh of n square
    public static int findAllSubarraysWithGivenSum2(int arr[], int k) {

        int n = arr.length;

        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n ; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }


            }

        }
        return count;

    }
    public static int findAllSubarraysWithGivenSum3(int arr[], int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int count=0;
        int prefixsum=0;
        int n=arr.length;
        hm.put(0,1);
        for (int i = 0; i < n; i++) {
            prefixsum+=arr[i];
            int remove=prefixsum-k;
            count+=hm.getOrDefault(remove,0);
            hm.put(prefixsum,hm.getOrDefault(prefixsum,0)+1);

        }
        return count;

    }



    public static void main(String[] args) {


        int[] nums = {1, 1, 1};
        int k = 2;
        //System.out.println(sum(nums,k));
        System.out.println(findAllSubarraysWithGivenSum3(nums, k));

    }
}
