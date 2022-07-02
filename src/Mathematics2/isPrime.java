package Mathematics2;

public class isPrime {
    static boolean isPrimeNumber(int n)
    {
        if(n==1) return false;
        for (int i = 2; i <n ; i++) {
            if (n%i==0)
                return false;
        }
        return true;
    }
     static boolean isPrimeNumberEfficient(int n)
    {
        if(n==1) return false;
        for (int i = 2; i*i <= n; i++) {
            if (n%i==0)
                return false;
        }
        return true;
    }
    static boolean isPrimeMoreEfficient(int n)
    {
        if(n==1) return false;
        if (n==2||n==3) return true;
        if (n%2==0||n%3==0) return false;
        for (int i = 5; i <=n ; i+=6) {
            if (n%i==0||n%(i+2)==0)
                return false;

        }
        return  true;
    }
    public static void main(String[] args) {
        //System.out.println(isPrimeNumber(4));
        System.out.println(isPrimeNumberEfficient(30));

        //System.out.println( isPrimeMoreEfficient(4));

    }
}
