package Recursion.RecursionAndBackTracking3;

import java.util.ArrayList;

public class RatInAMaze {

    static boolean ratInaMaze(int a[][],boolean vis[][],int i,int j,ArrayList<String>al)
    {

        //base condition
        //app agar matrix ke bahr chale hgaye ho ya invalid cell pe ho ya already
        // visited cell pe ho toh return false
        if (i==a.length||j==a.length||a[i][j]==0||vis[i][j]){
            return false;
        }
        //base condition for successfully reached
        if (i==a.length-1&&j==a.length-1) return true;
        //mark this cell as a visited
        vis[i][j]=true;
        //check if a path possible from down
        if (ratInaMaze(a,vis,i+1,j,al)){
            al.add("D");
            //System.out.print("D");
            return true;
        }
        else {
            al.remove(String.valueOf('D'));
        }

        //check if a path possible from right
        if (ratInaMaze(a, vis, i, j+1,al)) {
            //System.out.print("R");
            al.add("R");

            return true;
        }else
        {
            al.remove(String.valueOf('R'));

        }
        //if there is no path possible or right and doen then mark as false
        vis[i][j] =false;
        //back track
        return false;
    }

    public static void main(String[] args) {
        int arr[][]={

                        {1, 0, 0, 0},
                        {1, 1, 0, 1},
                        {1, 1, 0, 0},
                        {0, 1, 1, 1}
        };
        ArrayList<String>al=new ArrayList<>();
        boolean vis[][]=new boolean[arr.length][arr.length];
        boolean ispathpossible=ratInaMaze(arr,vis,0,0,al);
        System.out.println(ispathpossible);
        System.out.println(al);
    }
}
