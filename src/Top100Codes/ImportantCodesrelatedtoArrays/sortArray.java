package Top100Codes.ImportantCodesrelatedtoArrays;

public class sortArray {
    static void swap(int a[],int start,int end){
        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;
    }

    static void sort(int a[],int n){
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                if (a[i]>a[j])
                    swap(a,i,j);


            }

        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 10, 30, 40, 20};
        sort(arr, arr.length);
        for (int e:arr
        ) {
            System.out.println(e);

        }

    }
}
