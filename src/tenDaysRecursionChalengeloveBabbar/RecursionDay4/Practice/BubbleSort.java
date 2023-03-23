package tenDaysRecursionChalengeloveBabbar.RecursionDay4.Practice;

public class BubbleSort {


    static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void bubbleSort(int[] arr, int size)
    {
        if (size==0||size==1)
        {
            return;
        }
        for (int i = 0; i <size-1 ; i++) {
            if (arr[i]>arr[i+1])
            {
                swap(arr,i,i+1);

            }
        }
        bubbleSort(arr,size-1);
    }

    public static void main(String[] args) {
        int[] arr ={1,3,2,3,4,3,9,0};
        bubbleSort(arr,arr.length);
        for (int e:arr
             ) {
            System.out.println(e);

        }
    }
}
