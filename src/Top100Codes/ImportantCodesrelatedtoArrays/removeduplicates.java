package Top100Codes.ImportantCodesrelatedtoArrays;

import java.util.HashSet;

public class removeduplicates {
    static int removeDuplicates(int arr[], int n)
    {
        if (n==0 || n==1)
            return n;
        int j = 0;
        for (int i=0; i<n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];
        arr[j++] = arr[n-1];

        return j;
    }
    static void remove(int a[]){
        HashSet<Integer>hs=new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);

        }
        System.out.println(hs);
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 40, 40, 40, 50, 50};
       // remove(a);
        int n = arr.length;

        n = removeDuplicates(arr, n);

        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }


}
