package PrepInsta.Top100Codes.ImportantCodesrelatedtoArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Sortfirsthalfinascendingorderandsecondhalfindescending {


    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[j]=a[i];
        a[i]=temp;
    }
    static ArrayList<Integer> sort(int a[]){
        ArrayList<Integer>arrayList=new ArrayList<>();

        Arrays.sort(a);
        int n= a.length;
        for (int i = 0; i < n/2; i++) {
            arrayList.add(a[i]);

        }
        for (int i = n-1; i >=n/2; i--) {
            arrayList.add(a[i]);


        }
        return arrayList;
    }


    static void sortArrays(int a[]){

        int n=a.length;
        int mid=n/2;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < mid; j++) {
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }

            }
            for (int j = mid; j <n-1 ; j++) {
                if (a[j]<a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }


        }
        for (int e:a
             ) {
            System.out.println(e);

        }
    }


    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 10, 30, 40, 20};
        //sortArrays(arr);
        System.out.println(sort(arr));
    }
}
