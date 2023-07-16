package Graph.DoubtClearingSession.DetectCycleInDirectedGraph;


import java.util.ArrayList;

class Graph{
    int v;
    ArrayList<ArrayList<Integer>>a=new ArrayList<>();
    public  Graph(int v){
        this.v=v;
        for (int i = 0; i < v; i++) {
            a.add(new ArrayList<>());

        }
    }
    public void addEdge(int src,int dest){
        a.get(src).add(dest);
    }

    public boolean detectCycleInDirectedGraph(){
        boolean visited[]=new boolean[v];
        boolean recursionStack[]=new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]){
                if (dfsUtil(i,visited,recursionStack)){
                    return true;
                }
            }

        }
        return false;

    }
    public boolean dfsUtil(int u,boolean visited[],boolean recursionStack[] ){


        visited[u]=true;
        recursionStack[u]=true;
        for (int neighbor:a.get(u)
             ) {
            if (!visited[neighbor]){
                if (dfsUtil(neighbor,visited,recursionStack)){
                    return true;
                }
            }else if (recursionStack[neighbor]){

                return true;

            }

        }
        //backtrack
        recursionStack[u]=false;
        return false;
    }
}
public class MainClass {
    public static void main(String[] args) {
        int v=5;
        Graph graph=new Graph(v);
        graph.addEdge(0,4);
        graph.addEdge(1,0);
        graph.addEdge(1,3);
        graph.addEdge(3,2);
        graph.addEdge(2,1);
        System.out.println(graph.detectCycleInDirectedGraph());



    }

}
