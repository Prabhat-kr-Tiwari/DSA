package Disjointsets;

public class MainClass {
    public static void main(String[] args) {
        int n=8;
        DisjointSet disjointSet=new DisjointSet(n);
        disjointSet.union(0,2);
        disjointSet.union(3,5);
        System.out.println(disjointSet.isConnected(0,3));
        disjointSet.union(0,5);
        System.out.println(disjointSet.isConnected(0,3));
    }

}
