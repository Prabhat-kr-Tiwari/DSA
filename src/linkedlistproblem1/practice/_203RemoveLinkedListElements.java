package linkedlistproblem1.practice;

public class _203RemoveLinkedListElements {
    static void printLL(Node<Integer> head){
       Node<Integer> cur = head;
        while (cur != null){
            System.out.print(cur.data+ "->");
            cur = cur.next;
        }
        System.out.println(" end ");
    }
    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data=data;
        }

    }

    static Node<Integer> removeElements(Node<Integer> head, int val) {
        if (head==null) return null;
        if (head.data==val)
        {
            head=head.next;
            return head;

        }
        Node<Integer> curr=head;
        /*while(curr.next!=null)
        {
            if (curr.data==val)
            {
                curr.next=curr.next.next;
            }
            curr=curr.next;

        }*/
        if (curr.data==val)
        {
            curr.next=curr.next.next;
        }
        curr=curr.next;
        //curr.next=curr.next.next;
        return head;
    }

    public static void main(String[] args) {
            Node<Integer> n1 = new Node<>(1);
        Node<Integer> n2 = new Node<>(2);
      Node<Integer> n3 = new Node<>(6);
       Node<Integer>  n4 = new Node<>(3);
        Node<Integer>  n5 = new Node<>(4);
        Node<Integer>  n6 = new Node<>(5);
        Node<Integer>  n7= new Node<>(6);

       Node<Integer> head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next=n7;
        head=removeElements(head,6);
        printLL(head);


    }
}

