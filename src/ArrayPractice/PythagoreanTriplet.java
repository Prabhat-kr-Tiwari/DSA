package ArrayPractice;

import java.security.KeyStore;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PythagoreanTriplet {
    static boolean checkTriplet(int[] arr, int n) {



        HashMap<Integer,Integer>hs=new HashMap<>();
        for (int i = 0; i <n ; i++) {
            hs.put(i,  (arr[(int) i] *arr[(int) i]));

        }
        System.out.println(hs);

       /* for (int i = 0; i < n; i++) {

            int result=arr[i]*arr[i];

            for (int j = 0; j < n&&i!=j; j++) {

                result*=arr[j]*arr[j];

                if(hs.containsValue(result)){

                    return  true;
                }

            }

        }*/
        int f[]=new int[n];
        int i=0;
        int result=0;
        for (Map.Entry<Integer, Integer> x : hs.entrySet()) {
            f[i++]=x.getValue();
        }
        for (int e:f
             ) {
            System.out.println("e    "+e);

        }
        for (int j = 0; j <n ; j++) {
            result=0;
            for (int k = j+1; k < n; k++) {
                result=f[j]+f[k];
                System.out.println("result  "+result);
                if(hs.containsValue(result)){
                    return true;
                }


            }

        }
        return false;
        // code here
    }
    static void swap(int a[],int i,int j){
        a[i]=a[i]^a[j];
        a[j]=a[i]^a[j];
        a[i] =a[i]^a[j];
    }
    static void bubble(int [] a,int n ){

        for (int i = 0; i < n-1; i++) {

            for (int j = 0; j <n -1; j++) {
                if(a[j]>a[j+1])
                {
                    swap(a,j,j+1);
                }



            }

        }
    }

    static boolean isTriplet(int a[]){
        for (int i = 0; i <a.length ; i++) {
            a[i]=a[i]*a[i];

        }
        Arrays.sort(a);
        int n=a.length;
        for (int i = n-1; i >=0 ; i--) {

            int l=0;
            int r=n-1;
            while (l<r){
                if(a[l]+a[r]==a[i]){
                    System.out.println(a[l]);
                    System.out.println(a[r]);
                    System.out.println(a[i]);
                    return true;
                } else if (a[l]+a[r]<a[i]) {
                    l++;

                }else {
                    r--;
                }

            }

        }
        return false;
    }

    public static void main(String[] args) {

        /*Input:
N = 5
Arr[] = {3, 2, 4, 6, 5}
Output: Yes
Explanation: a=3, b=4, and c=5 forms a
pythagorean triplet.


Given an array arr of N integers, write a function that returns true if there is a
triplet (a, b, c) that satisfies a2 + b2 = c2, otherwise false.*/
       // int a[]={3, 2, 4, 6, 5};
        int a[]={1,3,0,2,7,6};
       int b[]={93 ,39 ,80 ,91 ,58 ,59 ,92 ,16 ,89, 57, 12 ,3 ,35 ,73 ,56 ,29 ,47 ,63 ,87};
        //System.out.println(checkTriplet(b, b.length));
//        bubble(a,a.length);
//        for (int w:a
//             ) {
//            System.out.println(w);
//
//        }

        int c[]={3,1,4,6,5};
        System.out.println(isTriplet(c));




    }
}
