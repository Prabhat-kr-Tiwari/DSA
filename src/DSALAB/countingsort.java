package DSALAB;

public class countingsort {

    static int findMax(int a[]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]>max){
                max=a[i];
            }

        }
        return max;
    }
    static void basicCountingSort(int a[]){//2 4 2 2
        //find the largest element of array
        int max=findMax(a);
        int []count=new int[max+1];
        for (int i = 0; i <a.length ; i++) {
            count[a[i]]++;

        }
       int k=0;
        for (int i = 0; i < count.length ; i++) {
            for (int j = 0; j < count[i]; j++) {
                a[k++]=i;

            }

        }

    }
    static void display(int a[]){
        for (int e:a
             ) {

            System.out.println(e);
        }
    }

    static void countSort(int a[]){
        int n=a.length;
        int output[]=new int[n];
        //find the largest element of array
        int max=findMax(a);
        int []count=new int[max+1];
        for (int i = 0; i <a.length ; i++) {
             count[a[i]]++;

        }
        //make prefix sum array of count array
        for (int i = 1; i < count.length ; i++) {
            count[i]+=count[i-1];

        }
        //find the index of each element
        //int the original and put in the output array
        for (int i = n-1; i >=0 ;i--) {

            int index=count[a[i]]-1;
            output[index]=a[i];
            count[a[i]]--;


        }
        //copy all elements of output array
        for (int i = 0; i <n ; i++) {
            a[i]=output[i];

        }



    }



    public static void main(String[] args) {
        int a[]={1,4,5,2,2,5,0,12};
        countSort(a);
        display(a);
    }
}
