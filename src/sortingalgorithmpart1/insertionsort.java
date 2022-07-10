package sortingalgorithmpart1;

public class insertionsort {
    static void Insertionsort(int a[])
    {
        int n=a.length;
        //1st loop 1 se run ho raha hai kyu ki maine pahla element sorted man liya hai
        for (int i = 1; i < n; i++) {
            printArray( a);
            System.out.println();
            int j = i-1;
            int temp=a[i];
            for (; j >=0 ; j--) {
                if (temp<a[j])
                {
                    a[j+1]=a[j];
                }
                else
                {
                    break;
                }
            }
            a[j+1]=temp;
        }
    }
    static void printArray(int a[])
    {
        for (int e:a
        ) {
            System.out.print(e);

        }
    }

    public static void main(String[] args) {
        int a[]={9,5,2,6,3,1,3};
        Insertionsort(a);


    }
}
