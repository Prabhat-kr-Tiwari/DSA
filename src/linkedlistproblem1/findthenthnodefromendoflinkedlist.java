package linkedlistproblem1;

import static linkedlistproblem1.deleteinalinkedlist.delete;
import static linkedlistproblem1.printll.printLL;

public class findthenthnodefromendoflinkedlist {

    static int countNode(Node head){

        int countt = 0;
        while(head != null) {
            //int counnt  = 0;
            head = head.next;
            countt++;

        }
        return countt;
    }



    static Node<Integer> getNthFromLast(Node<Integer> head, int n)
    {
        // Your code here
        int count=countNode(head);
        /*if (n==count) return  head.data;
        if (n>count) return -1;*/
        if (n==count) return head;
        if (n>count) return null;
        /*int tofind=count-n+1;*/
        Node<Integer> curr=head;
        for (int i = 0; i <n ; i++) {
            curr=curr.next;


        }
        //return curr.data;
        curr.next=curr.next.next;
        return head;

    }
    static Node<Integer> delete(int position,Node<Integer> head)
    {
        if (head==null) return null;
        if (position==0)
        {
            head=head.next;
            return head;

        }
        Node<Integer> curr=head;
        for (int i = 1; i < position-1; i++) {
            curr=curr.next;
        }
        curr.next=curr.next.next;
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

        printLL(head);
        int n=2;
        int count=countNode(head);
        int tofind=count-n+1;
       // System.out.println(getNthFromLast(head,2));
        //head=getNthFromLast(head,tofind);
        head=delete(tofind,head);
        printLL(head);

    }
}
