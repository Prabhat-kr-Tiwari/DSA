package sortingalgorithmpart1.practice;

public class quicksort {
    static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }

    static int  pivot(int a[],int l,int h){
        int i=l;
        int j=h;
        int pivot=a[i];
        while (i<j){
            while (i<j&&a[i]<=pivot){
                i++;
            }while (a[j]>pivot){
                j--;
            }
            if(i<j){
                swap(a,i,j);

            }
        }
        swap(a,l,j);
        return j;

    }

    static void quickSort(int a[],int l,int h){
        if(l<h){
            int ppivotindex=pivot(a,l,h);
            quickSort(a,l,ppivotindex-1);
            quickSort(a,ppivotindex+1,h);

        }


    }


    public static void main(String[] args) {
        int a[]={8,1,9,3,4};
        quickSort(a,0,a.length-1);
        for (int e:a
             ) {
            System.out.println(e);

        }

    }
}
