package doubtofstack;

import java.util.ArrayDeque;

public class ImplementMinStackUsingOof1 {
    public static void main(String[] args) throws Exception {
        MinStack minStack=new MinStack();
        minStack.Push(5);
        minStack.Push(2);
        System.out.println("min"+minStack.min());
        System.out.println("pop"+minStack.pop());
        System.out.println("min"+minStack.min());
        minStack.Push(9);
        minStack.Push(1);
        minStack.Push(6);
        System.out.println("min"+minStack.min());
        System.out.println("pop"+minStack.pop());
        System.out.println("min"+minStack.min());
        System.out.println("pop"+minStack.pop());
        System.out.println("pop"+minStack.min());

    }


}
class MinStack{
    ArrayDeque<Integer> stack=new ArrayDeque<>();
    private int min=0;
    void Push(int t)
    {
        if (stack.isEmpty())
        {
            min=t;
            stack.push(t);
            return;
        }
        if(t>=min)
        {
            stack.push(t);
        }
        else {
            stack.push(2*t-min);
            min=t;
        }

    }
    int pop() throws Exception{
        if(stack.isEmpty()) throw new Exception("Stack is empty");
        int t=stack.pop();
        if (t>=min)
        {
            return t;
        }
        else
        {
            int ans=min;
            min=2*min-t;
            return ans;
        }

    }
    int min() throws Exception {
        if (stack.isEmpty()) throw new Exception("stack is empty");
        return min;

    }
    int peek()throws Exception{
        if (stack.isEmpty()) throw new Exception("stack is empty");
        int t= stack.peek();
        if (t>=min)
        {
            return t;
        }
        else {
            return min;
        }


    }
}
