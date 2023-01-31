package Recursion.RecursionAndBackTracking3;

public class NQueen {
    public static boolean isSafe(int a[][], int n, int row, int col) {
        //check ki iss column me already koi queen hai ya nhi
        for (int i = 0; i < n; i++) {
            if (a[i][col] == 1) return false;


        }
        //left side diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (a[i][j] == 1) return false;
        }
        //right side diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (a[i][j] == 1) return false;
        }
        return true;
    }


    static boolean nQueen(int a[][], int n, int row) {
        //agr queen bahr nikal gayi hai toh true return kar doo
        if (row == n) return true;
        for (int col = 0; col < n; col++) {
            if (isSafe(a, n, row, col)) {
                a[row][col] = 1;
                if (nQueen(a, n, row + 1)) {
                    return true;
                }
                //yaha par backtracking ho rahi hai aur agle wale column pe rakhne ke liye check kare ge
                a[row][col] = 0;

            }

        }

        return false;

    }

    public static void main(String[] args) {
        int n = 4;
        int arr[][] = new int[n][n];
        nQueen(arr, n, 0);
        for (int array[] : arr
        ) {
            for (int e : array
            ) {
                System.out.print(e + " ");

            }
            System.out.println();

        }
    }
}
