package ArrayPractice;

import java.util.HashSet;
import java.util.Iterator;

public class SmallestPositivemissingnumber {

    static int countPositive(int[] a){
        int n=a.length;
        int count=0;
        HashSet<Integer>hs=new HashSet<>();
        for (int i = 0; i < n; i++) {
            if(a[i]>0&&a[i]!=0){
                hs.add(a[i]);
            }


        }
        System.out.println("count"+hs.size());
        return hs.size();
    }

    static int miss(int[] a){
        int size=countPositive(a);

        int n=a.length;
        int x=size+1;
        int totalsum=x*(x+1)/2;
        System.out.println("totalsum"+totalsum);
        HashSet<Integer>hs=new HashSet<>();
        for (int i = 0; i < n; i++) {
            if(a[i]>0&&a[i]!=0){
                hs.add(a[i]);
            }

        }
        int sum = 0;
        Iterator<Integer> iterator = hs.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            sum += num;
        }
        return totalsum-sum;


    }

    static void swap(int a,int b)
    {
        a = a - b;

        // b = (initial_a - initial_b) + initial_b = initial_a
        b = a + b;

        // a = initial_a - (initial_a - initial_b) = initial_b
        a = b - a;
    }







    static int missingNumber(int a[])
    {
        // Your code here

        int size=countPositive(a);

        int x=size+1;
        int totalsum=x*(x+1)/2;
        System.out.println("totalsum"+totalsum);
        int currsum=0;



        for(int i=0;i< a.length;i++){
            if (a[i]>0){
                System.out.println("a[i]"+a[i]);
                currsum+=a[i];


            }
        }
        System.out.println("currsum"+currsum);
        return totalsum-currsum;
    }
    static void swapUsingXor(int a[], int i, int j) {
        a[i] = a[i] ^ a[j];
        a[j] = a[i] ^ a[j];
        a[i] = a[i] ^ a[j];
    }
    static int countMissing(int a[])
    {
        int n=a.length;
        for (int i = 0; i < n; i++) {
            int ci=a[i]-1;
            while (a[i]>0 && a[i]<=n &&a[i]!=a[ci]){

                swapUsingXor(a,i,ci);
                ci=a[i]-1;

            }

        }

        for (int i = 0; i < n; i++) {
            if(a[i]!=i+1){
                return i+1;
            }

        }
        return n+1;

    }
    public static void main(String[] args) {
       int[] arr = {28, 7, -36, 21, -21, -50, 9 ,-32};
        int a=5,b=6;
       System.out.println(countMissing(arr));


    }
}
