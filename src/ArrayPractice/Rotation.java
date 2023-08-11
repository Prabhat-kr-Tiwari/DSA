package ArrayPractice;

import java.util.Arrays;

public class Rotation {

    static int rightrotate(int[] ar, int k){
       // System.out.println(Arrays.toString(ar));
        int b[]=new int[ar.length];
        for (int i = 0; i <ar.length ; i++) {
            b[i]=ar[i];
        }

        Arrays.sort(b);
       // System.out.println(Arrays.toString(ar));

        int n=ar.length;
        int count=0;
        int[] a = new int[n];
        int d=1;
        while (d!=n){
            for (int i = 0; i < a.length; i++) {
                a[(i+d+n)%n]=b[i];
//                System.out.println(Arrays.toString(a));

            }
//            System.out.println(Arrays.toString(a));
            for (int e:a
                 ) {
                System.out.print(e);

            }
            System.out.println();
            d++;
            count++;
            if (Arrays.equals(a, ar)){
                return count;

            }
        }

        return -1;
    }
    static void leftRotate(int[] arr, int n, int d) {
        // code here

        int[] a = new int[n];
        for (int i = 1; i < n; i++) {
            a[(i + d + n) % n] = arr[i];
            System.out.println(Arrays.toString(a));
        }
//        arr=a;
//        for (int e : arr) {
//            System.out.println(e);
//        }
//        System.out.println();
    }

//    int findKRotation(int arr[], int n) {
//        // code here
//
//    }

    public static void main(String[] args) {

        int N = 5;
        int Arr[] = {5, 1, 2, 3, 4};
        int a[]={1,2,3,4,5};
        System.out.println(rightrotate(Arr,1));
//        for (int e:a
//             ) {
//
//            System.out.println(e);
//        }

    }
}
