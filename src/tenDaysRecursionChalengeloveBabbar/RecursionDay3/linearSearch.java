package tenDaysRecursionChalengeloveBabbar.RecursionDay3;

import java.util.Arrays;

public class linearSearch {
    static void print(int arr[],int size)
    {
        System.out.println("size of array is   "+size);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");

        }
        System.out.println();
    }
    static boolean linearsearch(int arr[],int size,int key)
    {
        print(arr,size);
        if (size==0)
            return false;
        if (arr[0]==key)
            return true;
        int remainingPart[]= Arrays.copyOfRange(arr,1,size);
        boolean res=linearsearch(remainingPart,size-1,key);
        return res;
    }

    public static void main(String[] args) {
        int ar[]={3,5,1,2,6};
        int key=54;
        System.out.println(linearsearch(ar, ar.length, key));

    }
}
