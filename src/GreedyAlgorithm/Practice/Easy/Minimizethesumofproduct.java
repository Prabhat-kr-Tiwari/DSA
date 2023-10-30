package GreedyAlgorithm.Practice.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Minimizethesumofproduct {




    public static long minValue(long a[], long b[], long n) {
        long sum = 0;

        // Sort the first array in descending order
        Arrays.sort(a);
        for (int i = 0; i < n / 2; i++) {
            long temp = a[i];
            a[i] = a[(int) (n - 1 - i)];
            a[(int) (n - 1 - i)] = temp;
        }

        // Sort the second array in ascending order
        Arrays.sort(b);

        // Calculate the sum of element-wise products
        for (int i = 0; i < n; i++) {
            sum += a[i] * b[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        long N = 5;
        long A[] = {6, 1, 9, 5, 4};
       long B[] = {3, 4, 8, 2, 4};

        System.out.println(minValue(A,B,N));

    }
}
