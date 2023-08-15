package ArrayPractice.Easy;

public class BitonicPoint {

    static int bitonicpoint(int[] arr, int n,int target) {
        int low = 0, high = n - 1;

        while (low <= high) {
//            if (arr[low] <= arr[high]) {
//                return low;  // Array is not rotated
//            }

            int mid = low + (high - low) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;

            if (arr[mid] >= arr[next] && arr[mid] >= arr[prev]&&arr[mid]==target) {
                return arr[mid];  // Index of the smallest element
            } else if (arr[mid] <= arr[high]) {
                high = mid - 1;
            } else if (arr[mid] >= arr[low]) {
                low = mid + 1;
            }
        }

        return -1;  // Not a valid rotated array
    }
    static void s(int a[]){
        int n=a.length;


        for (int i = 1; i <n ; i++) {
            int next = (i + 1) % n;
            int prev = (i + n - 1) % n;
            if (a[i]>a[prev]&&a[next]<a[i]){
                System.out.println(a[i]);
            }


        }


    }


    public static void main(String[] args) {
       // Input:
        int n = 9;
        int arr[] = {1,15,25,45,42,21,17,12,11};
//        Output: 50
        //System.out.println(bitonicpoint(arr,n,45));
        s(arr);

    }
}
