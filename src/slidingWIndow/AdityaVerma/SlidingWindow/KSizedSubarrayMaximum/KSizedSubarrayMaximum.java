package slidingWIndow.AdityaVerma.SlidingWindow.KSizedSubarrayMaximum;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class KSizedSubarrayMaximum {


    static ArrayList<Integer> maxOfSubarraysBruteForce(int[] arr, int k) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int l = 0; l <= arr.length-k; l++) {
            int currrentmax=0;
            for (int m = l; m <l+k ; m++) {
                currrentmax= Math.max(currrentmax,arr[m]);

            }
            ans.add(currrentmax);
        }
        return ans;
    }
    static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        int i=0;
        int j=0;
        int size = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer>dq= new LinkedList<>();
        while (j<size){
            //calcu
            while (!dq.isEmpty()&&arr[dq.peekLast()]<=arr[j]){
                dq.removeLast();
            }
            dq.addLast(j);

            if (j-i+1<k){
                j++;
            }else if (j-i+1==k){
                //get ans from cal
                if (!dq.isEmpty()){

                    ans.add(arr[dq.peekFirst()]);
                }
                //maintain the window size
                if (!dq.isEmpty()&&dq.peekFirst()==i){
                    dq.removeFirst();
                }
                //slide
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
//        Output: [3, 3, 4, 5, 5, 5, 6]

        int arr1[] = {5, 1, 3, 4, 2}, k1 = 1;
//        Output: [5, 1, 3, 4, 2]
        System.out.println(maxOfSubarraysBruteForce(arr1,k1));
    }
}
