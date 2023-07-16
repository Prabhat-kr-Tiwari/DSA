package Graph.GraphLeetCodeProblems.ShortestPathInDirectedAcyclicGraph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

class Pair {
    int v;
    int wt;

    public Pair(int v, int wt) {
        this.v = v;
        this.wt = wt;
    }
}

class Graph {

    ArrayList<ArrayList<Pair>> adj ;
    int v;

    int INF= 100000;
    public Graph(int v) {

        this.v = v;
        adj=new ArrayList<ArrayList<Pair>>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Pair>());

        }
    }
    public void addEdge(int src,int dest,int wt){
        adj.get(src).add(new Pair(dest,wt));
    }
    public void dfs(int src, boolean[] visited,ArrayDeque<Integer> stack)
    {
        visited[src]=true;
        //System.out.println(src+" ");
        for (Pair neighbor:adj .get(src)
        ) {
            if (!visited[neighbor.v])
            {

                dfs(neighbor.v,visited,stack);
            }

        }
        //jab apne is src  ke sare ke sare neighbor ke travel kar liya ab koi further neighbor nhi bacha dfs call karne ke liye toh isko stack me daal doo
        stack.push(src);
    }
    int [] shortestPathInDag(int src){
        int dis[]=new int[v];
        Arrays.fill(dis,INF);
        dis[src]=0;
        ArrayDeque<Integer> topologicalStack=topologicalSortUsingDFS();
        while (!topologicalStack.isEmpty()){
            int curr=topologicalStack.pop();
            for (Pair neighbor:adj .get(curr)
            ) {

                if ( dis[neighbor.v]>dis[curr]+ neighbor.wt){


                    dis[neighbor.v]=dis[curr]+ neighbor.wt;
                }

            }

        }
        return dis;

    }
    ArrayDeque<Integer>    topologicalSortUsingDFS(){
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        boolean visited[]=new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i])
            {
                dfs(i,visited ,stack) ;
            }

        }
        return stack;


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
        int shortestDis[]= graph.shortestPathInDag(src);
        for (int e:shortestDis
             ) {

            System.out.println(e);

        }



    }
}
