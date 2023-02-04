package tenDaysRecursionChalengeloveBabbar.RecursionDay4.Practice;

import java.util.Arrays;

public class isSortedArray {

    static boolean isSortedArray(int arr[],int size)
    {
        if (size==1)
            return true;
        if (size==0)
            return true;
        if (arr[0]>arr[1])
            return false;
        int remainingPart[]= Arrays.copyOfRange(arr,1,size);
        return isSortedArray(remainingPart,size-1);

    }

    public static void main(String[] args) {
        int arr[]={1,62,3};
        System.out.println(isSortedArray(arr,3));
    }
}
