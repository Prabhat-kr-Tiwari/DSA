package BinarySearchPracticePhase2.Medium;


public class Trailingzero {

    static int countZero(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }

    static int BinarySearch(int target) {
        int left = 0;
        int right = Integer.MAX_VALUE;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int zeros = countZero(mid);

            if (zeros < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    static int search(int target) {
        return countZero(BinarySearch(target));
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println(search(n));  // Output: 5
    }
}

