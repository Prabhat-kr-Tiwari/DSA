package ArrayPractice;

public class CoinChange {
    static int count=0;

    static void count(int coins[], int N, int sum) {
        // code here.

        int currsum=0;
       int x=0;
       while (currsum<=sum){
           currsum+=coins[x];
           System.out.println("coins  "+coins[x]);
           if (currsum==sum){

               count++;
               System.out.println("count  "+count);
               x++;
               currsum=0;
           }
       }

       /* for (int i = 0; i < N; i++) {
            System.out.println("i    "+i);
            currsum=0;
            for (int j = i+1; j <N ; j++) {

                currsum=coins[i]+coins[j];
                System.out.println("coins   i  "+coins[i]);
                System.out.println("coins   j  "+coins[j]);
                if(currsum==sum){
                    System.out.println("inside equals"+currsum);
                    count++;
                }


            }
            System.out.println("currsum      "+currsum);
            System.out.println("-----------------");

        }*/
        //System.out.println(count);
    }

    public static void main(String[] args) {

        int N = 4, sum = 10;
       int  coins[] = {2,5,3,6};
        count(coins,N,sum);




    }
}
