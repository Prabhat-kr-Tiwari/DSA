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

    public static void main(String[] args) {

        //System.out.println(printdivisor(6));
       // printdivisor(25);
        printdivisormodified(30);
    }
}
