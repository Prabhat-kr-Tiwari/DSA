package ArrayPractice.Easy;

public class quicksort {
    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }


    static int pivot(int a[],int l,int h){


        int i=l;
        int pivot=a[i];
        int j=h;
        while (i<j){
            while (i<j&&a[i]<=pivot){
                i++;
            }
            while (a[j]>pivot){
                j--;
            }
            if (i<j){
                swap(a,i,j);
            }
        }
        swap(a,l,j);
        return j;
    }
    static void quicksorts(int[] a, int l, int h){
        int pivotindex=pivot(a,l,h);
        if (l<h){



            quicksorts(a,l,pivotindex-1);
            quicksorts(a,pivotindex+1,h);

        }

    }


    public static void main(String[] args) {
        int a[]={1,2,10,9,1,0};
        quicksorts(a,0,a.length-1);
        for (int e:a
             ) {

            System.out.println(e);
        }

    }
}
