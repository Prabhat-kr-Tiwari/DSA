package Top100Codes.ImportantCodesrelatedtoArrays;

public class SortFirsthalfinAscendingandSecondhalfindescendingorder {
    static void swap(int a[],int start,int end){
        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;
    }

    static void sort(int[] a, int n){

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n/2; j++) {
                if (a[j]>a[j+1])
                {
                    swap(a,j,j+1);
                }

            }
            for (int j = n/2; j < n-1; j++) {
                if (a[j]<a[j+1])
                {
                    swap(a,j,j+1);
                }

            }


        }


    }


    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 10, 30, 40, 20};
        //1 2 3 4 40 30 20 10
        sort(arr, arr.length);
        for (int e:arr
        ) {
            System.out.println(e);

        }
    }
}
