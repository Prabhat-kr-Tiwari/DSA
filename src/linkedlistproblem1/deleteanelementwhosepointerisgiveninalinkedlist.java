package linkedlistproblem1;

import static linkedlistproblem1.printll.printLL;

public class deleteanelementwhosepointerisgiveninalinkedlist {


    static Node<Integer> deletenode(Node<Integer>head,Node<Integer> Node_ptr)

    {
        Node<Integer> temp=Node_ptr.next;
        Node_ptr.data=temp.data;
        Node_ptr.next=temp.next;
        temp=null;
        return head;
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
        head=deletenode(head,n5);
        printLL(head);
    }
}
