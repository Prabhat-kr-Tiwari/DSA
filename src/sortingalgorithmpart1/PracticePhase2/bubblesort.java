package sortingalgorithmpart1.PracticePhase2;

public class bubblesort {
    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    static void bubble(int a[]){
        int n= a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1 ; j++) {
                if(a[j]>a[j+1])
                {
                    /*printArray(a);
                    System.out.println();*/
                    swap(a,j,j+1);
                    printArray(a);
                    System.out.println();
                }

            }


        }

    }
    static void printArray(int a[]){
        for (int e:a
             ) {
            System.out.print(e);
           // System.out.println();

        }
    }
    public static void main(String[] args) {
        int a[]={9,5,2,6};
        bubble(a);

    }
}
