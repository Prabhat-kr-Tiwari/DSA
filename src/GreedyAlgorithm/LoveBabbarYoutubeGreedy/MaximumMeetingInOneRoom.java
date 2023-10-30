package GreedyAlgorithm.LoveBabbarYoutubeGreedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumMeetingInOneRoom {


    static class Pair implements Comparable<Pair> {

        int s, e, i;

        public Pair(int s, int e, int i) {
            this.e = e;
            this.s = s;
            this.i = i;
        }

        public int compareTo(Pair that) {
            return this.e - that.e;
        }
    }

    public static ArrayList<Integer> maxMeetings(int n, int[] s, int[] f) {


        // code here
        ArrayList<Integer> al = new ArrayList<>();

        Pair[] a = new Pair[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Pair(s[i], f[i], i + 1);
        }
        
        Arrays.sort(a);


        int lastfinishtime = -1;

        for (int i = 0; i < n; i++) {


            if (a[i].s > lastfinishtime) {
                al.add(a[i].i);
                lastfinishtime = a[i].e;
            }
        }

        Collections.sort(al);
        return al;


    }

    //    {1,2,4,5}
    public static void main(String[] args) {

        int N = 10;
        int[] S = {12, 6, 16, 12, 6, 9, 16, 6, 17, 5};
        int[] F = {17, 13, 16, 18, 17, 10, 18, 12, 18, 11};

        ArrayList<Integer> result = maxMeetings(N, S, F);

        int i = 0;
        for (int meetingIndex : result) {

            System.out.print(meetingIndex + " ");
        }

    }
}
