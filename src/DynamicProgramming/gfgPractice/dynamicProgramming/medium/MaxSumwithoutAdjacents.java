package DynamicProgramming.gfgPractice.dynamicProgramming.medium;

import java.util.Arrays;

public class MaxSumwithoutAdjacents {




   static int findMaxSum(int arr[]) {
        // code here

        return solve(arr,arr.length-1);


    }

   static int solve(int[] a, int n){
        if(n==0) return a[0];
        if (n<0) return 0;
        int inc=solve(a,n-2)+a[n];
        int excl=solve(a,n-1)+0;
        return Math.max(inc,excl);

    }

    //memo

    static int findMaxSumDp(int[] arr) {
        // code here
        int n=arr.length;
        //dp should me more +1 than the size
        int[] dp =new int[n];
        Arrays.fill(dp,-1);
         solveDp(arr,arr.length-1,dp);
       /*  for (int e:dp){
             System.out.print(e+"  ");
         }*/
         //return the last element
         return dp[n-1];
    }
    static int solveDp(int[] a, int n, int[] dp){
        if(n==0) return a[0];
        if (n<0) return 0;
        if (dp[n]!=-1){
            return dp[n];
        }
        int inc=solveDp(a,n-2,dp)+a[n];
        int excl=solveDp(a,n-1,dp)+0;
        dp[n]=Math.max(inc,excl);
        return dp[n];
    }
    static int maxSum(int N, int mat[][])
    {
        // code here
        //
        int[] first =new int[mat[0].length];
        boolean firstFill=false;
        boolean secondFill=false;
        int[] second =new int[mat[0].length];
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j <mat[0].length ; j++) {
                if (!firstFill){
                    first[j]=mat[i][j];
                }else {
                    second[j]=mat[i][j];
                }
            }
            firstFill=true;

        }



        int firstRowMax=findMaxSumDp(first);
        int secondRowMax=findMaxSumDp(second);
        int result=Math.max(firstRowMax,secondRowMax);
        int vertical=0;
        if (mat[0].length==2){
            vertical=Math.max(first[first.length-1],second[0]);

        }else{
            vertical=Math.max(first[first.length-1]+second[0],first[0]+second[second.length-1]);

        }

//        return Math.max(vertical,result);
        int currresult= Math.max(vertical,result);
        int result1 = Integer.MIN_VALUE;

        for (int j = 0; j < mat[0].length; j++) {
            for (int i = 0; i < mat.length - 1; i += 2) { // Ensure i+1 stays within bounds
                // Check both mat1[i][j] and mat1[i+1][j] (current column)
                result1 = Math.max(result, mat[i][j]);
                result1 = Math.max(result, mat[i+1][j]);
            }
        }
        return Math.max(currresult,result1);

    }


    public static void main(String[] args) {

       int[] arr = {3, 2, 7, 10};
//        System.out.println(findMaxSumDp(arr));
       int [][]mat = {{1, 4, 5},
                {2, 0, 0}};
       int [][]mat1 = {{1, 2},
                {3, 4}};
        System.out.println();
        System.out.println("max sum"+maxSum(mat.length,mat));

        for (int i = 0; i <mat1.length ; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                System.out.print(i+""+j+"   ");

            }
            System.out.println();
        }
        System.out.println("columns wise");
        // Iterate column-wise
        int result = Integer.MIN_VALUE;

        for (int j = 0; j < mat1[0].length; j++) {
            for (int i = 0; i < mat1.length - 1; i += 2) { // Ensure i+1 stays within bounds
                // Check both mat1[i][j] and mat1[i+1][j] (current column)
                result = Math.max(result, mat1[i][j]);
                result = Math.max(result, mat1[i+1][j]);
            }
        }
        System.out.println(result);



    }
}
