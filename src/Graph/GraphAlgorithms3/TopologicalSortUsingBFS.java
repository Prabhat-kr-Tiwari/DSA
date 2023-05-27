package Graph.GraphAlgorithms3;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class Graph1 {
    int v;
    int[] inDegree;
    ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();

    public Graph1(int v) {
        this.v = v;
        for (int i = 0; i < v; i++) {
            a.add(new ArrayList<>());

        }
        inDegree = new int[v];
    }

    public void addEdge(int src, int dest) {
        a.get(src).add(dest);
        //for directed graph no need to add this
        //a.get(dest).add(src);
    }

    public void bfs(int src, boolean visited[]) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        visited[src] = true;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            System.out.println(curr + " ");
            for (Integer neighbor : a.get(curr)
            ) {

                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }

    void indegree() {
        for (ArrayList<Integer> adjacent : a
        ) {
            for (Integer neighbor : adjacent
            ) {
                inDegree[neighbor]++;
            }
        }
    }

    public void topologicalSortUsingBFS() {
        indegree();
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < v; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.print(curr + " ");
            for (Integer neighbor : a.get(curr)
            ) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    q.add(neighbor);
                }

            }
        }

    }
    //Detect a cycle in a directed graph using the kahn's algorithm
    public void topologicalSortUsingBFS1() {
        int count=0;
        indegree();
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < v; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
                count++;
            }
        }
        ArrayList<Integer >ans=new ArrayList<>();
        while (!q.isEmpty()) {
            int curr = q.poll();
            //System.out.print(curr + " ");
            ans.add(curr);
            for (Integer neighbor : a.get(curr)
            ) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    q.add(neighbor);
                    count++;
                }

            }
        }
        if (count<v)
        {
            System.out.println("Cycle is present, no topological sort possible");
        }else {
            for ( Integer a:ans
                 ) {
                System.out.println(a+" ");

            }

        }

    }


}

public class TopologicalSortUsingBFS {
    public static void main(String[] args) {
        int v = 6;
        Graph1 graph = new Graph1(v);

//        graph.addEdge(0, 1);
//        graph.addEdge(1, 3);
//        graph.addEdge(1, 2);
//
//        graph.addEdge(3, 4);
//        graph.addEdge(0, 2);
//        graph.addEdge(3, 5);
//
//        graph.addEdge(4, 5);
//        graph.topologicalSortUsingBFS();
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,1);

        graph.topologicalSortUsingBFS1();


    }

}
