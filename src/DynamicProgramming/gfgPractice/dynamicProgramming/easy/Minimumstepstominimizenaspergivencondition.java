package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

public class Minimumstepstominimizenaspergivencondition {



    static int minSteps(int N)
    {
        // Your code goes here

        int count=0;
        if (N==1){
            return 0;
        }
        int evenResult=0;
        int oddResult=0;

        while (N>1){
            if (N%2==0){
                 evenResult=Math.min(minSteps(N=N/2),minSteps(N=N-1));
            }else{
                 oddResult=Math.min(minSteps(N=N/3),minSteps(N=N-1));
            }

        }
        return Math.max(evenResult,oddResult);
    }
    static int sol(int n){
        int res=0;
        while (n!=1){
            if (n%2==0){
                n=n/2;
                
            } else if (n==3) {
                res=2;
                break;
            } else if ((n&3)==1) {
                n=n-1;
            }else if ((n&3)==3){
                n=n+1;
            }
            res++;


        }
        return res;
    }

    static int minStepDp(int n){

        int[] dp =new int[n+1];
        for (int i = 0; i <= n; i++) {
            dp[i]=-1;
        }
        return minStep(n,dp);
    }
    static int minStep(int n,int dp[]){
        if (n<1) return Integer.MAX_VALUE;
        if(n==1) return 0;
        if (n==2) return dp[n]=1;
        int minusOne=1+minStep(n-1,dp);
        if (dp[n]!=-1) return dp[n];
        int div2=Integer.MAX_VALUE;
        int div3=Integer.MAX_VALUE;
        if (n%2==0){
            div2=1+minStep(n/2,dp);
        }
        if (n%3==0){
            div3=1+minStep(n/3,dp);
        }
        return dp[n]=Math.min(minusOne,Math.min(div2,div3));
    }
    public static void main(String[] args) {

        System.out.println(sol(4));
        System.out.println(minStepDp(5));
    }
}
