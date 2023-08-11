package ArrayPractice;

import java.util.Arrays;

public class RotatinganArray {

    static void rightRotate(int[] arr, int n, int d) {
        // code here

        int x=0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            x=((i+n-n/2-1)%n);
            System.out.println("X   :"+x);
            a[(i + d) % n] = arr[i];
        }
        for (int e : a
        ) {
            System.out.println(e);

        }
        System.out.println();
    }

    static void leftRotate(int[] arr, int n, int d) {
        // code here

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[(i - d + n) % n] = arr[i];
        }
        arr=a;
        for (int e : arr) {
            System.out.println(e);
        }
        System.out.println();
    }

    static void left(int a[], int n, int d) {
        int temp = a[0];

        while (d != 0) {
            temp = a[0];
            for (int i = 1; i < n; i++) {

                a[i - 1] = a[i];


            }
            a[n - 1] = temp;
            d--;
        }

        System.out.println(temp);
        for (int e : a
        ) {
            System.out.print(e + " ");

        }
    }
    static void leftr(int a[],int n,int d){
        int dsizearr[]=new int[d];
        int arr[]=new int[n];
        int index=0;
        for (int i = 0; i < d; i++) {
            dsizearr[i]=a[i];

        }

        for (int i = d; i <n ; i++) {
            arr[i-d]=a[i];


        }
        int x=n-d;
        for (int i = 0; i <d ; i++) {
            System.out.println("i "+i);

            arr[x++]=dsizearr[index++];

        }
        for (int e : arr
        ) {
            System.out.print(e + " ");

        }
    }


/*    static void leftrotate(int a[],int d){
        int n=a.length;
        for (int i = 0; i < d; i++) {
            rotate(a,n);

        }
        for (int e:a
             ) {
            System.out.println(e);

        }
    }*/

    public static void rotate(int a[], int n) {

        int temp = a[n - 1];

        for (int i = n - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = temp;

    }

    public static void main(String[] args) {
        int Arr[] = {1, 2, 3, 4, 5, 6, 7};
        int D = 2;
        // rightRotate(Arr, Arr.length,D);
        //Output: 3 4 5 6 7 1 2
       // leftRotate(Arr, Arr.length, D);

        rightRotate(Arr, Arr.length, D);


    }
}
