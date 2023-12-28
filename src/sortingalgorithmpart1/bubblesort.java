package sortingalgorithmpart1;

import java.util.Arrays;

public class bubblesort {
   static int count=0;
    static void swap(int a[],int i,int j)
    {
//        count++;
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }

    static void BubbleSort(int a[])
    {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j]>a[j+1])
                {
                    swap(a,j,j+1);
                }

            }

        }
    }
    static void optimizeBubbleSort(int a[])
    {
//        count=0;
        for (int i = 0; i < a.length-1; i++) {
            boolean isSwap =false;
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j]>a[j+1])
                {

                    isSwap=true;
                    swap(a,j,j+1);
                }
                if(!isSwap) break;


            }

        }
        System.out.println("count"+count);
    }

    static void bubble(int a[]){
        int n=a.length;
        for (int i = 0; i <n ; i++) {

            for (int j = 0; j < n-i-1; j++) {
                if(a[j+1]<a[j]){
                    swap(a,j,j+1);
                }

            }
            for (int e:a
                 ) {

                System.out.print(e+" ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int a[]={5,4,2,1,3};
        optimizeBubbleSort(a);
//        for (int e:a
//             ) {
//            System.out.println(e);
//
//        }
        /*optimizeBubbleSort(a);
        for (int e:a
             ) {
            System.out.println(e);

        }*/

    }
}
