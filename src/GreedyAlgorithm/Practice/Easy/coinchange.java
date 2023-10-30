package GreedyAlgorithm.Practice.Easy;

import java.util.ArrayList;

public class coinchange {



    public static long count(int[] coins, int N, int sum) {
        // code here.

        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        ArrayList<Integer>al2=new ArrayList<>();
        int currsum=0;
        for (int i = 0; i < coins.length; i++) {
            currsum=0;
            al2.clear();
            for (int j = 0; j < coins.length; j++) {
                 currsum+=coins[j];
                 al2.add(coins[j] );
                if (currsum==sum){
                    al.add(al2);

                }

            }

        }
        System.out.println(al);
        return 0;


    }
    public static void main(String[] args) {
       int N = 3, sum = 4;
        int[] coins = {1,2,3};
        count(coins,N,sum);

    }
}
