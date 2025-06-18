package rbAnjaliCodes.ProblemOfDay18062025;

import linkedlistproblem1.insertinlinkedlist;

public class Solution {


    public static class Node<T> {
        //Integer data;  for the null support
        T data;//int doesn't support null
        Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    static Node<Integer> insert(int data, int position, Node<Integer> head) {
        Node<Integer> newNode = new Node<>(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node<Integer> curr = head;
        for (int i = 0; i < position - 1; i++) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

    static void printLL(Node<Integer> head) {
        Node cur = head;
        while (cur != null) {

            System.out.print(cur.data + "->");
            cur = cur.next;
        }
        System.out.println(" end ");
    }
    public static Node<Integer> swapPairs(Node<Integer> head) {
        if(head==null|| head.next==null) return head;

        Node curr = head;
        while (curr!=null&&curr.next!=null){
            System.out.println("swap "+ curr.data +" "+curr.next.data );
            int temp = (int) curr.data;
            curr.data = curr.next.data;
            curr.next.data = temp;
            curr = curr.next.next;
        }
        return head;
    }

    //swap with value gfg
    public Node pairwiseSwap(Node head) {
        // code here
        Node a = head,b,c;
        Node prev =null;
        while(a!=null&&a.next!=null){

            b = a.next;
            c = b.next;
            if(a==head){
                head =b;
            }else{
                prev.next = b;
            }
            b.next = a;
            a.next = c;
            prev = a;
            a =c;


        }
        return head;
    }

    public static void main(String[] args) {

        Node<Integer> n1 = new Node<>(1);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(3);
        Node<Integer> n4 = new Node<>(4);


        Node<Integer> head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        printLL(head);
       Node<Integer> newHead =  swapPairs(head);
        System.out.println("new");
       printLL(newHead);

    }

}
