package DynamicProgramming.AdityaVerma.UnBoundedKnapSack;

import java.util.Arrays;

public class RodCutting {

    static int cutRod(int price[], int n) {
        //code here

        int wt[]=new int[n];
        for (int i = 0; i <n ; i++) {
            wt[i]=i+1;
        }

        return knapSack(n,wt,price,n);

    }

    static int knapSack(int W, int wt[], int val[], int n) {


        int t[][] = new int[n + 1][W + 1];
       /* for (int i = 0; i <= n; i++) {
            Arrays.fill(t[i], -1);
        }*/
        return knapSack(W, wt, val, n, t);
    }

    static int knapSack(int W, int wt[], int val[], int n, int t[][]) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }
               else if (wt[i - 1] <= j) {
                    t[i][j] = Math.max(val[i - 1] + t[i][j - wt[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=W ; j++) {
                System.out.print(t[i][j]+"  ");
            }
            System.out.println();
        }
        return t[n][W];


    }


    public static void main(String[] args) {
        int length[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};


        int pricen[]={3 ,5, 8, 9, 10, 17, 17, 20};
        int n = 8;
        System.out.println(knapSack(n,length,pricen,n));
//        System.out.println(cutRod(price,n));

    }
}
