package linkedlistproblem1;

import static linkedlistproblem1.printll.printLL;

public class reversealinkedlistingroupofk {


    static Node<Integer> reverseK(Node<Integer> head, int k)
    {
        Node curr=head;
        Node prevFirst=null;
        Node newHead=null;
        while (curr!=null)
        {
            int count=0;
            Node prev=null;
            Node first=curr;
            while (curr!=null&&count<k)
            {
                Node temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
                count++;
            }
            if (newHead==null)
            {
                newHead=prev;
            }
            else {
                prevFirst.next=prev;
            }
            prevFirst=first;
        }
        return newHead;
    }

    public static void main(String[] args) {
       Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
       Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
       Node<Integer> n5 = new Node<>(50);
        Node<Integer> n6 = new Node<>(60);
        Node<Integer> n7 = new Node<>(70);
        Node<Integer> n8 = new Node<>(80);
            Node<Integer> head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next=n7;
        n7.next=n8;
        printLL(head);
        head=reverseK(head,3);
        printLL(head);
    }
}
