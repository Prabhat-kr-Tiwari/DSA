package GreedyAlgorithm.LoveBabbarYoutubeGreedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class ChocolateDistributionProblem {



    public static long findMinDiff(ArrayList<Integer> a, int n, int m)
    {
        // your code here

        Collections.sort(a);
        int i=0;
        int j=m-1;
        int mini=Integer.MAX_VALUE;
        while (j<a.size()){
            int diff=a.get(j)-a.get(i);
            mini= Math.min(diff,mini);
            i++;
            j++;

        }
        return mini;
    }
    public static void main(String[] args) {
        int N = 8, M = 5;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // Add the elements to the ArrayList
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(1);
        arrayList.add(9);
        arrayList.add(56);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(12);



        System.out.println(findMinDiff(arrayList,N,M));

    }
}
