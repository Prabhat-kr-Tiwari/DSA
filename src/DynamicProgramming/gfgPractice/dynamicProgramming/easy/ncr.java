package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

public class ncr {


    static long ncr(int n, int r){
        //complete the function here
        long upper=1;
        long N=n;
        long R=n-r;
        long lower=1;
        long RR=r;

        while (N>0){
            upper=(upper*N)%1000000007;
            N--;
        }

        System.out.println("upper"+upper);
        while (R>0){
            lower=(lower*R)%1000000007;
            R--;
        }
        System.out.println("lower"+lower);

        long rFactorial=1;
        while (RR>0){
            rFactorial=(rFactorial*RR)%1000000007;
            RR--;
        }
        if(upper==0) return 0;
        if(lower==0) return 0;
        if(rFactorial==0) return 0;
        System.out.println("rfactorial"+rFactorial);
        long result=upper%1000000007/( rFactorial *lower)%1000000007;
        return result%1000000007;

    }
    static int c(int n,int r){
        int dp[]=new int[r+1];
        dp[0]=1;
        if (r>n) return 0;
        if(r==0||r==n){
            return 1;
        }
        if (r>n-r){
            r=n-r;
        }
        int mod=1000000007;
        for (int i = 0; i <=n ; i++) {
            for (int j = Math.min(i,r); j >0 ; j--) {
                dp[j]=(dp[j]+dp[j-1])%mod;
            }
        }
        return dp[r];
    }
    public static void main(String[] args) {

        int n=778 ,r=116;


        System.out.println(c(n,r));
    }
}
