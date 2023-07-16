package ArrayPractice;

public class Moveallnegativeelementstoend {

    public static void segregateElements(int arr[], int n) {
        // Your code goes here
        int[] a = new int[n];

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                a[k++] = arr[i];

            }
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] < 0) {
                a[k++] = arr[j];
            }

        }
        for (int e : a
        ) {
            System.out.println(e);

        }


    }

    public static void main(String[] args) {
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6};
        segregateElements(arr, arr.length);

    }
}
