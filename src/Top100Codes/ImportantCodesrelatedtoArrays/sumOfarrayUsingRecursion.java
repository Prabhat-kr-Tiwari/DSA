package Top100Codes.ImportantCodesrelatedtoArrays;



public class sumOfarrayUsingRecursion {

    static int sum(int a[],int n){
        if (n==1)
            return a[0];
        return a[n-1]+sum(a,n-1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,10,10};
        System.out.println(sum(arr, arr.length));

    }

}
