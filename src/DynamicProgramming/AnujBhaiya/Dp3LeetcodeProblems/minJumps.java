package DynamicProgramming.AnujBhaiya.Dp3LeetcodeProblems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class minJumps {


  /*  static int minimumJumps(int a[],int i){
        if (i>= a.length-1){
            return 0;
        }
        if (a[i]==0) return Integer.MAX_VALUE;

        int min=Integer.MAX_VALUE;
        for (int j = 1; j <= a[i] ; j++) {
            min=Math.min(min,minimumJumps(a, i+j)+1);

        }
        System.out.println(min);
        return min;
    }*/

    //dp
    static int minimumJumps(int a[]) {
        int dp[] = new int[a.length + 1];
        Arrays.fill(dp, -1);
        minimumJumps(a, 0, dp);
        for (int e : dp
        ) {
            System.out.print(e+" ");

        }
        System.out.println("end");
        return dp[0];

    }

    static int minimumJumps(int a[], int i, int dp[]) {
        if (i >= a.length - 1) {
            return 0;
        }
        if (dp[i] != -1) return dp[i];
        if (a[i] == 0) return Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE;
        for (int j = 1; j <= a[i]; j++) {
            min = Math.min(min, minimumJumps(a, i + j, dp) + 1);

        }
        return dp[i] = min;
    }

    public static int canReach(int[] A, int N) {
        // Code to check if the last index is reachable
        return canReachEnd(A) ? 1 : 0;
    }

    public static boolean canReachEnd(int[] A) {
        int[] dp = new int[A.length];
        Arrays.fill(dp, -1);
        return canReachEnd(A, 0, dp);
    }

    public static boolean canReachEnd(int[] A, int i, int[] dp) {
        if (i >= A.length - 1) {
            return true;
        }
        if (dp[i] != -1) {
            return dp[i] == 1;
        }
        if (A[i] == 0) {
            dp[i] = 0;
            return false;
        }

        for (int j = 1; j <= A[i]; j++) {
            if (canReachEnd(A, i + j, dp)) {
                dp[i] = 1;
                return true;
            }
        }
        dp[i] = 0;
        return false;
    }

    public static void main(String[] args) {
        int N = 6;
//        int[] A = {1, 2, 0, 3, 0, 0};


//        System.out.println(canReach(A, N)); // Output: 1 (true)

        //rec
        int A[]={3,2,4,3,2,5,1,1,2};
        System.out.println(minimumJumps(A));
    }
}
