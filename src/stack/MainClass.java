package stack;

public class MainClass {


    public static void main(String[] args) throws Exception {
        /*stackUsingArray stack=new stackUsingArray(3);*/
        stackUsingLinkedList stack=new stackUsingLinkedList();

        stack.push(2);
        stack.push(4);
        stack.push(6);


        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

       // System.out.println(stack.pop());
    }
}
