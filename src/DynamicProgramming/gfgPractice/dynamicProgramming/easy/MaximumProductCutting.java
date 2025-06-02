package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

public class MaximumProductCutting {


   /* static int maxProduct(int n)
    {
        // Your code goes here
 *//*       if(n==2) return 1;
        if(n==1) return 0;
        if(n==3) return 2;*//*
        int max=Integer.MIN_VALUE;
        for (int i = 1; i <=n ; i++) {
             max=Math.max(max,i*(n-i));
        }
        return max;
    }*/
  /* static int maxProduct(int n)
   {
       int dp[] = new int[n+1];
       dp[0] = dp[1] = dp[2] = 1;
       for(int i=3; i<=n; i++)
       {
           System.out.println("i--->  "+i);
           for(int j=1; j<i; j++)
           {
               System.out.println("dp[i]-->"+ dp[i]+"j*Math.max(dp[i-j], i-j)"+"j--->"+j+"dp[i-j]---->"+dp[i-j]+"i-j--->"+(i-j));
               dp[i] = Math.max(dp[i], j*Math.max(dp[i-j], i-j));
               dp[i] %= 1000000007;
           }
           //System.out.print(dp[i]+ " ");
       }

       return dp[n];

   }*/

    static int maxProduct(int n) {
        // Handle base cases for n = 2 and n = 3
        if (n == 2 || n == 3) {
            return n - 1;
        }

        // Initialize weight and value arrays
        int[] wt = new int[n];
        int[] val = new int[n];

        for (int i = 0; i < n; i++) {
            wt[i] = i + 1;  // Assigning weights (could represent integers from 1 to n)
            val[i] = i + 1; // Assigning values (same as weights for this problem)
        }

        // Initialize the DP table with (n+1) rows and (n+1) columns
        int[][] t = new int[n + 1][n + 1];

        // Fill the DP table with base cases
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    t[i][j] = 0;  // Base case: If no items, product is 0
                }
                if (j == 0) {
                    t[i][j] = 1;  // Base case: If no weight, the product is 1
                }
            }
        }

        // Main logic for unbounded knapsack variation
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (wt[i - 1] <= j) {
                    t[i][j] = Math.max(val[i - 1] * t[i][j - wt[i - 1]], t[i - 1][j]) % 1000000007;
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        // Return the maximum product from the DP table
        return t[n][n];
    }



    public static void main(String[] args) {

        System.out.println(maxProduct(5));
    }
}
