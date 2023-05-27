package Graph.Graph1;

import java.util.ArrayList;

public class GraphUsingAdjacencyList {

    static ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
    int v;

    public GraphUsingAdjacencyList(int v){
        this.v=v;
        for (int i = 0; i < v; i++) {
            a.add(new ArrayList<Integer>());

        }
    }
    //add edge
    public static void addEdge(int src, int dest){

        a.get(src).add(dest);
        a.get(dest).add(src);

    }
    static void dfs(int src,boolean visited[]){
        //current node pe visit kiya aur usko true mark akr diya
        visited[src]=true;
        System.out.println(src+" ");
        //uska kon kon sa neighbor hai agr koi bhi neighbor visited nhi hai toh usko mark kar doo true
        for ( Integer neighbor:a.get(src)) {

            if (!visited[neighbor]){
                dfs(neighbor,visited);
            }
        }
    }
    public static void main(String[] args) {
        int v=4;
        GraphUsingAdjacencyList graph=new GraphUsingAdjacencyList(v);
        graph.addEdge(0,1);
        graph.addEdge(2,3);
        graph.addEdge(0,3);
        graph.addEdge(2,1);

        boolean visited[]=new boolean[v];


        dfs(0,visited);

    }
}
