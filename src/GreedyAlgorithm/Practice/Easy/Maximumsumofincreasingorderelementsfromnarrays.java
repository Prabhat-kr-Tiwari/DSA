package GreedyAlgorithm.Practice.Easy;

import java.util.Arrays;

public class Maximumsumofincreasingorderelementsfromnarrays {


    // Function for finding maximum and value pair
   /* public static int maximumSum (int n, int m, int a[][]) {
        //Complete the function
        int max=-1;
        int currmax=0;
        int sum=0;

        for (int i = n-1; i >= 0; i--) {

            for (int j = m-1; j >= 0; j--) {
                System.out.println(a[i][j]);
                max=0;
                int curr=a[i][j];
                if (curr>max){
                    max=curr;
                }
//                max = Math.max(max, a[i][j]);
            }
//            sum+=max;
            System.out.println("max: " + max);
            System.out.println("New");
        }

        return 1;
    }*/

    public static int maximumSum (int n, int m, int a[][]) {
        //Complete the function


        int max=Integer.MAX_VALUE;
        int sum=0;
        int curr=0;
        int count=0;

        for (int i = 0; i < a.length; i++) {
            Arrays.sort(a[i]);
        }

        for (int i = n-1; i >= 0; i--) {



            for (int j = m-1; j >= 0; j--) {
                if (a[i][j]<max){
                    count++;
//                    System.out.println(a[i][j]);
                    sum+=a[i][j];
                     curr=a[i][j];
                    max=curr;
                    break;
                }
//                System.out.println(max);


            }






        }
//        System.out.println("sum"+sum);

        if (count!=n){
            sum=0;
        }


        return sum;
    }

    public static void main(String[] args) {
       /* int a[][]=  {{1,7,4,3}, {4,2,5,1}, {9,5,1,8}};*/
       int a[][]= {  { 6 ,7, 1, 5, 7},
        {3 ,1 ,7 ,9 ,5},
    { 2 ,7 ,8 ,7, 3},
       { 4 ,6 ,2, 5 ,3},
                { 5 ,4 ,6 ,8 ,10},
                {3 ,2 ,1, 1, 5}
                ,{2 ,6 ,2 ,2 ,3}};
        int n = a.length; // Number of rows
        int m = a[0].length; // Number of columns
        System.out.println(maximumSum(n,m,a));

    }
}
