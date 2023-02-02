package tenDaysRecursionChalengeloveBabbar.RecursionDay1;

public class printCounting {

    static void counting(int n)
    {
        if (n==0)
            return ;
        System.out.println(n);
        counting(n-1);

    }

    public static void main(String[] args) {
        counting(5);
    }

}
