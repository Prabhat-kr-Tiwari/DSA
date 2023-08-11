package ArrayPractice;

import java.util.*;

public class slidingwindowmaximum {
    
    static void slide(int a[],int n,int k){
        int max=0;

        for (int i = 0; i <= n-k;i++) {

            max=a[i];

            for (int j = 1; j <k ; j++) {

                if(a[i+j]>max){
                    max=a[i+j];
                }


                
            }
            System.out.println("Max   "+max);
            
        }
    }
    static ArrayList<Integer> findmax(int a[],int n,int k){

        // add and peek O(logk)
        PriorityQueue<Integer>queue=new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer>res=new ArrayList<>();
        int i=0;
        for (; i < k; i++) {
            queue.add(a[i]);

        }
        res.add(queue.peek());
        queue.remove(a[0]);
        for (; i <n ; i++) {
            queue.add(a[i]);
            res.add(queue.peek());
            queue.remove(a[i-k+1]);
            
        }
        return res;
    }


    static void printMax(int arr[], int N, int K)
    {

        // Create a Double Ended Queue, Qi
        // that will store indexes of array elements
        // The queue will store indexes of
        // useful elements in every window and it will
        // maintain decreasing order of values
        // from front to rear in Qi, i.e.,
        // arr[Qi.front[]] to arr[Qi.rear()]
        // are sorted in decreasing order
        Deque<Integer> Qi = new LinkedList<Integer>();

        /* Process first k (or first window)
        elements of array */
        int i;
        for (i = 0; i < K; ++i) {

            // For every element, the previous
            // smaller elements are useless so
            // remove them from Qi
            while (!Qi.isEmpty()
                    && arr[i] >= arr[Qi.peekLast()])

                // Remove from rear
                Qi.removeLast();

            // Add new element at rear of queue
            Qi.addLast(i);
        }

        // Process rest of the elements,
        // i.e., from arr[k] to arr[n-1]
        for (; i < N; ++i) {

            // The element at the front of the
            // queue is the largest element of
            // previous window, so print it
            System.out.print(arr[Qi.peek()] + " ");

            // Remove the elements which
            // are out of this window
            while ((!Qi.isEmpty()) && Qi.peek() <= i - K)
                Qi.removeFirst();

            // Remove all elements smaller
            // than the currently
            // being added element (remove
            // useless elements)
            while ((!Qi.isEmpty())
                    && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();

            // Add current element at the rear of Qi
            Qi.addLast(i);
        }

        // Print the maximum element of last window
        System.out.print(arr[Qi.peek()]);
    }
    public static void main(String[] args) {

        int k=3;
        int a[]={1,2,3,4,5,6,7,8,9,10};
        slide(a,a.length,3);
        System.out.println(findmax(a,a.length,k));
        
    }
}
