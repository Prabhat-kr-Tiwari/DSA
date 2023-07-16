package Graph.GraphLeetCodeProblems.Practice.ShortestPathInDirectedAcyclicGraph;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

//1.At first create a pair class
class Pair{
    int v;
    int wt;
    public  Pair(int v,int wt){
        this.v=v;
        this.wt=wt;

    }

}
//2. create a graph class
class Graph{
    int INF=10000;
    int v;
    ArrayList<ArrayList<Pair>> adj;



    public  Graph(int v){
        this.v=v;
        adj=new ArrayList<ArrayList<Pair>>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Pair>());

        }
    }

    public void addEdge(int src,int dest,int wt){
        adj.get(src).add(new Pair(dest,wt));
    }
    public void dfs(int src, boolean visited[], ArrayDeque<Integer> stack){
        visited[src]=true;
        for (Pair neighbor:adj.get(src)
             ) {
            if (!visited[neighbor.v]){
                dfs(neighbor.v, visited,stack);
            }

        }
        stack.push(src);

    }
    ArrayDeque<Integer> topologicalSortUsingDFS(){
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        boolean visited[]=new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]){
                dfs(i,visited ,stack) ;

            }

        }
        return stack;

    }
    int [] shortestPath(int src){
        int dis[]=new int[v];
        Arrays.fill(dis,INF);
        dis[src]=0;

        ArrayDeque<Integer> topologicalStack=topologicalSortUsingDFS();

        while (!topologicalStack.isEmpty()){
            int curr=topologicalStack.pop();
            for (Pair neighbor: adj.get(curr)
                 ) {
                if (dis[neighbor.v]>dis[curr]+ neighbor.wt){
                    dis[neighbor.v]=dis[curr]+ neighbor.wt;


                }

            }


        }
        return  dis;




    }
}


public class MainClass {
    public static void main(String[] args) {
        int v=5;
        int src=0;
        Graph graph=new Graph(v);
        graph.addEdge(0,1,2);
        graph.addEdge(0,4,7);
        graph.addEdge(0,2,1);
        graph.addEdge(2,3,2);
        graph.addEdge(3,4,2);
        graph.addEdge(1,4,4);
        int dis[]= graph.shortestPath(0);
        for (int e:dis
             ) {
            System.out.println(e);

        }

    }


}
