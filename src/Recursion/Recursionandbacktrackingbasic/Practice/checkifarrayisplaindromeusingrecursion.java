package Recursion.Recursionandbacktrackingbasic.Practice;

public class checkifarrayisplaindromeusingrecursion {

    static boolean check(int arr[], int start, int size) {

        if (start>=size)
            return true;
        if (arr[start] == arr[size])
            return check(arr, ++start, --size);
        return false;


    }

    public static boolean isPalendrome(int[] arr, int start, int end) {
        if (start >= end) {
            return true;
        }


        if (arr[start] == arr[end]) {
            return isPalendrome(arr, ++start, --end);
        }

        return false;
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 1,1};

        System.out.println(check(arr, 0, arr.length -1));
        //System.out.println(isPalendrome(arr,0, arr.length-1));

    }
}
