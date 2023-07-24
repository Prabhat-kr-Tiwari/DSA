package ArrayPractice;

public class Gamewithnos {
    public static void game_with_number(int arr[], int n) {
        // Complete the function
        int a[] = new int[n];
        System.out.println("length  " + n);
        if (n % 2 == 0) {
            for (int i = 0; i < n - 1; i++) {
                a[i] = arr[i] ^ arr[i + 1];

            }

        }else{
            for (int i = 0; i < n - 1; i++) {
                a[i] = arr[i] ^ arr[i + 1];

            }
            a[n-1]=arr[n-1];

        }

        for (int e : a
        ) {
            System.out.println(e);

        }
    }

    public static void main(String[] args) {
        int n = 5, arr[] = {10, 11, 1, 2, 3};
        game_with_number(arr, n);
        /* 1 10 3 1 3*/

    }
}
