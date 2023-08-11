package ArrayPractice;

public class BalancedArray {

    static long minValueToBalance(long arr[] ,int n)
    {
        int leftsum=0;
        int rightsum=0;

        int  mid=n/2;
        for (int i = 0; i < mid; i++) {
            leftsum+=arr[i];

        }
        for (int i = mid; i <n; i++) {
            rightsum+=arr[i];

        }
        long result=Math.abs(rightsum-leftsum);
        return result;


    }


    public static void main(String[] args) {

   /*    int   N = 4 ;
        long arr[] = {1, 5, 3, 2};*/
        int N = 6;
        long arr[] = { 1, 2, 1, 2, 1, 3 };
        System.out.println(minValueToBalance(arr,N));


    }
}
