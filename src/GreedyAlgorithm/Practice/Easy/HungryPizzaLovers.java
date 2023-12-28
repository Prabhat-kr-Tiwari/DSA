package GreedyAlgorithm.Practice.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class HungryPizzaLovers {


    static class Pair implements Comparable<Pair>{

        int s,index;
        public  Pair(int s,int index){
            this.s=s;
            this.index=index;

        }
        public int compareTo(Pair o1) {
            return this.s-o1.s;
        }
    }


    // Function for finding maximum and value pair
    public static ArrayList<Integer> permute (int arr[][], int n) {
        //Complete the function
        ArrayList<Integer>al=new ArrayList<>();
        int sum=0;

        int a[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            sum=0;
            for (int j = 0; j < arr[0].length ; j++) {

                sum+=arr[i][j];

            }
            a[i]=sum;

        }


        Pair []pairs=new Pair[n];
        for (int i = 0; i < n; i++) {
            pairs[i]=new Pair(a[i],i+1);

        }
        Arrays.sort(pairs);
        System.out.println("this is sum array");
        for (Pair e:pairs
        ) {
            System.out.println(e.index);
            al.add(e.index);

        }
        return al;
    }
    public static void main(String[] args) {


       int  arr[][] = {{4,1}, {6,2}, {7,6},
            {8,1}, {1,3}};
        System.out.println(permute(arr, arr.length));
    }
}
