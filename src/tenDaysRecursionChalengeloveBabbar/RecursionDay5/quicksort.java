package tenDaysRecursionChalengeloveBabbar.RecursionDay5;

public class quicksort {

    static void swap(int a[],int i,int j)
    {

        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static int partition(int a[],int l,int h)
    {
        int i=l;
        int j=h;
        int pivot=a[l];
        while (i<j){
            while (i<j && a[i]<=pivot)
            {
                i++;
            }
            while (a[j]>pivot)
            {
                j--;
            }
            if(i<j)
            {
                swap(a,i,j);
            }
        }
        swap(a,l,j);
        //j is pivot position
        return j;
    }
    static void quickSort(int a[],int l,int h)
    {
        if(l>=h)
            return;
        int pivot=partition(a,l,h);
        quickSort(a,l,pivot-1);
        quickSort(a,pivot+1,h);
    }

    public static void main(String[] args) {
        int a[]={2,1,23,21,1};
        quickSort(a,0,a.length-1);
        for (int e:a
             ) {
            System.out.println(e);

        }
    }

}
