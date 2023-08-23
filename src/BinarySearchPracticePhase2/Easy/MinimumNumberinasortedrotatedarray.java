package BinarySearchPracticePhase2.Easy;

public class MinimumNumberinasortedrotatedarray {


    //Function to find the minimum element in sorted and rotated array.
    static int minNumber(int a[], int low, int high)
    {
        // Your code here

        int l=0;
        int r=a.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(a[mid]>=a[r])
            {
                l=mid+1;
            }else {

                r=mid;

            }
        }
        return a[l];
    }
    public static void main(String[] args) {
        int N = 10;
        int arr[] ={2,3,4,5,6,7,8,9,10,1};
        System.out.println(minNumber(arr,0,0));

    }
}
