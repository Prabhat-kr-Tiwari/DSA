package tenDaysRecursionChalengeloveBabbar.RecursionDay1;

public class factorial {
    static int fact(int n)
    {
        if(n==0) return 1;

        //return n*fact(n-1);
        int choOtiProblem=fact(n-1);
        int badiProblem=n*choOtiProblem;
        return badiProblem;
    }
    static int factWithoutBase(int n)
    {
        /*if(n==0) return 1;*/
        System.out.println(n);

        //return n*fact(n-1);
        //int choOtiProblem=fact(n-1);
        //int badiProblem=n*choOtiProblem;
        return n*factWithoutBase(n-1);
    }

    public static void main(String[] args) {
        //System.out.println(fact(5));
        System.out.println(factWithoutBase(5));

    }
}
