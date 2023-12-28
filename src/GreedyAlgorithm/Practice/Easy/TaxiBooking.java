package GreedyAlgorithm.Practice.Easy;

public class TaxiBooking {


    public static int minimumTime(int N, int cur, int[] pos, int[] time) {
        // code here

        int min=Integer
                .MAX_VALUE;

        for (int i = 0; i <N ; i++) {

            int result=Math.abs(pos[i]-cur)*time[i];
            if (result<min){
                min=result;
            }

        }
        return min;

    }
    public static void main(String[] args) {

       int N = 3, cur = 4;
        int []pos = {1, 5, 6};
       int [] time = {2, 3, 1};
        System.out.println(minimumTime(N,cur,pos,time));

    }
}
