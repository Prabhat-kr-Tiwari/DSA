package Queue;

public class implementqueueusinglinkedlist {

    public static void main(String[] args) throws Exception {
        QueueUsingLinkedList queueUsingLinkedList=new QueueUsingLinkedList();
        queueUsingLinkedList.enqueue(10);
        queueUsingLinkedList.enqueue(20);
        queueUsingLinkedList.enqueue(30);
        queueUsingLinkedList.enqueue(40);
        System.out.println(queueUsingLinkedList.dequeue());
        System.out.println(queueUsingLinkedList.dequeue());
        queueUsingLinkedList.enqueue(50);
        System.out.println(queueUsingLinkedList.dequeue());
        System.out.println(queueUsingLinkedList.dequeue());
        System.out.println(queueUsingLinkedList.dequeue());




    }
}
