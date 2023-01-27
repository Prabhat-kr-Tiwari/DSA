package Disjointsets;

public class DisjointSet {

    int parent[];
    int rank[];

    //make element from 0 to n-1;
    public DisjointSet(int n){
        //size initialization of the parent array
        parent=new int[n];
        rank=new int[n];
        for (int i = 0; i < n; i++) {
            parent[i]=i;

        }
    }
   /* public void DisjointSet(int n){
        parent=new int[n];
        for (int i = 0; i <n ; i++) {
            parent[i]=i;

        }
    }*/
    //find the captain of group
    int find(int x){
        /*if (x!=parent[x])
        {
            return find(parent[x]);
        }*/
        //path compression
        if (x!=parent[x])
        {
            parent[x]= find(parent[x]);
        }
        //agr equal hai toh
        //return x;
        return parent[x];
    }
    /*int find(int x){
        if(x!=parent[x]){
            return find(parent[x]);
        }
        return x;
    }*/
    //union into one group if they are not in group
    void union(int a ,int b){
        int captainA=find(a);
        int captainB=find(b);
        if (captainA==captainB) return;

        if (rank[captainA]<rank[captainB])
        {
            parent[captainA]=captainB;
        }
        else if (rank[captainB]<rank[captainA])
        {
            parent[captainB]=captainA;
        }else {
            parent[captainB]=captainA;
            rank[captainA]++;
        }
       // parent[captainB]=captainA;
    }
    //are in a team
    boolean isConnected(int a ,int b){
        int captainA=find(a);
        int captainB=find(b);
        return (captainA==captainB) ;
    }
}
