package ArrayPractice;

import java.util.Arrays;

public class Rotation {


    static int findKRotation(int[] arr, int n) {
        int low = 0, high = n - 1;

        while (low <= high) {
            if (arr[low] <= arr[high]) {
                return low;  // Array is not rotated
            }

            int mid = low + (high - low) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;

            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;  // Index of the smallest element
            } else if (arr[mid] <= arr[high]) {
                high = mid - 1;
            } else if (arr[mid] >= arr[low]) {
                low = mid + 1;
            }
        }

        return -1;  // Not a valid rotated array
    }


    static void leftRotate(int[] arr, int n, int d) {
        // code here

        int[] a = new int[n];
        for (int i = 1; i < n; i++) {
            a[(i + d + n) % n] = arr[i];
            System.out.println(Arrays.toString(a));
        }

    }


    public static void main(String[] args) {

        int N = 5;
        int Arr[] = {5, 1, 2, 3, 4};
        int a[] = {1, 2, 3, 4, 5};
        System.out.println(findKRotation(Arr, N));


    }
}
