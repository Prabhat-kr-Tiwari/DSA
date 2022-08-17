package linkedlistproblem1;

public class insertinlinkedlist {
    static void printLL(Node<Integer> head){
        Node cur = head;
        while (cur != null){
            System.out.print(cur.data+ "->");
            cur = cur.next;
        }
        System.out.println(" end ");
    }
    public static class Node<T>{
        //Integer data;  for the null support
        T data;//int doesn't support null
        Node next;
    public Node(T data) {
            this.data=data;
        }
    }
    static Node<Integer> insert(int data,int position,Node<Integer> head)
    {
        Node<Integer>newNode=new Node<>(data);
        if (position==0)
        {
            newNode.next=head;
            head=newNode;
            return head;
        }
        Node<Integer>curr=head;
        for (int i = 0; i < position-1; i++) {
            curr=curr.next;
        }
        newNode.next=curr.next;
        curr.next=newNode;
        return head;

    }
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
       Node<Integer> n4 = new Node<>(40);
        Node<Integer> n5 = new Node<>(50);
      Node<Integer> n6 = new Node<>(60);

        Node<Integer> head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        printLL(head);
        head=insert(4,0,head);
        printLL(head);
    }
}
