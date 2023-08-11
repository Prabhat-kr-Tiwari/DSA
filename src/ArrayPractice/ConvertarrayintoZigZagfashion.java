package ArrayPractice;

import java.util.Arrays;

public class ConvertarrayintoZigZagfashion {
    /*Input:
N = 7
Arr[] = {4, 3, 7, 8, 6, 2, 1}
Output: 3 7 4 8 2 6 1
Explanation: 3 < 7 > 4 < 8 > 2 < 6 > 1*/
    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void zigZag2(int a[], int n){
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0) {
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                }
            } else {
                if (a[i] < a[i + 1]) {
                    swap(a, i, i + 1);
                }
            }
        }
    }

    public static void zigZag(int a[], int n){
        // Code your solution here.
        Arrays.sort(a);
        for (int i = 2; i < n; i++) {
            swap(a,i,i-1);

        }



    }

    public static void main(String[] args) {
      int   N = 7;
      int   Arr[] = {4, 3, 7, 8, 6, 2, 1};
        zigZag2(Arr,N);
        System.out.println(Arrays.toString(Arr));


    }
}
