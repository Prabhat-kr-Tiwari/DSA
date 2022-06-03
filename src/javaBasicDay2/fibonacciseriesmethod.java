package javaBasicDay2;

public class fibonacciseriesmethod {

    static int fibonacci(int n)
    {
        if (n<=1)
            return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String [] args)
    {
        int N=4;
        for (int i=0;i<N;i++)
        {
            System.out.println(fibonacci(i));
        }

    }
}
