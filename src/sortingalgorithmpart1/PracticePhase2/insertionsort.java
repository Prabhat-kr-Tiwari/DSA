package sortingalgorithmpart1.PracticePhase2;

public class insertionsort {
    static void insertion(int a[]){
        int n=a.length;

        for (int i = 1; i <n ; i++) {
            int j=i-1;
            int temp=a[i];
            for (; j >=0 ; j--) {
                if (a[j]>temp)
                {
                    a[j+1]=a[j];
                }else {
                    break;
                }

            }
            a[j+1]=temp;


        }
    }
    //insertionsort
    static void insertionsort(int a[]){
        int n=a.length;
        for (int i = 1; i <n ; i++) {
            int j=i-1;
            int temp=a[i];
            for (; j >=0; j--) {
                if (a[j]>temp){
                    a[j+1]=a[j];
                }else {
                    break;
                }


            }
            a[j+1]=temp;

        }

    }
    //insert
    static void insert(int a[]){
        int n=a.length;
        for (int i = 1; i < n; i++) {
            int j=i-1;
            int temp=a[i];
            for (; j >=0 ; j--) {
                if (a[j]>temp){
                    a[j+1]=a[j];
                }else {
                    break;
                }


            }
            a[j+1]=temp;


        }

    }
    static void in(int a[]){

        int n=a.length;
        for (int i = 1; i < n; i++) {
            int j=i-1;
            int temp=a[i];
            for (; j >=0; j--) {
                if (a[j]>temp){
                    a[j+1]=a[j];
                }else {
                    break;
                }

            }
            a[j+1]=temp;

        }
    }
    //
    static void inse(int a[]){
        int n=a.length;

        for (int i = 1; i < n; i++) {
            int j=i-1;
            int temp=a[i];
            for (; j >=0 ; j--) {
                if (a[j]>temp){
                    a[j+1]=a[j];
                }else {
                    break;
                }

            }
            a[j+1]=temp;

        }
    }


    static void printArray(int a[]){
        for (int e:a
        ) {
            System.out.print(e+" ");
            // System.out.println();

        }
    }

    public static void main(String[] args) {
        int a[]={9,5,2,6};
        insert(a);
        printArray(a);
    }
}
