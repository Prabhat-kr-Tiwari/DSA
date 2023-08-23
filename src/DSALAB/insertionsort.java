package DSALAB;

public class insertionsort {


    static void Insertionsort(int a[])
    {
        int n=a.length;
        //1st loop 1 se run ho raha hai kyu ki maine pahla element sorted man liya hai
        for (int i = 1; i < n; i++) {
            // printArray( a);
            // System.out.println();
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

    static void insertionsort(int a[],int n){
        for (int i = 0; i <n ; i++) {


            int j=i-1;
            int temp=a[i];
            for (; j >=0; j--) {
                if (temp<a[j]){
                    a[j+1]=a[j];
                }else{
                    break;
                }

            }
            a[j+1]=temp;

        }
    }


    static void ins(int a[],int n){

        for (int i = 0; i < n; i++) {
            int temp=a[i];
            int j=i-1;
            for (; j >=0 ; j--) {
                if (temp<a[j]){
                    a[j+1]=a[j];
                }else{
                    break;
                }

            }
            a[j+1]=temp;
        }
    }

    static void i(int a[],int n){

        for (int i = 0; i < n; i++) {
            int j=i-1;
            int temp=a[i];
            for (; j >= 0; j--) {
                if (temp<a[j]){
                    a[j+1]=a[j];
                }else {
                    j=-1;
                }

            }
            a[j+1]=temp;
        }
    }



    public static void main(String[] args) {
        int a[]={3,2,1,0,5};
        i(a,a.length);
        for (int e:
             a) {
            System.out.println(e);


        }
    }
}
