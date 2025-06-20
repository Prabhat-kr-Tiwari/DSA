package rbAnjaliCodes.ProblemOfDay20062025;

import rbAnjaliCodes.ProblemOfDay18062025.Solution;

public class Add1toaLinkedListNumber {


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

/*    public Node addOne(Node head) {
        // code here.
        head = reverseLinkedList(head); //tc = O(n)
        int carry = 1;
        Node temp = head;
        while (temp != null) { //tc  = O(n)
            temp.data = (temp.data) + carry;
            if (temp.data < 10) {
                break;
            } else {

                temp.data = 0;
                carry = 1;
            }
            temp = temp.next;

        }
        if (carry == 1) {
            Node newNode = new Node(1);
            head = reverseLinkedList(head);//tc  = O(n)
            newNode.next = head;
            return newNode;
        }
        return reverseLinkedList(head);

        //total tc  O(3n);
//        space complexity = O(1)

    }*/

    public static Node addOneUsingRecursion(Node head) {
        int carry = healper(head);
        if (carry == 1) {

            Node newNode = new Node(1);
            newNode.next = head;

            return newNode;
        }
        return head;


    }

    static int healper(Node head) {
        if (head == null) {
            return 1;
        }
        int carry = healper(head.next);
        head.data = carry+(Integer)head.data;

        if ((Integer) head.data < 10) {
            return 0;
        }
        head.data = 0;
        return 1;

    }

    public Node reverseLinkedList(Node head) {
        if (head == null || head.next == null) return head;

        Node temp = head.next;
        Node newHead = reverseLinkedList(head.next);
        temp.next = head;
        head.next = null;
        return newHead;


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
        Node<Integer> newHead = addOneUsingRecursion(head);
        printLL(newHead);
    }
}
