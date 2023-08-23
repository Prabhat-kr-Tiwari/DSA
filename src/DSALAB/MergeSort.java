package DSALAB;

public class MergeSort {


    static void merge(int a[], int l, int mid, int h) {
        int b[] = new int[a.length];
        int i = l;
        int j = mid + 1;
        int k = l;
        while (i <= mid && j <= h) {

            if (a[i] <= a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
            k++;
        }
        if (i > mid) {

            while (j <= h) {
                b[k] = a[j];
                j++;
                k++;
            }
        } else {
            while (i <= mid) {
                b[k] = a[i];
                i++;
                k++;
            }

        }
        for (i = l; i <= h; i++) {
            a[i] = b[i];
        }
    }

    static void mergesort(int a[], int l, int h) {
        int mid = l + (h - l) / 2;
        mergesort(a, l, mid - 1);
        mergesort(a, mid + 1, h);
        merge(a, l, mid, h);
    }

    public static void main(String[] args) {

    }
}
