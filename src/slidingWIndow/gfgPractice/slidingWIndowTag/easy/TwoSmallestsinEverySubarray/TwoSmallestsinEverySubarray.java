package slidingWIndow.gfgPractice.slidingWIndowTag.easy.TwoSmallestsinEverySubarray;

public class TwoSmallestsinEverySubarray {


    public int maxSum(int[] arr) {
        // code here
        if (arr.length<2) return -1;

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length-1 ; i++) {
            int sum = arr[i]+arr[i+1];
            maxSum= Math.max(sum,maxSum);
        }
        return maxSum;

    }
    public static void main(String[] args) {

    }
}
