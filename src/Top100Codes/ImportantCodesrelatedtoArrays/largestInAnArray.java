package Top100Codes.ImportantCodesrelatedtoArrays;

public class largestInAnArray {
    static void largest(int a[]){
        int  n=a.length;
        int i = 0;
        int largest=Integer.MIN_VALUE;
        for (; i < n ; i++) {
            if (a[i]>largest){
                largest=a[i];
            }

        }
        System.out.println("Largest is "+largest);
    }

    //using recursion
    /* if (a.length==1)
            return a[0];
        return Math.max(a[n-1],getMax(a,n-1));*/
    static int getMax(int a[],int n){

        if (n==1)
            return a[0];
        return Math.max(a[n-1],getMax(a,n-1));
    }

    public static void main(String[] args) {
        int arr[] = {1223, 13, 1, 10, 134, 10};
        largest(arr);
        System.out.println(getMax(arr,arr.length));

    }
}
