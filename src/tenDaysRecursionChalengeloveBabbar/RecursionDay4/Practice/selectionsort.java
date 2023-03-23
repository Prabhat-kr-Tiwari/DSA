package tenDaysRecursionChalengeloveBabbar.RecursionDay4.Practice;

public class selectionsort {

    static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void selectionSort(int a[])
    {
        int n=a.length;
        for (int i = 0; i < n-1; i++) {


            int min=i;
            for (int j = i+1; j <a.length ; j++) {
                if(a[j]<a[min])
                {
                    min=j;
                }

            }
            swap(a,min,i);

        }
    }

    public static void main(String[] args) {
        int a[]={2,3,1,6,5};
        selectionSort(a);
        System.out.print(" [ ");
        for (int e:a
             ) {
            System.out.print(e+" ");

        }
        System.out.println(" ]");
    }
}
