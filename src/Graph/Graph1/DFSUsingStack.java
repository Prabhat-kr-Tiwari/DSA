package Graph.Graph1;

import java.util.ArrayList;
import java.util.Stack;

public class DFSUsingStack {

    int v;
    static ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();

    public DFSUsingStack(int v) {
        this.v = v;
        for (int i = 0; i < v; i++) {
            a.add(new ArrayList<Integer>());

        }
    }
    public void addEdge(int src,int dest)
    {
        a.get(src).add(dest);
        a.get(dest).add(src);
    }
    public static void dfs(int src, boolean visited[])
    {
        //1/create stack
        Stack<Integer> stack=new Stack<>();
        //2.push the cureent src
        stack.push(src);
        //3.
        while (stack.empty()==false)
        {
            //4.peek
            src=stack.peek();
            stack.pop();

            // Stack may contain same vertex twice. So
            // we need to print the popped item only
            // if it is not visited.
            if (visited[src]==false)
            {
                System.out.println(src+" ");
                visited[src]=true;
            }

            for ( Integer neighbor:a.get(src)) {

                if (!visited[neighbor]){
                    stack.push(neighbor);
                }
            }
        }



    }

    public static void main(String[] args) {
        int v=5;
        DFSUsingStack dfsUsingStack=new DFSUsingStack(v);


        dfsUsingStack.addEdge(0,1);
        dfsUsingStack.addEdge(4,3);
        dfsUsingStack.addEdge(0,4);
        dfsUsingStack.addEdge(4,2);

        boolean[] visited =new boolean[v];
        dfs(0,visited);
    }

}
