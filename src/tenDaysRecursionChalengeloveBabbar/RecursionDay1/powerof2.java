package tenDaysRecursionChalengeloveBabbar.RecursionDay1;

public class powerof2 {

    static int power(int n)
    {
        if (n==0) return 1;
        //return 2*power(n-1);
        int smallerProblem=power(n-1);
        int biggerProblem=2*smallerProblem;
        return biggerProblem;
    }

    public static void main(String[] args) {
        System.out.println(power(4));

    }
}
