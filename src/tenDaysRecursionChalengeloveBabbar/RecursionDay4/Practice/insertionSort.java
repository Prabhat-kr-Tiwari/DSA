package tenDaysRecursionChalengeloveBabbar.RecursionDay4.Practice;

public class insertionSort {
    static int i=1;
    static void printArray(int a[]) {
        for(int e: a) {
            System.out.print(e+" ");
        }
    }
    static void insertionsort(int a[])
    {
        //sorted part   |     unsorted part
        //9             |     5 2 6 3 1 3
        //i 1 se start ho raha hai kyu ki 1st element ko sorted man liya hai

        for (int i = 1; i <a.length ; i++) {

            int j=i-1;
            int temp=a[i];
            for(; j >= 0; j--) {
                if (temp<a[j])
                {
                   a[j+1]=a[j];
                }else{
                    break;
                }

            }
            a[j+1]=temp;
        }
    }
    static  void insertionSortUsingRecursion(int a[],int n)
    {

        if(n<1)
            return;
        insertionSortUsingRecursion(a,n-1);

        int temp=a[i];
        int j=i-1;
        for (; j >=0 ; j--) {
            if(temp<a[j])
            {
                a[j+1]=a[j];
            }else{
                break;
            }

        }
        a[j+1]=temp;
        i++;
    }



    public static void main(String[] args) {
        int a[]={9,5,2,6,3,1,3};
        insertionSortUsingRecursion(a,a.length);
        for (int w:a
             ) {
            System.out.println(w);

        }

    }

}
