package Graph.GraphAlgorithms1.Practice;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class bfs{
    int v;
    ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
    public bfs(int v){
        this.v=v;
        for (int i = 0; i <v ; i++) {
            a.add(new ArrayList<>());

        }
    }
    public void addEdge(int src,int dest)
    {
        a.get(src).add(dest);
        a.get(dest).add(src);
    }
    public void bfsUsingQueue(int src,boolean visited[])
    {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(src);
        visited[src]=true;
        while (!queue.isEmpty())
        {
            int curr=queue.poll();
            for (Integer neighbor:a.get(curr))
            {
                if (!visited[neighbor])
                {
                    visited[neighbor]=true;
                    queue.add(neighbor);
                }

            }


        }
    }


}

public class ShortestPathInGraph {
}
