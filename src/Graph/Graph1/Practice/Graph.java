package Graph.Graph1.Practice;

public class Graph {
    int a[][];
    int v;

    public Graph(int v) {
        this.v = v;
        a = new int[v][v];

    }

    public void addEdge(int src, int dest) {
        a[src][dest] = 1;
        a[dest][src] = 1;
    }

    public void printGraph() {
        System.out.println("Graph:");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(2, 3);
        graph.addEdge(0, 3);
        graph.addEdge(2, 1);
        graph.printGraph();


    }

}
