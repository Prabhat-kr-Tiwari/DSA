package DynamicProgramming.gfgPractice.dynamicProgramming.easy;


import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3};
        int[] arr = {1, 15, 51, 45, 33, 100, 12, 18, 9};
        List<List<Integer>> subsequences = generateSubsequences(arr);

        // Print all subsequences
        for (List<Integer> subsequence : subsequences) {
            System.out.println(subsequence);
        }
    }

    public static List<List<Integer>> generateSubsequences(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsequencesHelper(arr, 0, new ArrayList<>(), result);
        return result;
    }

    private static void generateSubsequencesHelper(int[] arr, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(current)); // Add the current subsequence to the result
            return;
        }

        // Include the current element
        current.add(arr[index]);
        generateSubsequencesHelper(arr, index + 1, current, result);

        // Exclude the current element
        current.remove(current.size() - 1);
        generateSubsequencesHelper(arr, index + 1, current, result);
    }
}
