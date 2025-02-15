package DynamicProgramming.gfgPractice;

import java.util.Arrays;

public class firstnfibonacci {


    public static int[] fibonacciNumbers(int n) {
       int[] a =new int[n];
       int first=0;
       int second=1;
        for (int i = 0; i <n ; i++) {
            if (i==0){
                a[i]=0;
            } else if (i==1) {
                a[i]=1;
            } else{
                int third=first+second;
                a[i]=third;
                first=second;
                second=third;
            }

        }
        return a;

    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(fibonacciNumbers(2)));
    }
}
