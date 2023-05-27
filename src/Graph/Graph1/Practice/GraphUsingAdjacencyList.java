package Graph.Graph1.Practice;
import java.util.ArrayList;
public class GraphUsingAdjacencyList {
    ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
    int v;
    public GraphUsingAdjacencyList(int v) {
        this.v = v;
        for (int i = 0; i < v; i++) {
            a.add(new ArrayList<>());
        }
    }
    public void addEdge(int src, int dest) {

        a.get(src).add(dest);
        a.get(dest).add(src);
    }
    public void printGraph() {
        System.out.println("Graph:");
        for (int i = 0; i < v; i++) {
            System.out.print(i + ": ");
            for (int j : a.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        GraphUsingAdjacencyList graphUsingAdjacencyList = new GraphUsingAdjacencyList(4);
        graphUsingAdjacencyList.addEdge(0, 1);
        graphUsingAdjacencyList.addEdge(2, 3);
        graphUsingAdjacencyList.addEdge(0, 3);
        graphUsingAdjacencyList.addEdge(2, 1);
        graphUsingAdjacencyList.printGraph();


    }
}
