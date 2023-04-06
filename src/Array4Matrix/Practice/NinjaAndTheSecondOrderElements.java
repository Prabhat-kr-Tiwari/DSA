package Array4Matrix.Practice;

import java.util.Arrays;

public class NinjaAndTheSecondOrderElements {

    public static void getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int ar[]=new int[2];
        java.util.Arrays.sort(a);
        if(n>=2){
            ar[0]=a[n-2];
            ar[1]=a[1];
            System.out.println(ar[0]);
            System.out.println(ar[1]);
            //return ar;

        }else{
            for (int e:a
                 ) {
                System.out.println(e);

            }
        }


    }

    public static void main(String[] args) {
        int a[]={3 ,4 ,5 ,2};
        getSecondOrderElements(4,a);
        //System.out.println(Arrays.stream(getSecondOrderElements(4,a)).toArray());
    }
}
