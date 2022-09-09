package Queue;

public class implementqueueUsingCircularArray {


    public static void main(String[] args) throws Exception {
        QueueUsingCircularArray q=new QueueUsingCircularArray(4);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println( q.dequeue());
        System.out.println( q.dequeue());
        q.enqueue(50);
        System.out.println( q.dequeue());
        System.out.println( q.dequeue());
        System.out.println( q.dequeue());
    }
}
