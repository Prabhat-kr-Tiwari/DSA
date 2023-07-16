package Graph.Graph1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSUsingQueue {

    int v;
    static ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
    public BFSUsingQueue(int v){
        this.v=v;
        for (int i = 0; i < v; i++) {
            a.add(new ArrayList<Integer>());

        }
    }
    public void addEdge(int src,int dest)
    {
        a.get(src).add(dest);
        a.get(dest).add(src);
    }
    public static void bfs(int src, boolean[] visited)
    {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(src);
        //as the first element come mark it as true
        visited[src]=true;
        int count=0;

        while (!queue.isEmpty())
        {
            int curr=queue.poll();
            System.out.println(curr+" ");
            count++;
            for ( Integer neighbor:a.get(curr )
                 ) {
                if (!visited[neighbor])
                {
                    queue.add(neighbor);
                    visited[neighbor]=true;
                }

            }
        }


    }

    public static void main(String[] args) {
        int v=4;
        BFSUsingQueue bfsUsingQueue=new BFSUsingQueue(v);

        bfsUsingQueue.addEdge(0,1);
        bfsUsingQueue.addEdge(2,3);
        bfsUsingQueue.addEdge(0,3);
        bfsUsingQueue.addEdge(2,1);
        boolean[]  visited =new boolean[v];


        bfs(0,visited);
    }


}
