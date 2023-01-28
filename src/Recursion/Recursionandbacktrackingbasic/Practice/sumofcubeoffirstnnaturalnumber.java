package Recursion.Recursionandbacktrackingbasic.Practice;
//Given and integer N.Calculate the sum of series 13 + 23 + 33 + 43 + … till N-th term.
public class sumofcubeoffirstnnaturalnumber {


    static int sum(int n)
    {
        if (n==1)
            return 1;
        int subproblem=sum(n-1);
        return subproblem+(int)Math.pow(n,3);
    }

    public static void main(String[] args) {
        System.out.println(sum(2));

    }
}
