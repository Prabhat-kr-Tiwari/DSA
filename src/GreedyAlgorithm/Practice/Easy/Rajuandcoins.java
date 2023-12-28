package GreedyAlgorithm.Practice.Easy;

import java.util.Arrays;

public class Rajuandcoins {


    static boolean binarySearch(int a[],int n,int target){
        int l=0;
        int r=n;
        while (l<r){
            int mid=(l+r)/2;
            if (a[mid]==target){
                return true;
            } else if (a[mid]>target) {
                r=mid-1;

            }else {
                l=mid+1;
            }
        }
        return false;
    }


    static int maxNumbers(int n, int k, int a[]){
        // code here
        int m=1000000000;
        Arrays.sort(a);
        int sum=0;
        int count=0;

        int number=1;

        while (sum<k){
            if (!binarySearch(a,n,number)){

               count=(count+1)%m;
                sum+=number;
//                number=(number%m)+1;

                sum%=m;
            }
            number=(number%m)+1;

        }
        return count-1;

    }
    public static void main(String[] args) {

        int n = 4;
            int     k = 14;
                int []a = {4, 6, 12, 8};
//
//        int n= 4;
//        int     k  = 25;
//        int []a = {5, 6, 7, 8};
//        int n=4;int k= 918502652;
//        int  a[]={752392755, 474612400, 53999933, 264095061};
        System.out.println(maxNumbers(n,k,a));
//        42859

    }
}
