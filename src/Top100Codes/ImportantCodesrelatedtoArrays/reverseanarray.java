package Top100Codes.ImportantCodesrelatedtoArrays;

public class reverseanarray {

    static void rev(int a[],int n){
        int ar[]=new int[n];
        int j=0;
        for (int i = n-1; i >=0 ; i--) {
            ar[j]=a[i];
            j++;


        }
        for (int e:ar
             ) {
            System.out.print(e+" ,");

        }
    }
    //inplace
    static void swap(int start,int end,int a[]){
        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;
    }
    static void rev(int a[],int start,int end){
        while (start<end){
            swap(start++,end--,a);

        }
        for (int e:a
             ) {
            System.out.print(e+" ");
        }

    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
       // rev(a,a.length);
        rev(a,0,a.length-1);
    }
}
