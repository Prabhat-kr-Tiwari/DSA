package leetcode75.slidingWindow.KSizedSubarrayMaximum;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class KSizedSubarrayMaximum {


    static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>(); // store indices of useful elements
        int size = arr.length;
        int i = 0, j = 0;

        while (j < size) {

            // Remove all elements smaller than the current element from the back
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[j]) {
                dq.removeLast();
            }

            // Add current element index
            dq.addLast(j);

            // If window size < k, expand it
            if (j - i + 1 < k) {
                j++;
            }
            // When window size == k
            else if (j - i + 1 == k) {

                // Front of the deque is the index of the maximum element for current window
                ans.add(arr[dq.peekFirst()]);

                // Before sliding, remove elements that are out of this window
                if (!dq.isEmpty() && dq.peekFirst() == i) {
                    dq.removeFirst();
                }

                // Slide the window
                i++;
                j++;
            }
        }
        return ans;
    }

    static int[] maxSlidingWindow(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>(); // store indices of useful elements
        int size = arr.length;
        int i = 0, j = 0;

        while (j < size) {

            // Remove all elements smaller than the current element from the back
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[j]) {
                dq.removeLast();
            }

            // Add current element index
            dq.addLast(j);

            // If window size < k, expand it
            if (j - i + 1 < k) {
                j++;
            }
            // When window size == k
            else if (j - i + 1 == k) {

                // Front of the deque is the index of the maximum element for current window
                ans.add(arr[dq.peekFirst()]);

                // Before sliding, remove elements that are out of this window
                if (!dq.isEmpty() && dq.peekFirst() == i) {
                    dq.removeFirst();
                }

                // Slide the window
                i++;
                j++;
            }
        }
        int[] result = new int[ans.size()];
        for (int idx = 0; idx < ans.size(); idx++) {
            result[idx] = ans.get(idx);
        }

        return result;    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
//        Output: [3, 3, 4, 5, 5, 5, 6]
        int a[] = {33, 38, 46, 24, 26, 6, 42, 28};
        int k1 = 2;
        int c[] = {8, 5, 5, 5, 1, 2, 3};
        int k2 = 3;
        System.out.println(maxOfSubarrays(arr, k));
        System.out.println(maxOfSubarrays(a, k1));
//        [8, 5, 5, 5, 3]

        System.out.println(maxOfSubarrays(c, k2));
    }
}
