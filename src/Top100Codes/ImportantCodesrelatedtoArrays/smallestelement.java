package Top100Codes.ImportantCodesrelatedtoArrays;

public class smallestelement {
    //using recursion
    static int getSmallest(int a[], int n) {
        if (n == 1)
            return a[0];
        return Math.min(a[n - 1], getSmallest(a, n - 1));
    }

    static void smallest(int a[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }

        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int arr[] = {1223, -3, 1, 10, 134, -9};

        smallest(arr);
        getSmallest(arr, arr.length);

    }
}
