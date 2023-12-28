package GreedyAlgorithm.Practice.Medium;

import java.util.ArrayList;

public class stockBuyAndSell {



    static ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {
        // code here


        ArrayList<Integer>al=new ArrayList<>();
        ArrayList<ArrayList<Integer>>al1=new ArrayList<ArrayList<Integer>>();

        for (int i = 1; i < A.length; i++) {
            if (A[i]>A[i-1]){
                al.add(i-1);
                al.add(i);
                al1.add(al);
                al=new ArrayList<>();
            }

            
        }
        return al1;
    }

    public static void main(String[] args) {
      int  N = 7;
      int   A[] = {100,180,260,310,40,535,695};
        System.out.println(stockBuySell(A,N));

    }
}
