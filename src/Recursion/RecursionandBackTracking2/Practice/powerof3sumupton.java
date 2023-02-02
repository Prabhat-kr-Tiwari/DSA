package Recursion.RecursionandBackTracking2.Practice;

//https://practice.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1
public class powerof3sumupton {

    static long sumOfSeries(long N) {
        // code here
        if(N==0)
            return 0;
        long sum=0;
        for(int i=1;i<=N;i++)
        {
            sum+=fastpower(i,3);
        }
        return sum;
    }
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

    public static void main(String[] args) {
        System.out.println(sumOfSeries(5));
    }
}
