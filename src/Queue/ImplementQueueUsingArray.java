package Queue;

public class ImplementQueueUsingArray {
    public static void main(String[] args) throws Exception {
        QueueUsingArray q=new QueueUsingArray(3);
        q.enqueue(10);
        q.enqueue(20);q.enqueue(30);
        System.out.println( q.dequeue());
        System.out.println( q.dequeue()); System.out.println( q.dequeue());






    }


}
