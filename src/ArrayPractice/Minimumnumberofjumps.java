package ArrayPractice;

public class Minimumnumberofjumps {

    static int minJumps(int[] a) {
        // your code here
        int n = a.length;
        int jump = 0;
        int value = 0;
        int i = 0;
        while (i <= n) {

            value = a[i];
            jump++;
            i += value;
            if (i + 1 == n) {
                break;
            }
        }
        return jump;
    }

    static int miJumps(int[] a) {
        int n = a.length;
        int jump = 0;
        int i = 0;

        while (i < n - 1) {
            int value = a[i];

            // If the value is 0 or negative, we cannot make any progress.
            if (value <= 0) {
                return -1;
            }

            i += value;
            jump++;
        }

        return jump;
    }

    public static void main(String[] args) {
        /*N = 6
arr = {1, 4, 3, 2, 6, 7}
Output: 2*/
        int[] arr = {1, 3, 5, 8, 4, 2, 6, 7, 6, 8, 9};

        System.out.println(miJumps(arr));
    }
}
