package GreedyAlgorithm.Practice.Medium;

import java.util.Arrays;

public class SmallestNumber {

    static String smallestNumber(int s, int d){
        // code here
        if(s==0){
            if(d==1){
                System.out.println("0");
                return "0";
            }else {
                System.out.println("not possible");

            }


        }
        if (s > 9 * d) {
            System.out.println("Not possible");
        }
        int[] res = new int[d + 1];

        s -= 1;

        for (int i = d - 1; i > 0; i--) {
            if (s > 9) {
                res[i] = 9;
                s -= 9;
            } else {
                res[i] = s;
                s = 0;
            }
        }

        res[0] = s + 1;

        StringBuilder stringBuilder=new StringBuilder();
        String str="";

        for (int i = 0; i < d; i++) {

            stringBuilder.append(res[i]);
            str=str+res[i];
        }
        String numbersAsString = Arrays.toString(res);
        System.out.println("Array as String: " + numbersAsString);
        System.out.println(stringBuilder);
        System.out.println("str"+str);
        return numbersAsString;


    }


    static void findSmallest(int m, int s) {
        if (s == 0) {
            if (m == 1) {
                System.out.println("Smallest number is 0");
            } else {
                System.out.println("Not possible");
            }
            return;
        }

        if (s > 9 * m) {
            System.out.println("Not possible");
            return;
        }

        int[] res = new int[m + 1];

        s -= 1;

        for (int i = m - 1; i > 0; i--) {
            if (s > 9) {
                res[i] = 9;
                s -= 9;
            } else {
                res[i] = s;
                s = 0;
            }
        }

        res[0] = s + 1;

        StringBuilder stringBuilder=new StringBuilder();
        System.out.print("Smallest number is ");
        for (int i = 0; i < m; i++) {
            System.out.print(res[i]);
            stringBuilder.append(res[i]);
        }
        System.out.println(stringBuilder);
    }
    public static void main(String[] args) {

       int S = 9;
        int D = 2;
        System.out.println(smallestNumber(S,D));
        int a[]={1,2,3};
        System.out.println(Arrays.toString(a));
    }
}
