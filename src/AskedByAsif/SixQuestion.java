package AskedByAsif;

public class SixQuestion {


    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    static void linearsearcj(int a[],int target){
        for (int i = 0; i < a.length; i++) {
            if (a[i]==target){
                System.out.println("find");
            }else {

                System.out.println("not found");
            }

        }
    }


    static void binarysearch(int a[],int target){


        int l=0;
        int r=a.length-1;
        while (l<=r){
            int mid=(l+r)/2;
            if (a[mid]==target){
                System.out.println("find");
                break;
            } else if (a[mid]>target) {
                r--;

            }else {
                l++;
            }
        }

    }

    static void bubllesort(int a[]){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]){
                    swap(a,i,j);
                }

            }

        }
    }
    static void  selectionSort(int a[]){

        for (int i = 0; i < a.length; i++) {
            int temp=a[i];
            for (int j = i+1; j < a.length; j++) {
                if (a[j]<temp){
                    swap(a,i,j);
                }

            }

        }


    }
    static void insertionsort(int a[]){

        for (int i = 1; i <a.length ; i++) {
            int temp=a[i];
            int j=i-1;
            for (; j >=0 ; j--) {
                if (temp<a[j]){
                    a[j+1]=a[j];
                }else {
                    break;
                }
            }
            a[j+1]=temp;
        }
    }

    public static void main(String[] args) {

        int a[]={0,5,4,6,1};
//        bubllesort(a);
        insertionsort(a);

        for (int e:a
             ) {

            System.out.println(e);
        }

    }



}
