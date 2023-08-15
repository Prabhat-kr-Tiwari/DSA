package ArrayPractice.Easy;

import java.util.Arrays;

public class Firstnegativeintegerineverywindowofsizek {


    static long[] f3(long a[], int n, int k) {
        int index=0;
        long []result=new long[n-1];
        for (int i = 0; i <= n-k ; i++) {
            int min = Integer.MAX_VALUE;
            boolean isNegativeFound = false;

            for (int j = 0; j < k; j++) {
                if (a[i + j] < 0) {
                    min = (int) a[i + j];
                    isNegativeFound = true;
                    break;
                }
            }

            if (isNegativeFound) {
                result[index++]=min;
                System.out.println(min);
            } else {
                result[index++]=0;
                System.out.println("0");
            }
        }
        return result;
    }


    static void f(int a[], int n, int k) {
        for (int i = 0; i <= n - k; i++) {
            boolean foundNegative = false;

            for (int j = i; j < i + k; j++) {
                if (a[j] < 0) {
                    System.out.println(a[j]);
                    foundNegative = true;
                    break; // Move to the next window
                }
            }

            if (!foundNegative) {
                System.out.println("No negative element");
            }
        }
    }





    static void slidingwindowmaximum(int a[],int n,int k){
        int j,min;
        boolean isupdated=false;
        for (int i = 0; i < n-k; i++) {
            min=a[i];
            isupdated=false;
            for ( j = 1; j <k ; j++) {
                if (a[i+j]<min&&!isupdated){
                    isupdated=true;
                    min=a[i+j];
                    System.out.println(min);
//                    break;

                }




            }

        }
    }
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        long ans[]=new long[N];


        return ans;

    }
    public static void main(String[] args) {
        /*5
-8 2 3 -6 10
2*/
//       int  N = 8;
//        long A[] = {12 ,-1 ,-7 ,8 ,-15, 30, 16 ,28};
//        8
//        12 -1 -7 8 -15 30 16 28
//        3


        int N=5;
        long A[]={-8, 2, 3 ,-6, 10};
        int k=2;

//        int N = 8;
//        long A[] = {12, -1, -7, 8, -15, 30, 16, 28};
         //   K = 3
        System.out.println(Arrays.toString(f3(A, N, 2)));

        //-1 -1 -7 -15 -15 0
    }
}
