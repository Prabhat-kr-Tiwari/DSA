package Graph.GraphLeetCodeProblems.PrimsAlgorithm;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Pair{
    int v;
    int wt;
    public Pair(int v,int wt) {
        this.v=v;
        this.wt=wt;


    }
}
class Graph{
    ArrayList<ArrayList<Pair>> adj ;
    int v;

    int INF= 100000;
    public Graph(int v) {

        this.v = v;
        adj=new ArrayList<ArrayList<Pair>>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Pair>());

        }
    }
    public void addEdge(int src,int dest,int wt){
        adj.get(src).add(new Pair(dest,wt));
    }
    public void addUnDirectedEdge(int src,int dest,int wt){
        adj.get(src).add(new Pair(dest,wt));
        adj.get(dest).add(new Pair(src,wt));

    }


    int prims(){ 
        int dis[]=new int[v];
        boolean vis[]=new boolean[v];
        PriorityQueue<Pair>pq=new PriorityQueue<>((p1,p2)-> p1.wt- p2.wt);

        Arrays.fill(dis,INF) ;
        dis[0]=0;
        pq.add(new Pair(0,0));

        int ans=0;
        while (!pq.isEmpty()){
            Pair curr=pq.poll();
            // agr ye node already visited hai toh iska sare neighbor maine pahle hi daal diye hoge
            if (vis[curr.v]){
                continue;
            }
            vis[curr.v]=true;
            ans+=dis[curr.v];

            for ( Pair neighbor:adj.get(curr.v)
                 ) {
                if (!vis[neighbor.v]){
                    if (dis[neighbor.v]> neighbor.wt){
                        dis[neighbor.v]= neighbor.wt;
                        pq.add(new Pair(neighbor.v, neighbor.wt));
                    }

                }

            }

        }
        for (int e:dis
        ) {
            System.out.print(e+" ");

        }
        return ans;
    }
    int [] dijs(int src){
        int dis[]=new int[v];
        int par[]=new int[v];
        boolean vis[]=new boolean[v];
        PriorityQueue<Pair>pq=new PriorityQueue<>((p1,p2)-> p1.wt- p2.wt);

        Arrays.fill(dis,INF) ;
        dis[src]=0;
        par[src]=-1;
        pq.add(new Pair(src,0));

        while (!pq.isEmpty()){
            Pair curr=pq.poll();
            // agr ye node already visited hai toh iska sare neighbor maine pahle hi daal diye hoge
            if (vis[curr.v]){
                continue;
            }
            vis[curr.v]=true;


            for ( Pair neighbor:adj.get(curr.v)
            ) {
                if (!vis[neighbor.v]){
                    if (dis[neighbor.v]>dis[curr.v]+ neighbor.wt){
                        //here we are adding the sum of path
                        dis[neighbor.v]=dis[curr.v]+ neighbor.wt;
                        //
                        par[neighbor.v]= curr.v;
                        pq.add(new Pair(neighbor.v,  dis[neighbor.v]));
                    }

                }

            }

        }
        for (int e:dis
        ) {
            System.out.print(e+" ");

        }
        return dis;

    }


}


public class MainClass {
    public static void main(String[] args) {
        int v=5;
        Graph graph=new Graph(v);
        graph.addUnDirectedEdge(0,1,7);
        graph.addUnDirectedEdge(0,3,3);
        graph.addUnDirectedEdge(0,2,8);
        graph.addUnDirectedEdge(2,1,2);
        graph.addUnDirectedEdge(2,3,1);
        graph.addUnDirectedEdge(3,1,1);
        graph.addUnDirectedEdge(1,4,2);
        graph.addUnDirectedEdge(3,4,5);
        /*int mstdistance= graph.prims();
        System.out.println(mstdistance);*/
        graph.dijs(0);

    }
}
