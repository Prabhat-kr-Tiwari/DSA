package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

public class DivisorGame {


    static int recursiveDivisorGame(int n){
        if(n==1) return 0;
        else {
            for (int i = 1; i < n; i++) {
                if(n%i==0){
                    if(recursiveDivisorGame(n-1)==0) return 1;
                }
            }
            return 0;
        }

    }
    public static boolean divisorGame(int n) {
        // code here
        return true;
    }

    //dp
    static boolean recursiveDivisorGameDp(int n){

        Boolean [] dp =new Boolean[n+1];

        boolean result= divisorGameDp(n,dp);


        return result;

    }
    public static boolean divisorGameDp(int n, Boolean[] dp) {
        if(n==1) return false;
        if (dp[n]!=null){
            return dp[n];
        }

            for (int i = 1; i < n; i++) {
                if(n%i==0){
                    if(!divisorGameDp(n - i,dp)) return dp[n]=true;
                }
            }
            return dp[n]=false;


    }

    public static void main(String[] args) {

        System.out.println(2%1);
        System.out.println(recursiveDivisorGame(2));
        System.out.println(recursiveDivisorGameDp(2));
    }
}
