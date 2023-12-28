package Teest;

public class selectionsort {



    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    static void Selectionsort(int a[]){
        int min=0;
        int j=0;
        for (int i = 0; i <a.length-1; i++) {
             min=i;
            for ( j = i; j < a.length; j++) {
                if (a[j]<a[min]){
                    min=j;
                }
            }
            swap(a,min,i);
        }
    }
    static void BubbleSort(int a[]){
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j]<a[j+1]){

                    swap(a,j,j+1);
                }

            }



        }
    }

    static void merge(int a[],int left,int mid,int right){
        int b[]=new int[a.length];
        int i=left;
        int j=mid+1;
        int k=left;
        while (i<=mid&&j<=right){
            if (a[i]<a[j]){
                b[k]=a[i];
                i++;
            }else{
                b[k]=a[j];
                j++;
            }
            k++;
        }
        if (i>mid){
            while (j<=right){
                b[k]=a[j];
                j++;
                k++;
            }
        }else {
            while (i<=mid){
                b[k]=a[i];
                i++;
                k++;
            }
        }
        for ( i = left; i <=right; i++) {
            a[i]=b[i];
        }


    }
    static void mergeSort(int a[],int left,int right){

        if (left<right){
            int mid=(left+right)/2;
            mergeSort(a,left,mid);
            mergeSort(a,mid+1,right);
            merge(a,left,mid,right);
        }


    }

    static boolean bs(int a[],int target){

        int left=0;
        int right=a.length;
        while (left<right){
            int mid=(left+right)/2;
            if (a[mid]==target){
                return true;
            }
            else if (a[mid]>target){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return false;
    }

    static boolean linearSearch(int a[],int target){
        for (int i = 0; i < a.length; i++) {
            if (a[i]==target){
                return true;

            }

        }
        return false;
    }

    static void insertionSort(int a[]){
        for (int i = 0; i < a.length; i++) {

            for (int j = i+1; j >=0 ; j--) {

                if (a[j]>a[i]){
                    swap(a,i,j);
                }

            }

        }
    }
    static void secondlargest(int a[]){
        int first=Integer.MIN_VALUE;
        int second=0;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]>first){
                second=first;
                first=a[i];

            }
            if (a[i]>second&&a[i]<first){
                second=a[i];
            }


        }
        System.out.println(second);
    }


    public static void main(String[] args) {
        int a[]={0,1,2,3,4};
//        mergeSort(a,0,a.length-1);
//        System.out.println(linearSearch(a,4));
//        insertionSort(a);
        /*for (int e:a
             ) {
            System.out.println(e);

        }*/
        secondlargest(a);




    }
}
