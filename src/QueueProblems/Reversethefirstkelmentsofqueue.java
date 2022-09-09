package QueueProblems;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Reversethefirstkelmentsofqueue {
    static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        if (q.isEmpty()||k>q.size()||k<0) return q;


        Stack<Integer> stack=new Stack<>();
        int n=q.size();
        for(int i=0;i<k;i++)
        {
            stack.push(q.poll());

        }
        while(!stack.isEmpty())
        {
            q.add(stack.pop());
        }
        for(int i=0;i<n-k;i++)
        {
            q.add(q.poll());
        }
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);  q.add(4);  q.add(5);  q.add(6);
        System.out.println(modifyQueue(q,3));




    }
}
