package Recursion.DoubtRecursion;
/*
Input: N = 17, A = 10, B = 11, C = 3
        Output: 3
        Explanation:
        The maximum cut can be obtain after making 2 cut of length 3 and one cut of length 11.

        Input: N = 10, A = 9, B = 7, C = 11
        Output: -1
        Explanation:
        It is impossible to make any cut so output will be -1.*/
public class RodCuttingProblem {

    static int maxRods(int N,int a,int b,int c)
    {
        if (N==0) return 0;
        if (N<0) return -1;
        int cutA=maxRods(N-a,a,b,c);
        int cutB=maxRods(N-b,a,b,c);
        int cutC=maxRods(N-c,a,b,c);
        int res= Math.max(cutA,Math.max(cutB,cutC));
        if (res==-1) return -1;
        return res;

    }
    public static void main(String[] args) {
        System.out.println(maxRods(25,15,7,13));

    }
}
