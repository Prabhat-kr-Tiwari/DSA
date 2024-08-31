package GreedyAlgorithm.Practice.Medium;

import GreedyAlgorithm.LoveBabbarYoutubeGreedy.MaximumMeetingInOneRoom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Maximumnumberofeventsthatcanbeattended {


    static int[][] convertToEvents(int[] start, int[] end) {
        int N = start.length;
        int[][] events = new int[N][2];

        for (int i = 0; i < N; i++) {
            events[i][0] = start[i];
            events[i][1] = end[i];
        }

        return events;
    }


    static int maxEvents(int[] start, int[] end, int N) {


        int[][] events = convertToEvents(start, end);
        System.out.println(Arrays.deepToString(events));
        Arrays.sort(events,(a,b)->a[0]-b[0]);
        System.out.println(Arrays.deepToString(events));

        int day=0,index=0,n=events.length,result=0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        while(!pq.isEmpty() || index<n){
            if(pq.isEmpty()){
                day = events[index][0];
            }
            while(index<n && events[index][0]<=day){
                pq.offer(events[index][1]);
                index++;
            }
            pq.poll();
            day++;
            result++;
            while(!pq.isEmpty() && pq.peek()<day){
                pq.poll();
            }
        }
        return result;

    }
    public static void main(String[] args) {

       int  N = 4;
       int  start[] = {1, 2, 3,1};
       int end[] = {2, 3, 4,4};
        System.out.println(maxEvents(start,end,N));

    }
}
