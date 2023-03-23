package tenDaysRecursionChalengeloveBabbar.RecursionDay3;

import java.util.Arrays;

public class checkarrayissorted {
    static boolean isSorted(int arr[],int size)
    {

        if (size==0||size==1)
            return true;
        if (arr[0]>arr[1])
            return false;
        else {
            int[] remainingPart = Arrays.copyOfRange(arr, 1, size);
            boolean res=isSorted(remainingPart,size-1);
            return res;
        }

    }

    public static void main(String[] args) {
        int arr[]={1,3,5,6,32};
        System.out.println(isSorted(arr, arr.length-1));

    }
}
