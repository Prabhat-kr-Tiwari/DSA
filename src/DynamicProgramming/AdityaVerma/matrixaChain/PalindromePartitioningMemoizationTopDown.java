package DynamicProgramming.AdityaVerma.matrixaChain;

public class PalindromePartitioningMemoizationTopDown {


    static boolean isPalindrome(String s, int i, int j) {

        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;

            } else {
                return false;
            }
        }
        return true;

    }

    static int palindromePartitioning(String s, int i, int j) {


        int n = s.length();
        int t[][] = new int[n][n];
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                t[k][l] = -1;
            }
        }
        return palindromePartitioningDp(s, i, j, t);

    }

    static int palindromePartitioningDp(String s, int i, int j, int t[][]) {
        if (i >= j) return 0;
        if (isPalindrome(s, i, j)) return 0;
        if (t[i][j] != -1) return t[i][j];
        int min = Integer.MAX_VALUE;
        int left, right = 0;
        for (int k = i; k < j; k++) {

            if (t[i][k] != -1) {
                left = t[i][k];
            } else {
                left = palindromePartitioningDp(s, i, k, t);
                t[i][k] = left;
            }
            if (t[k + 1][j] != -1) {
                right = t[k + 1][j];
            } else {
                right = palindromePartitioningDp(s, k + 1, j, t);
                t[k + 1][j] = right;
            }
            int tempans = left + right + 1;
            min = Math.min(min, tempans);
        }
        return t[i][j] = min;
    }




    public static void main(String[] args) {
        String s = "geek";
        System.out.println(palindromePartitioning(s, 0, s.length() - 1));
    }
}
