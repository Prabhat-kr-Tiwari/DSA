package JavaCollectionFramework;

import javax.management.Query;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class learnqueue {
    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
        System.out.println(queue.remove());//it removes element at the head
        System.out.println(queue);

    }

}
