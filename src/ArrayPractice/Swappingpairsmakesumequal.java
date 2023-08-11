package ArrayPractice;

public class Swappingpairsmakesumequal {

    static long findSwapValues(long A[], int n, long  B[], int m)
    {
        // Your code goes here
        long sum1=0;
        long sum2=0;
        for (long e:A
             ) {
            sum1+=e;

        }
        System.out.println(sum1);
        for (long e:B
        ) {
            sum2+=e;

        }
        System.out.println(sum2);
        long newsum1=sum1;
        long newsum2=sum2;
        int result= Math.min(m, n);
        for (int i = 0; i <result ; i++) {
            long currsum1=newsum1-A[i]+B[i];
            long currsum2=newsum2-B[i]+A[i];
            if (currsum2==currsum1){
                return 1L;
            }


        }
        int result2=Math.max(m,n);
        for (int i = 0; i <result2 ; i++) {

        }
        return -1L;
    }


    public static void main(String[] args) {
       long N = 6, M = 4;
//       long[] A = {4, 1, 2, 1, 1, 2};
//       long[] B = {3, 6, 3, 3};
       long A[] = {5, 7, 4, 6};
        long B[] = {1, 2, 3, 8};
        System.out.println(findSwapValues(A,A.length,B,B.length));
        /*Input: N = 6, M = 4
A[] = {4, 1, 2, 1, 1, 2}
B[] = (3, 6, 3, 3)
Output: 1
Explanation: Sum of elements in A[] = 11
Sum of elements in B[] = 15, To get same
sum from both arrays, we can swap following
values: 1 from A[] and 3 from B[]*/

    }
}
