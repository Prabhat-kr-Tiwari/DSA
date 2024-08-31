package DynamicProgramming.AdityaVerma.UnBoundedKnapSack;

public class CoinChangeMinimumNoWays {


    static int minCoins(int coins[], int M, int V)
    {
        // Your code goes here
        System.out.println("MAX_VALUE "+Integer.MAX_VALUE);

        return coinChange2(coins,M,V)==Integer.MAX_VALUE-1?-1:coinChange2(coins,M,V);
    }

    static int coinChange2(int a[],int n,int sum){
        int t[][]=new int[n+1][sum+1];
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=sum ; j++) {
                if (i==0){
                    t[i][j]=Integer.MAX_VALUE-1;
                }
                if (j==0){
                    t[i][j]=0;
                }

            }
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <=sum ; j++) {
                if (j%a[0]==0){
                    t[i][j]=j/a[0];
                }else{
                    t[i][j]=Integer.MAX_VALUE-1;
                }
            }
        }
        t[0][0]=Integer.MAX_VALUE-1;
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=sum ; j++) {
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
        return coinChange2(a,n,sum,t);


    }
    static int coinChange2(int a[],int n,int sum,int t[][]){

        for (int i = 2; i <=n ; i++) {
            for (int j = 2; j <=sum ; j++) {
                if (a[i-1]<=j){
                    t[i][j]=Math.min(1+t[i][j-a[i-1]],t[i-1][j]);
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }

        return t[n][sum];




    }



    public static void main(String[] args) {
        int a[]={15,1};
        int sum=4;
        System.out.println(minCoins(a,a.length,sum));
    }
}
