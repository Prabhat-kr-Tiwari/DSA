package linkedlistproblem1;

public class isPalindrome
{
    static Node middle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static Node reverse(Node head){
        Node cur = head;
        Node prev = null;
        while(cur != null){
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
    //Function to check whether the list is palindrome.
    static boolean isPalindrome(Node head)
    {
        //Your code here
        if(head == null) return true;

        Node mid = middle(head);
        Node last = reverse(mid);
        Node cur = head;
        while(last != null){
            if(last.data != cur.data) return false;
            last = last.next;
            cur = cur.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer>  n2 = new Node<>(20);
        Node<Integer>  n3 = new Node<>(10);
       /* Node<Integer>  n4 = new Node<>(30);
        Node<Integer>  n5 = new Node<>(20);
        Node<Integer>  n6 = new Node<>(10);*/

        Node<Integer> head = n1;
        n1.next = n2;
        n2.next = n3;
     /*   n3.next = n4;
        n4.next = n5;
        n5.next = n6;*/
        System.out.println(isPalindrome(head));

    }
}
