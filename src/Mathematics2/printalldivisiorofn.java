package Mathematics2;

public class printalldivisiorofn {
    static void printdivisor(int n)
    {
        for (int i = 1; i*i <=n ; i++) {
            if (n%i==0)
            {
                System.out.println(i);
                System.out.println(n/i);
            }

        }
    }
    static void printdivisormodified(int n)
    {
        for (int i = 1; i*i <=n ; i++) {
            if (n%i==0)
            {
                System.out.println(i);
                if (n/i!=i)
                {
                    System.out.println(n/i);
                }

            }

        }
    }
    static long sumofDivisor(long n)
    {
        long sum =0;
        for (long i = 1; i*i <=n ; i++) {
            if (n%i==0)
            {
                sum+=i;
                //System.out.println(i);
                if (n/i!=i)
                {
                    sum+=(n/i);
                    //System.out.println(n/i);
                }

            }

        }
        return sum;
    }

    public static void main(String[] args) {

        //System.out.println(printdivisor(6));
       //printdivisor(4);
       // printdivisormodified(4);
        System.out.println("sum");
        System.out.println(sumofDivisor(4));
    }
}
