package DynamicProgramming.AdityaVerma.matrixaChain;

public class EggDroppingRecursiveOptimizationMemoization {

    static int solve(int e, int f) {
        // Create a 2D array for memoization
        int[][] t = new int[e + 1][f + 1];

        // Initialize all values in the array to -1
        for (int i = 0; i <= e; i++) {
            for (int j = 0; j <= f; j++) {
                t[i][j] = -1;
            }
        }

        return eggDrop(e, f, t);
    }

    static int eggDrop(int e, int f, int[][] t) {
        int low, high;

        // Base cases
        if (f == 0 || f == 1) {
            return f;
        }
        if (e == 1) {
            return f;
        }

        // Check memoized value
        if (t[e][f] != -1) {
            return t[e][f];
        }

        int min = Integer.MAX_VALUE;

        // Try dropping an egg from each floor
        for (int i = 1; i <= f; i++) {
            // Compute low (egg breaks)
            if (t[e - 1][i - 1] != -1) {
                low = t[e - 1][i - 1];
            } else {
                low = eggDrop(e - 1, i - 1, t);
                t[e - 1][i - 1] = low;
            }

            // Compute high (egg doesn't break)
            if (t[e][f - i] != -1) {
                high = t[e][f - i];
            } else {
                high = eggDrop(e, f - i, t);
                t[e][f - i] = high;
            }

            // Calculate worst-case attempts for this floor
            int temp = 1 + Math.max(low, high);

            // Update the minimum attempts
            min = Math.min(min, temp);
        }

        // Store the result in the memoization table
        t[e][f] = min;
        return min;
    }

    public static void main(String[] args) {
        System.out.println(solve(2, 10)); // Output: 4
    }
}
