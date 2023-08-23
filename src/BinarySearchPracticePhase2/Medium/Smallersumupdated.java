package BinarySearchPracticePhase2.Medium;


import java.util.ArrayList;
import java.util.TreeMap;





public class Smallersumupdated {

    public static long[] smallerSum(int n, int arr[]) {
        long[] newarray = new long[n];
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        long totalSum = 0;

        for (int i = 0; i < n; i++) {
            int currentElement = arr[i];

            // Get the sum of elements smaller than the current element
            long smallerSum = 0;
            Integer lowerKey = treeMap.lowerKey(currentElement);
            if (lowerKey != null) {
                smallerSum = treeMap.get(lowerKey);
            }

            newarray[i] = totalSum - smallerSum;  // Calculate the sum
            totalSum += currentElement;

            // Update the frequency of the current element in the TreeMap
            treeMap.put(currentElement, i);
        }

        return newarray;
    }

    public static void main(String[] args) {
        int a[] = {4,4};
        long[] result = smallerSum(a.length, a);
        for (long value : result) {
            System.out.print(value + " ");
        }
    }
}



