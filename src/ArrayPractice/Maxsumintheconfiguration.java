package ArrayPractice;

import java.util.Arrays;

/*
public class Maxsumintheconfiguration {

    static int max_sum(int A[], int n) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currentSum = 0;

            // Calculate the sum after rotation
            for (int j = 0; j < n; j++) {
                int rotatedIndex = (i + j) % n;
                currentSum += j * A[rotatedIndex];
            }

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int A[] = {82, 517, 517, 3, 232, 140, 797, 405, 339, 581, 219, 22, 971, 863, 813, 380, 978, 686, 537, 905, 177, 484, 208, 760, 858, 745};

        System.out.println("Result: " + max_sum(A, A.length));
    }
}

*/

public class Maxsumintheconfiguration {
    static int max_sum2(int A[], int n) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currentSum = 0;

            // Calculate the sum after rotation
            for (int j = 0; j < n; j++) {
                int rotatedIndex = (i + j) % n;
                currentSum += j * A[rotatedIndex];
            }

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }


    static int rotate(int[] a, int n, int m, int ans) {

        if (m == 0) {
            return ans;
        }
        int sum = 0;

        int last = a[n - 1];
        for (int i = n - 1; i > 0; i--) {
            a[i] = a[i - 1];
            sum += i * a[i];


        }
        a[0] = last;

        System.out.println("Sum  " + sum);
        ans = Math.max(ans, sum);
        System.out.println("ans  " + ans);
        int k = 0;

        return rotate(a, n, m - 1, ans);
       // return ans;


    }

    static int max_sum(int A[], int n) {
        // Your code here
        return rotate(A, n, n - 1, 0);

    }


    public static void main(String[] args) {




        int A[] = {82, 517, 517 ,3, 232, 140, 797 ,405, 339, 581 ,219 ,22, 971, 863, 813, 380, 978, 686, 537, 905, 177, 484, 208, 760 ,858 ,745};

        System.out.println("Result " + max_sum2(A, A.length));
        System.out.println(Arrays.toString(A));

    }
}


      /*26
82 517 517 3 232 140 797 405 339 581 219 22 971 863 813 380 978 686 537 905 177 484 208 760 858 745
Your Code's output is:
185561
It's Correct output is:
190279
Output Difference*/
