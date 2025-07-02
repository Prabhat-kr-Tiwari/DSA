package rbAnjaliCodes.ProblemOfDay25062025;

public class CoinChange {



    static int count(int coins[], int sum) {
        // code here.

        return coinChange(coins,sum)==Integer.MAX_VALUE-1?-1:coinChange(coins,sum);

    }

    //fill this step 1
    //coins  01                   02                     03
     //00    Integer.Maxvalue-1   Integer.Maxvalue-1     Integer.Maxvalue-1
//sum//10
     //20
     //30
     //40

    static int coinChange(int[] coins, int sum){
        int[][] t = new int[coins.length+1][sum+1];
        for (int i = 0; i <=coins.length ; i++) {
            for (int j = 0; j <=sum ; j++) {
                if (i==0){
                    t[i][j] = Integer.MAX_VALUE-1;
                }
                if (j==0){
                    t[i][j] =0;
                }
            }
        }


        //fill the second the row
        for(int i=1;i<=coins.length;i++){
            for (int j = 0; j <=sum ; j++) {
                if (j%coins[0]==0){
                    t[i][j]=j/coins[0];

                }else{
                    t[i][j]=Integer.MAX_VALUE-1;
                }
            }

        }
        t[0][0] = Integer.MAX_VALUE-1;

        return coinChange(coins,sum,t);


    }
    static int coinChange(int coins[], int sum, int t[][]){

        for (int i = 2; i <=coins.length ; i++) {
            for (int j = 2; j <=sum ; j++) {
               if (coins[i-1]<=j){
                   t[i][j]=Math.min(1+t[i][j-coins[i-1]],t[i-1][j]);

               }else{
                   t[i][j]=t[i-1][j];

               }
            }
        }
        return t[coins.length][sum];

    }


    public static void main(String[] args) {
       int coins[] = {1, 2, 3};
        int sum = 4;
        System.out.println(count(coins,sum));
    }
}
