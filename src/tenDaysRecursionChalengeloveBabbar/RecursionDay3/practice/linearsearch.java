package tenDaysRecursionChalengeloveBabbar.RecursionDay3.practice;

import java.util.Arrays;

public class linearsearch {

    static boolean l(int arr[],int target,int size)
    {
        /*if (arr.length==0)
            return arr[0];*/
        if (size==0)
            return false;
        if (arr[0]==target)
            return true;
        int rem[]= Arrays.copyOfRange(arr,1,size);
        return l(rem,target,size-1);

    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        int target=5;
        System.out.println( l(arr,target,arr.length));

    }

}
