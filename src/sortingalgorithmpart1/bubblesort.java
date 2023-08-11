package sortingalgorithmpart1;

public class bubblesort {
    static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }

    static void BubbleSort(int a[])
    {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j]>a[j+1])
                {
                    swap(a,j,j+1);
                }

            }

        }
    }
    static void optimizeBubbleSort(int a[])
    {
        for (int i = 0; i < a.length-1; i++) {
            boolean isSwap =false;
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j]>a[j+1])
                {
                    isSwap=true;
                    swap(a,j,j+1);
                }
                if(!isSwap) break;


            }

        }
    }

    static void bubble(int a[]){
        int n=a.length;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(a[j+1]<a[j]){
                    swap(a,j,j+1);
                }

            }

        }
    }

    public static void main(String[] args) {
        int a[]={2,16,3,67,0};
        bubble(a);
        for (int e:a
             ) {
            System.out.println(e);

        }
        /*optimizeBubbleSort(a);
        for (int e:a
             ) {
            System.out.println(e);

        }*/

    }
}
