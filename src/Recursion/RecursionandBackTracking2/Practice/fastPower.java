package Recursion.RecursionandBackTracking2.Practice;

public class fastPower {

    static int fastpower(int a ,int b)
    {
        int res=1;
        while (b>0)
        {
            if((b&1)!=0)
            {
                res=res*a;

            }
            a=a*a;
            b=b>>1;
        }
        return res;

    }
    static long fastPowerUsingModulo(long a ,long b,int n)
    {
        long res=1;
        while (b>0)
        {
            if((b&1)!=0)
            {
                res=(res%n*a%n)%n;

            }
            a=(a%n*a%n)%n;
            b=b>>1;
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(fastPowerUsingModulo(27267,3,1000000007));
    }

}
