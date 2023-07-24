package Top100Codes.ImportantCodesrelatedtoArrays;

import java.util.Arrays;

public class minimumscalarproduct {

    //1.sort an array in ascending
    //2. sort an array in descending
    //3. product

    static void swap(int a[],int start,int end){
        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;

    }
    static void product(int a[],int b[]){
       int res=0;
        int n=a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (a[i]>a[j]){
                    swap(a,i,j);
                }

            }

        }
        for (int e:a
        ) {
            System.out.print(e+" ");

        }
        int bln=b.length;

        for (int i = 0; i < bln; i++) {
            for (int j = i+1; j < bln; j++) {
                if (b[i]<b[j]){
                    swap(b,i,j);
                }

            }

        }
        System.out.println();
        for (int e:b
        ) {
            System.out.print(e+" ");

        }

        for (int i = 0; i < n; i++) {
             res+=a[i]*b[i];

        }
        System.out.println(res);




    }

    public static void main(String[] args) {

        int arr1[] = {1, 2, 6, 3, 7};
        int arr2[] = {10, 7, 45, 3, 7};
        int n = arr1.length;
        product(arr1,arr2);

    }
    /*1 2 3 6 7
45 10 7 7 3
149*/
}
