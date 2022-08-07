package linkedlistproblem1;

import static linkedlistproblem1.printll.printLL;

public class reverselinkedlistiteratively {

    static Node<Integer> reverseiteratively(Node<Integer> head)
    {
        Node<Integer> curr=head;
        Node<Integer> prev=null;
        while (curr!=null)
        {
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;


        }

        return prev;
    }

    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer>  n2 = new Node<>(20);
        Node<Integer>  n3 = new Node<>(30);
        Node<Integer>  n4 = new Node<>(40);
        Node<Integer>  n5 = new Node<>(50);
        Node<Integer>  n6 = new Node<>(60);

        Node<Integer> head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        printLL(head);
        head=reverseiteratively(head);
        printLL(head);
    }
}
