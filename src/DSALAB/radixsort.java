package DSALAB;

import java.util.Arrays;

public class radixsort {

    static int findMax(int a[]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]>max){
                max=a[i];
            }

        }
        return max;
    }
    static void countSort(int a[],int place){
        int n=a.length;
        int output[]=new int[n];
        //find the largest element of array
        int max=findMax(a);
        int []count=new int[10];
        for (int i = 0; i <a.length ; i++) {//make frequency array of that digit a[]=105
            //fre[5]++
            count[(a[i]/place)%10]++;

        }
        //make prefix sum array of count array
        for (int i = 1; i < count.length ; i++) {
            count[i]+=count[i-1];

        }
        //find the index of each element
        //int the original and put in the output array
        for (int i = n-1; i >=0 ;i--) {

            int index=count[(a[i]/place)%10]-1;
            output[index]=a[i];
            count[(a[i]/place)%10]--;


        }
        //copy all elements of output array
        for (int i = 0; i <n ; i++) {
            a[i]=output[i];

        }



    }
    static void RadixSort(int a[]){
        int max=findMax(a);
        //app;y counting sort tot sort elements based on place value
        for (int place = 1; max/place >0 ; place*=10) {
            countSort(a,place);

        }
    }


    public static void main(String[] args) {
        int a[] = {237, 146, 259, 348, 152, 163, 235, 48, 36, 62};

        RadixSort(a);
        for (int e:a
             ) {
            System.out.println(e) ;

        }
    }
}
