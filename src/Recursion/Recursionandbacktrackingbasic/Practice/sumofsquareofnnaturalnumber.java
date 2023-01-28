package Recursion.Recursionandbacktrackingbasic.Practice;

public class sumofsquareofnnaturalnumber {

    static int square(int n)
    {
        int sum=0;
        for (int i = 1; i <=n; i++) {
             sum+=(i*i);

        }
        return sum;
    }

    static int sumofSquarennaturalnumber(int n)
    {
        if(n==1)
            return 1;

        //return sumofnnaturalnumber(n-1)+n;
        int subProblem=sumofSquarennaturalnumber(n-1);
        return subProblem+(int)Math.pow(n,2);
    }

    public static void main(String[] args) {

        System.out.println(sumofSquarennaturalnumber(3));
       // System.out.println(square(3));
    }
}
