package DSALAB;

import java.util.Arrays;

public class radixsort {

    static int countDigit(int n){

        int count=0;
        int temp=n;
        while (n!=0){
            n=n/10;
            count++;

        }
        return count;
    }


    static int countMaxlength(int[] a){

        int ans=0;
        int n=a.length;
        for (int i = 0; i < n-1; i++) {
            if (a[i]>a[i+1]){
                ans=Math.max(countDigit(a[i]),ans);
            }

        }
        //System.out.println(ans);
        return ans;
    }
    static void radixsort(int a[]){
//        int result[]=new int[a.length];
        int bins[]=new int[10];
        Arrays.fill(bins,0);
        
    }


    public static void main(String[] args) {
        int a[]={237,146,259,348,152,163,235,48,36,62};
        countMaxlength(a);
        System.out.println(countDigit(345));

    }
}
