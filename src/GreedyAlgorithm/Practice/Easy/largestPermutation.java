package GreedyAlgorithm.Practice.Easy;

import java.util.Collections;

public class largestPermutation {


    static void swap(long a[],int i,int j){
//        System.out.println("swap called");
        long temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static int max=Integer.MIN_VALUE;

    static void KswapPermutation(long a[], int n, int k)
    {
        int converted=convertTONumber(a);
        if (converted>max){
            max=converted;
            System.out.println("max"+max);
        }

        if (k==0){
            return;
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j <n ; j++) {

                    if (a[j]>a[i]){
                        swap(a,i,j);
                        KswapPermutation(a,n,k-1);
                        swap(a,i,j);
                    }

            }
        }
        convertNumberToArray(max,a);



    }

    static void KswapPermutation2(long a[], int n, int k){


        int i=0;
        int j=n-1;
        while (i<j){
            if (a[j]>a[i]){
                swap(a,i,j);
            }
            j--;
        }
        for (long e:a
             ) {
            System.out.println(e);

        }
        int x=0;
        int y=n-1;
        while (x<y){
            if (a[y]>a[x]){
                swap(a,x,y);
            }
            x++;
        }

        System.out.println("second");
        for (long e:a
        ) {
            System.out.println(e);

        }
    }

    public static void main(String[] args) {
       int  k=8;
        long arr[] = {1 ,10, 6, 4, 3, 9, 7 ,5 ,8 ,12, 11, 2};

        KswapPermutation(arr,arr.length,k);
        for (long e:arr
             ) {
            System.out.println(e);

        }



    }
    static int convertTONumber(long arr[]){


        long result = 0;

        for (long digit : arr) {
            result = result * 10 + digit;
        }
        return (int) result;
    }
    static void convertNumberToArray(int n,long a[]){
        int z=a.length-1;
        while (n!=0){
            int digit=n%10;
            a[z--]=digit;
            n=n/10;
        }

    }





}
