package Array3;

public class rotatematrix90degreeclockwise {
    static void print(int a[][]) {

        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();

        }
    }

    static void transpose(int a[][]) {

        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int swap = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = swap;

            }

        }
    }

    static void rotate(int a[][]) {
        int n = a.length;
        transpose(a);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {

                int swap = a[i][j];
                a[i][j ] = a[i][n - j - 1];
                a[i][n - j - 1] = swap;

            }

        }


    }

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}

        };
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        print(b);
        rotate(b);
        print(b);
    }

}
