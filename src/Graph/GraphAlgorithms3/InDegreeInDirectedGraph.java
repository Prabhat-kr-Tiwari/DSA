package Graph.GraphAlgorithms3;

import java.util.ArrayList;

 class GraphUsingAdjacencyList {

     ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
    int v;
    int inDegree[];

    //This is a directed graph
    public GraphUsingAdjacencyList(int v) {
        this.v = v;
        for (int i = 0; i < v; i++) {
            a.add(new ArrayList<Integer>());

        }
        inDegree=new int[v];
    }

    //add edge
    public  void addEdge(int src, int dest) {

        a.get(src).add(dest);


    }
    void indegree(){
        //arraylist ko travel karenge
        for (ArrayList<Integer>adjacent:a){
            //phir uske harek element ko travel karenge

            for (Integer neighbor:adjacent){
                inDegree[neighbor]++;
            }
        }
    }
}
public class InDegreeInDirectedGraph {
    public static void main(String[] args) {
        int v=4;
        GraphUsingAdjacencyList graph=new GraphUsingAdjacencyList(v);
        graph.addEdge(0,1);
        graph.addEdge(1,3);
        graph.addEdge(1,2);
        graph.addEdge(0,2);
        graph.addEdge(2,3);

        graph.indegree();
        for (int e: graph.inDegree
             ) {
            System.out.println(e);
            
        }
        
    }
}
