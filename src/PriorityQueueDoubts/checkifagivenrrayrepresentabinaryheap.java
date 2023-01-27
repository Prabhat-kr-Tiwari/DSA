package PriorityQueueDoubts;

public class checkifagivenrrayrepresentabinaryheap {


    static public boolean isMaxheap(long arr[], long n) {
        // Your code goes here
        return isMaxheap(arr, 0);


    }

    static boolean isMaxheap(long arr[], int i) {
        int n = arr.length;
        if (i >= n / 2) return true;
        // long i=1;
        int leftchild = 2 * i + 1;
        int rightchild = 2 * i + 2;
        if (arr[i] >= arr[leftchild] && isMaxheap(arr, leftchild)) {
            if (rightchild < n) {
                return arr[i] >= arr[rightchild] && isMaxheap(arr, rightchild);
            } else return true;
        }
        return false;
    }


    public static void main(String[] args) {

        long arr[] = {90, 15, 10, 7, 12, 2};
        System.out.println(isMaxheap(arr, 0));

    }
}
