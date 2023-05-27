package Graph.GraphAlgorithms1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFSUsingQueue {

    int v;
    static ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();

    public BFSUsingQueue(int v) {
        this.v = v;
        for (int i = 0; i < v; i++) {
            a.add(new ArrayList<Integer>());

        }
    }

    public void addEdge(int src, int dest) {
        a.get(src).add(dest);
        a.get(dest).add(src);
    }

    public static void bfs(int src, boolean[] visited, int dis[]) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        //as the first element come mark it as true
        visited[src] = true;
        dis[src] = 0;

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            System.out.println(curr + " ");
            for (Integer neighbor : a.get(curr)
            ) {
                if (!visited[neighbor]) {
                    dis[neighbor] = dis[curr] + 1;
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }

            }
        }


    }

    public static void main(String[] args) {
        int v = 8;
        BFSUsingQueue graph = new BFSUsingQueue(v);


        graph.addEdge(0, 1);
        graph.addEdge(2, 1);
        graph.addEdge(0, 3);

        graph.addEdge(3, 6);
        graph.addEdge(5, 7);

        graph.addEdge(4, 5);
        graph.addEdge(5, 6);
        graph.addEdge(4, 6);
        boolean[] visited = new boolean[v];


        //bfs(0,visited);
        int dis[] = new int[v];
        Arrays.fill(dis, Integer.MAX_VALUE);
        bfs(0, visited, dis);
        for (int i = 0; i < v; i++) {
            System.out.println(i + " " + dis[i]);

        }
    }


}

