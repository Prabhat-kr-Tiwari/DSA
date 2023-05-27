package Graph.GraphAlgorithms1;

import java.util.ArrayList;

public class dfs {

    int v;
    static ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
    public  dfs(int v){
        this.v=v;
        for (int i=0;i<v;i++)
        {
            a.add(new ArrayList<>());
        }
    }
    public void addEdge(int src,int dest)
    {
        a.get(src).add(dest);
        a.get(dest).add(src);
    }
    public static void depthFirstSearch(int src, boolean visited[])
    {
        visited[src]=true;
        System.out.println(src+" ");
        for ( Integer neighbor:a.get(src)
             ) {
            if (!visited[neighbor])
            {
                depthFirstSearch(neighbor,visited);
            }


        }
    }
    public  static boolean isCyclePresent(int src, boolean visited[],int parent)
    {
        visited[src]=true;

        for ( Integer neighbor:a.get(src)
        ) {
            if (!visited[neighbor])
            {
                if(isCyclePresent(neighbor,visited,src)){
                    return true;
                }
            }else{
                if (neighbor!=parent)
                {
                    return  true;
                }
            }


        }
        return false;
    }



    public static void main(String[] args) {
        int v=6;
        dfs graph=new dfs(v);
       /* graph.addEdge(0,1);
        graph.addEdge(2,1);
        graph.addEdge(0,3);

        graph.addEdge(4,5);
        graph.addEdge(5,6);
        graph.addEdge(4,6);*/

        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,2);

        graph.addEdge(2,3);
        graph.addEdge(3,5);
        graph.addEdge(5,4);

        boolean[] visited =new boolean[v];
        int count=0;
        for (int i = 0; i <v ; i++) {
            if (!visited[i])
            {
                count++;
                depthFirstSearch(i,visited);
            }

        }
        System.out.println("Number of connected component in graph");
        System.out.println(count);


        System.out.println("CHecking cycle is present or not");
        for (int i = 0; i <v ; i++) {
            System.out.println("Inside for loop");
            if (!visited[i])
            {
                System.out.println("Inside  if");

                if(isCyclePresent(i,visited,-1))
                {
                    System.out.println("Cycle found");
                    break;
                }
            }

        }

    }

}
