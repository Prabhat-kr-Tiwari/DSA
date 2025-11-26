package slidingWIndow.gfgPractice.slidingWIndowTag.easy.SubarraywithGivenSum;

import java.util.ArrayList;

/*Subarray with Given Sum
Difficulty: EasyAccuracy: 24.25%Submissions: 3K+Points: 2Average Time: 20m
You are given an array arr[] and an integer sum. You need to return the start and end (1-Based) indexes of a subarray whose sum is equal to the given sum.
If many such sub-array are present, return the indexes which comes first moving from left to right. If no such sub-array is present return empty array

Examples:

Input: arr[] = [15, 2, 4, 8, 9, 5, 10, 23], sum = 23
Output: 2 5
Explanation : Sum of elements between indices 2 and 5 is 2+4+8+9 = 23
Input: arr[] = [1, 4, 0, 0, 3, 10, 5], sum = 7
Output: 2 5
Explanation: Sum of elements between indices 2 and 5 is 4+0+0+3 = 7
Input: arr[] = [1, 4], sum = 0
Output: []
Explanation: There is no subarray with 0 sum
Constraints:
        1 ≤ arr.size ≤ 106
        0 ≤ arr[i] ≤ 105*/
public class SubarraywithGivenSum {

     static ArrayList<Integer> subarraySum(int[] arr, int sum) {
        // Your code here

         int i=0;
         int j=0;
         int size= arr.length;
         ArrayList<Integer> ans = new ArrayList<>();
         if (sum==0) return ans;
         int currSum=0;
         while (j<size){
             currSum+=arr[j];
             System.out.println("arr[j]  "+arr[j]);

             if (currSum<sum){
                 j++;
             }
             else if (currSum==sum){
                 ans.add(i+1);
                 ans.add(j+1);
                 return  ans;
             }else if (currSum>sum){
                 while (currSum>sum){
                     currSum-=arr[i];
                     i++;
                 }
                 if (currSum == sum) {
                     ans.add(i + 1);
                     ans.add(j + 1);
                     return ans;
                 }
                 j++;
             }

         }
         return ans;

    }
    public static void main(String[] args) {


        int  arr1[] = {1, 4, 0, 0, 3, 10, 5};
        int sum1 = 7;

        System.out.println(subarraySum(arr1,sum1));
    }
}
