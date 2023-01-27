package Recursion.Recursionandbacktrackingbasic;

public class SumofNNaturalNumber {

    static int sumofnnaturalnumber(int n)
    {
        if(n==0)
            return 0;

        //return sumofnnaturalnumber(n-1)+n;
        int subProblem=sumofnnaturalnumber(n-1);
        return subProblem+n;
    }

    public static void main(String[] args) {
        System.out.println(sumofnnaturalnumber(5));
    }
}
