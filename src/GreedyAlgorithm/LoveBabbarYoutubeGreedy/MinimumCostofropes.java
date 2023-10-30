package GreedyAlgorithm.LoveBabbarYoutubeGreedy;

import java.util.PriorityQueue;

public class MinimumCostofropes {

   static long minCost(long arr[], int n)
    {
        // your code here

        PriorityQueue<Long>pq=new PriorityQueue<Long>();

        for (long e:arr
             ) {
            pq.add(e);

        }
        long ans=0;
        while (pq.size()>1){
            long first=pq.poll();
            long second=pq.poll();
            long cost=first+second;
            ans+=cost;

            pq.add(cost);
        }
        return ans;

    }

    public static void main(String[] args) {

       int  n = 4;
        long arr[] = {4, 3, 2, 6};
        System.out.println(minCost(arr,n));
    }
}
