package PriorityQueue1;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainClass {
    static int kthSmallest(int a[],int k)
    {
        Queue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i<k;i++)
        {
            pq.offer(a[i]);

        }
        for (int i = k; i <a.length ; i++) {
            System.out.println(pq);

            if (pq.peek()>a[i])
            {
                pq.poll();
                pq.offer(a[i]);
            }


        }
        System.out.println(pq);
        return pq.peek();


    }

    static int kthlargest(int a[],int k)
    {
        Queue<Integer> pq=new PriorityQueue<>();
        for (int i=0;i<k;i++)
        {
            pq.offer(a[i]);

        }
        for (int i = k; i <a.length ; i++) {
            System.out.println(pq);

            if (pq.peek()<a[i])
            {
                pq.poll();
                pq.offer(a[i]);
            }


        }
        System.out.println(pq);
        return pq.peek();


    }


    public static void main(String[] args) {


        //this is for min heap
       // Queue<Integer> pq=new PriorityQueue<>();

        //maxheap
        //Queue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        //maxheap using comparator
        Queue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        pq.offer(5);
        pq.offer(10);
        pq.offer(9);
        pq.offer(1);
        int a[]={1,4,9,2,5,6,7};

        //System.out.println(pq.peek());
     /*   System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);*/
        System.out.println(kthlargest(a,3));
    }
}
