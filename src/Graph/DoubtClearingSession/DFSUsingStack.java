package Graph.DoubtClearingSession;


import java.util.ArrayList;
import java.util.Stack;

public class DFSUsingStack {
    int v;
    static ArrayList<ArrayList<Integer>>a=new ArrayList<ArrayList<Integer>>();
    public DFSUsingStack(int v){
        this.v=v;
        for (int i = 0; i < v; i++) {
            a.add(new ArrayList<>());


        }
    }
    public void addEdge(int src,int dest){
        a.get(src).add(dest);
        a.get(dest).add(src);

    }
    public static void dfsUsingStack(int src, boolean visited[]){
        Stack<Integer> stack=new Stack<>();
        stack.push(src);
        while (stack.empty()==false){
            src=stack.peek();
            stack.pop();
            if (!visited[src]){
                System.out.println(src+" ");
                visited[src]=true;
            }
            for (Integer neighbor:a.get(src)){
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
        dfsUsingStack(0,visited);
    }
}
