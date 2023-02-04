package tenDaysRecursionChalengeloveBabbar.RecursionDay3;

import java.util.Arrays;

public class sumofarray {
    static int sum(int arr[],int size)
    {

        if (size==0)
            return 0;
        if (size==1)
            return arr[0];

        int[] remainingPart = Arrays.copyOfRange(arr, 1, size);
        int res=sum(remainingPart,size-1);

        return arr[0]+res;
    }

    public static void main(String[] args) {
        int arr[]={3,2,5,1,6};
        System.out.println(sum(arr, 5));

    }
}
