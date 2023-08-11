package sortingalgorithmpart1.PracticePhase3;

import java.util.Arrays;

public class Allsorting {

    static void swap(int a[], int i, int j) {

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void bubblesort(int a[]) {

        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j + 1] < a[j]) {
                    swap(a, j, j + 1);
                }

            }

        }
    }

    static void insertionSort(int a[]) {
        //back me jala
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int temp = a[i];
            for (; j >= 0; j--) {
                if (a[j] > temp) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }

            }
            a[j + 1] = temp;

        }
    }

    static void selectionSort(int a[]) {
        //smallest
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;

                }


            }
            swap(a, i, min);
        }
    }

    static int pivot(int a[], int l, int h) {
        int i = l;
        int j = h;
        int pivot = a[i];
        while (i < j) {
            while (i < j && a[i] <= pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(a, i, j);
            }
        }
        swap(a, l, j);
        return j;
    }

    static void quicksort(int a[], int l, int h) {
        if (l < h) {
            int pivotindex = pivot(a, l, h);
            quicksort(a, l, pivotindex - 1);
            quicksort(a, pivotindex + 1, h);
        }


    }

    static void merge(int a[], int l,int mid, int h) {
        int b[] = new int[a.length];
       // int mid = (l + h) / 2;
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
        for ( i = l; i <=h; i++) {
            a[i]=b[i];
        }

    }

    static void mergeSort(int[] a, int l, int h) {

        if (l<h){
            int mid = (l + h) / 2;
            mergeSort(a, l, mid);
            mergeSort(a, mid + 1, h);
            merge(a,l,mid,h);
        }



    }


    public static void main(String[] args) {
        //int a[] = {8, 1, 9, 3, 4};
//        System.out.println("Bubble");
//        bubblesort(a);
//        System.out.println("Insertion");
//        insertionSort(a);
//        System.out.println(Arrays.toString(a));
//        selectionSort(a);
//        System.out.println(Arrays.toString(a));;
       /* quicksort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));*/
//        mergeSort(a,0,a.length-1);
//        System.out.println(Arrays.toString(a));
        int a[]={1,2,3,4};
        int b[]=a;
        System.out.println(Arrays.toString(a));
        b[0]=9;
        System.out.println(Arrays.toString(b));






    }
}
