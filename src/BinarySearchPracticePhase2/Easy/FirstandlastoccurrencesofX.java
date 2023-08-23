package BinarySearchPracticePhase2.Easy;

import java.util.ArrayList;

public class FirstandlastoccurrencesofX {



    static int firstOccurence(int a[],int x){

        int l=0;
        int r=a.length-1;
        int ans=-1;
        while (l<=r){
            int mid=l+(r-l)/2;

            if (a[mid]==x){
                ans=mid;
                r=mid-1;
            } else if (a[mid]>x) {
                r=mid-1;

            }else {
                l=mid+1;

            }

        }
        return ans;

    }
    static int lastOccurence(int a[],int x){
        int l=0;
        int r=a.length-1;
        int ans=-1;
        while (l<=r){
            int mid=l+(r-l)/2;

            if (a[mid]==x){
                ans=mid;
                l=mid+1;
            } else if (a[mid]>x) {
                r=mid-1;

            }else {
                l=mid+1;

            }

        }
        return ans;


    }

//    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
//        // Code here
//    }
    public static void main(String[] args) {
       int a[]= {1, 2, 3, 4  };
        System.out.println(firstOccurence(a,5));

    }
}
