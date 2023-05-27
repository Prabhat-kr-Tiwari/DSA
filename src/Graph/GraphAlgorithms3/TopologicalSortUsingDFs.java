package Graph.GraphAlgorithms3;


import java.util.ArrayDeque;
import java.util.ArrayList;

class Graph{
    int v;
    int inDegree[];
    ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
    public Graph(int v){
        this.v=v;
        for (int i=0;i<v;i++)
        {
            a.add(new ArrayList<Integer>());
        }
         inDegree=new int[v];
    }
    public void addEdge(int src,int dest)
    {
        a.get(src).add(dest);

    }
    void inDegree(){
        for (ArrayList<Integer> adjacent:a
             ) {
            for ( Integer neighbor:adjacent
                 ) {
                inDegree[neighbor]++;

            }

        }
    }
    public void dfs(int src, boolean[] visited,ArrayDeque<Integer> stack)
    {
        visited[src]=true;
        //System.out.println(src+" ");
        for (Integer neighbor:a.get(src)
             ) {
            if (!visited[neighbor])
            {

                dfs(neighbor,visited,stack);
            }

        }
        //jab apne is src  ke sare ke sare neighbor ke travel kar liya ab koi further neighbor nhi bacha dfs call karne ke liye toh isko stack me daal doo
        stack.push(src);
    }
    void  topologicalSortUsingDFS(){
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        boolean visited[]=new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i])
            {
                dfs(i,visited ,stack) ;
            }

        }
        while (!stack.isEmpty())
        {
            System.out.print(stack.pop()+" ");
        }

    }


}
public class TopologicalSortUsingDFs {
    public static void main(String[] args) {
        int v=6;
        Graph graph=new Graph(v);
        graph.addEdge(0,1);
        graph.addEdge(1,3);
        graph.addEdge(1,2);

        graph.addEdge(3,4);
        graph.addEdge(0,2);
        graph.addEdge(3,5);

        graph.addEdge(4,5);
        graph.inDegree();
        for (int e: graph.inDegree
        ) {
            System.out.println(e);

        }
        graph.topologicalSortUsingDFS();


    }


}
