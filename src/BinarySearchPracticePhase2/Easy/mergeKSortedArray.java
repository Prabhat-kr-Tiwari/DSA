package BinarySearchPracticePhase2.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class mergeKSortedArray {



    static String isKSortedArray(int arr[], int n, int k)
    {
        // code here
        HashMap<Integer,Integer>hm=new HashMap<>();

        for (int i = 0; i < n; i++) {
            hm.put(arr[i],i );

        }
       // System.out.println(hm);
        Arrays.sort(arr);
        for (int i = 0; i < n; ++i) {

            if (Math.abs(hm.get(arr[i])-i)>k){

                return "No";
            }

        }
        return "yes";
        //System.out.println(hm);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 5, 6, 4};
        int K = 2;
        int a[]={18 ,44, 12, 27, 4, 19, 42, 8 ,34, 15, 38, 5, 16, 47, 1, 6, 32, 40, 10, 33, 22};
        int k=18;
        System.out.println(isKSortedArray(a, a.length ,k));

    }
}
