package sortingalgorithmpart1.practice;

public class selectionsort {

    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    static void selection(int a[]){
        int n=a.length;
        for (int i = 0; i <n-1 ; i++) {
            int min=i;
            for (int j = i+1; j < n; j++) {
                if(a[j]<a[min]){
                    min=j;
                }


            }
            swap(a,i,min);

        }

    }
    static void selections(int a[]){
        int n=a.length;
        int min=0;

        for (int i = 0; i < n; i++) {
            min=i;
            for (int j = i+1; j <n ; j++) {
                if(a[j]<a[min]){
                    min=j;
                    break;
                }


            }
            swap(a,min,i);

        }


    }


    public static void main(String[] args) {
        int a[]={8,1,9,3,4};
        selections(a);
        for (int e:a
             ) {
            System.out.println(e);

        }
    }
}
