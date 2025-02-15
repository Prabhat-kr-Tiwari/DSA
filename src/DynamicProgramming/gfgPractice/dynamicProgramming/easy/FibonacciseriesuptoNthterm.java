package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

import java.util.Arrays;

public class FibonacciseriesuptoNthterm {


//0 1 1 2 3 5
    static int[] Series(int n) {
        // code here
        int[] a =new int[n+1];
        int first=0;
        int second=1;
        int third=0;
        a[0]=first;
        a[1]=second;
        for (int i = 2; i <= n; i++) {
            third=first+second;
            a[i]=third;
            first=second;
            second=third;

        }
        return a;

    }
    public static void main(String[] args) {

        int n=5;
        System.out.println(Arrays.toString(Series(n)));
    }
}
