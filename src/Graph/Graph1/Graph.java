package Graph.Graph1;

public class Graph {
    //adjacency matrix
    int a[][];
    //vertices
    int v;
    public Graph(int v) {
        this.v = v;
        a = new int[v][v];
    }

    //add edge
    public void addEdge(int src, int dest) {

        //undirected graph
        a[src][dest] = 1;
        //agr bar bar edge dege toh ye wala part hata sakte hai
        a[dest][src] = 1;

    }

    public static void main(String[] args) {
        int v = 4;
        Graph graph = new Graph(v);
        graph.addEdge(0, 1);
        graph.addEdge(2, 3);
        graph.addEdge(0, 3);
        graph.addEdge(2, 1);

    }
}
