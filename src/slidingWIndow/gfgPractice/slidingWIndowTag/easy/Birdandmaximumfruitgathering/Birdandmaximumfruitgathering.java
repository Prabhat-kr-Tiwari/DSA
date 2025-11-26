package slidingWIndow.gfgPractice.slidingWIndowTag.easy.Birdandmaximumfruitgathering;

public class Birdandmaximumfruitgathering {


    static int maxFruits(int[] arr, int totalTime) {
        // code here
        int i = 0;
        int j = 0;
        int size = arr.length;
        long maxSum = Long.MIN_VALUE;
        long sum = 0;
        if (totalTime >= size) {
            long totalSum = 0;
            for (int fruit : arr) {
                totalSum += fruit;
            }
            return (int) totalSum;
        }
        int windowSize = totalTime;

        while (j < size) {
            //calculate
            sum += arr[j];
            if (j - i + 1 < windowSize) {
                // reach the  window
                j++;
            } else if (j - i + 1 == windowSize) {

                //get answer from calculation
                maxSum = Math.max(sum, maxSum);
                //maintain the window
                sum -= arr[i];
                //slide
                i++;
                j++;
            }

        }
        return (int) maxSum;

    }

    public static void main(String[] args) {

        int arr[] = {2, 1, 3, 5, 0, 1, 4};
        int totalTime = 3;
        System.out.println(maxFruits(arr, totalTime));

    }
}
