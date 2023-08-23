package BinarySearchPracticePhase2.Medium;

public class Smallestfactorialnumber {
    /*Given a number n. The task is to find the smallest number whose factorial
     contains at least n trailing zeroes.*/
    static int countZero(int n) {
        int count = 0;
        int temp = n;

        while (temp != 0) {
            int digit = temp % 10;  // Extract the last digit
            if (digit == 0) {
                count++;
            }
            temp /= 10;  // Remove the last digit
        }

        return count;
    }


    static int fact(int n) {
        if (n == 0) return 1;
        return n * fact(n - 1);

    }

    static int BinarySearch(int target) {

        int l = 0;
        int r = Integer.MAX_VALUE;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int result = fact(mid);
            if (countZero(result) > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    static int search(int target) {
        return BinarySearch(target);
    }


    public static void main(String[] args) {
        //System.out.println(fact(5));
        System.out.println(search(1));

    }
}
