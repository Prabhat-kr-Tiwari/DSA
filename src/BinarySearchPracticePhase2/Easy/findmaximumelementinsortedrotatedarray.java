package BinarySearchPracticePhase2.Easy;


// Java implementation of the approach
class findmaximumelementinsortedrotatedarray
{

    // Function to return the maximum element
    static int findMax(int arr[], int low, int high)
    {
        while (low<=high){
            int mid=(low+high)/2;
            if (arr[mid]<arr[mid+1]){
                low=mid+1;
            } else  {
                high=mid-1;

            }
        }
        return arr[low];
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 4,5,6,7,8,1,2,3 };
        int n = arr.length;
        System.out.println(findMax(arr, 0, n -1));
    }
}

