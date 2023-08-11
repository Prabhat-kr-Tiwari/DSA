package ArrayPractice;

public class Multiplyleftandrightarraysum {


    public static int multiply (int arr[], int n) {
        //Complete the function
        int leftsum=0;
        int rightsum=0;

        int  mid=n/2;
        for (int i = 0; i < mid; i++) {
            leftsum+=arr[i];

        }
        for (int i = mid; i <n; i++) {
            rightsum+=arr[i];

        }
        return leftsum*rightsum;
    }
    public static void main(String[] args) {

        /*Input : arr[ ] = {1, 2, 3, 4}
Output : 21
Explanation:
Sum up an array from index 0 to 1 = 3
Sum up an array from index 2 to 3 = 7
Their multiplication is 21.*/
        int arr[ ] = {1, 2} ;

        System.out.println( multiply(arr,arr.length));

    }
}
