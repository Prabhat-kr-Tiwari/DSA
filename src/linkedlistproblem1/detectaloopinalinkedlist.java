package linkedlistproblem1;

public class detectaloopinalinkedlist {

    static Node<Integer> iscyclepresent(Node <Integer> head)
    {
        Node<Integer> slow=head,fast=head;
        while (fast!=null&& fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast)
            {
                return slow;
            }
        }

        return null;
    }
    static  Node<Integer>findCycleStartingNode(Node<Integer> head)
    {
        Node<Integer> meet=iscyclepresent(head);
        if (meet== null) return null;
        Node<Integer> curr=head;
        while (curr!=meet)
        {
            curr=curr.next;
            meet=meet.next;
        }
        return curr;
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
        n6.next=n4;
        Node<Integer> meet=iscyclepresent(head);
        if (meet!=null)
        {
            System.out.println("cycle present");
            Node<Integer> firstnode=findCycleStartingNode(head);
            System.out.println(firstnode.data);
        }
        else
        {
            System.out.println("not");
        }


    }




}
