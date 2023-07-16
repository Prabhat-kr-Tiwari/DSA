package Graph.DoubtClearingSession.BipartiteGraph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Graph {

    static int v;
    static ArrayList<ArrayList<Integer>>a=new ArrayList<>();
    public Graph(int v){
        this.v=v;
        for (int i = 0; i <v ; i++) {
            a.add(new ArrayList<>());


        }
    }
    public void addEdge(int src,int dest){
        a.get(src).add(dest);
        a.get(dest).add(src);
    }
    //bfs is used
    public static boolean isBipartite(int src, boolean visited[]){
        Queue<Integer>queue=new ArrayDeque<>();
        int color[]=new int[v];
        queue.add(src);
        //maark src color
        color[src]=0;
        visited[src]=true;
        while (!queue.isEmpty()){
            int curr= queue.poll();
            System.out.println(curr+" ");
            for (int neighbor:a.get(curr)
                 ) {
                if (!visited[neighbor]){
                    queue.add(neighbor );
                   visited[neighbor]=true;
                   //agar 1 hoga toh 0 hojayega
                    //nhi toh -1
                   color[neighbor]=1-color[curr];
                }else {
                    if (color[neighbor]==color[curr])
                    {
                        return false;
                    }
                }

            }

        }
        return true;
    }

    public static void main(String[] args) {
        int v=6;
        Graph graph=new Graph(v);
        graph.addEdge(0,1);
        graph.addEdge(0,5);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(4,5);
       /* graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(3,4);
        graph.addEdge(4,2);*/

        boolean[]  visited =new boolean[v];
        System.out.println(isBipartite(0,visited));

    }

}
