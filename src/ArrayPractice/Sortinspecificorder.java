package ArrayPractice;

import java.util.Arrays;
import java.util.Collections;

public class Sortinspecificorder {

    public void sortIt(long arr[], long n) {
        //code here.
        int index = 0;
        int length=arr.length;
        Integer a[] = new Integer[(int) n];
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                a[index++] = Math.toIntExact(arr[i]);
            }
        }
        // Sort the 'a' array in reverse order (descending)
        Arrays.sort(a, 0, index, Collections.reverseOrder());
        int oddindex = index;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                a[oddindex++] = Math.toIntExact(arr[i]);
            }

        }
        Arrays.sort(a, index, oddindex);

//        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));

    }

/*
    public static void sortIt(Integer arr[], int n) {
        //code here.
        int index = 0;

        Integer a[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                a[index++] = arr[i];
            }
        }
        // Sort the 'a' array in reverse order (descending)
        Arrays.sort(a, 0, index, Collections.reverseOrder());
        int oddindex = index;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                a[oddindex++] = arr[i];
            }

        }
        Arrays.sort(a, index, oddindex);

//        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
    }
*/

    public static void main(String[] args) {
        long N = 7;
        Long Arr[] = {1L, 2L, 3L, 5L, 4L, 7L, 10L};
        //sortIt(Arr, N);
//        7 5 3 1 2 4 10

    }
}
