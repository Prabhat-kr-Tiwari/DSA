package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

public class PadovanSequence {


    static int padovanSequence(int n)
    {
        if (n==0||n==1||n==2){
            return 1;
        }
        //code here.
        return (padovanSequence(n-2)+padovanSequence(n-3))%1000000007;
    }
//    dp
    static int padDP(int n){
        int[] dp =new int[n+1];
        for (int i = 0; i <= n; i++) {
            dp[i]=-1;
        }
        return pad(n,dp);


    }
    static int pad(int n, int[] dp){
        if (n==0||n==1||n==2){
            return 1;
        }
        if (dp[n]!=-1){
            return dp[n];
        }
        int result= (pad(n-2,dp)+pad(n-3,dp))%1000000007;
        dp[n]=result;
        return dp[n];

    }

    public static void main(String[] args) {

        System.out.println(padovanSequence(4));
        System.out.println(padDP(4));
    }
}
