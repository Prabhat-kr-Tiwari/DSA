package BinarySearchPracticePhase2.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class SmallerSum {

    /*Input:
n = 3
arr = {1, 2, 3}
Output:
0 1 3
Explanation:
For 1, there are no elements lesser than itself.
For 2, only 1 is lesser than 2.
And for 3, 1 and 2 are lesser than 3, so the sum is 3.*/
    static int sum(int a[],int l,int r){

        int sum=0;
        for (int i = l; i <r ; i++) {
            sum+=a[i];

        }
        return sum;
    }

    public static ArrayList<Integer> smallerSum(int n, int a[], int target)
    {
        int l=0;
        long[] ans =new long[n];
        int r=a.length-1;
        ArrayList<Integer>al=new ArrayList<>();
        int i=0;
        while (l<=r){
            int mid=l+(r-l)/2;
            if (a[mid-1]<a[mid]){
                al.add(sum(a,l,mid-1));
            } else if (a[mid-1]==a[mid]) {
                l=mid-1;

            }else{
                r=mid+1;

            }
        }
        return al;

    }
    public static long[] smallerSum2(int n, int a[]) {
        int[] sortedArr = Arrays.copyOf(a, n);
        long b[]=new long[n];
        Arrays.sort(sortedArr);

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int index = Arrays.binarySearch(sortedArr, a[i]);
            int smallerSum = sum(sortedArr, 0, index);
            al.add(smallerSum);
            b[i]=smallerSum;
        }
        //System.out.println(Arrays.toString(b));

        return b;
    }
    public long[] smallerSum(int n,int arr[])
    {

        long[] newarray=new long[n];
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]<arr[i] )
                {
                    sum=sum+arr[j];
                }
                newarray[i]=sum;

            }
        }
        return newarray;
    }


    public static void main(String[] args) {
        int a[] = {1,2,3};
       // ArrayList<Integer> result = smallerSum2(a.length, a);
        System.out.println(Arrays.toString(smallerSum2(a.length, a)));
        //System.out.println((smallerSum2(a.length, a)));
        int b[] = {10,20,15,22,35,35};

       // System.out.println(Arrays.binarySearch(b,35));

    }
}

