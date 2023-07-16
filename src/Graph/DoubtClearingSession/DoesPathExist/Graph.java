package Graph.DoubtClearingSession.DoesPathExist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    ArrayList<ArrayList<Integer>>a=new ArrayList<>();

    static class Pair{
        int row,col;
        public Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }


    public boolean doesPathExist(int a[][]){
        int row=a.length;
        int col=a[0].length;
        Queue<Pair>queue=new LinkedList<>();
        boolean visited[][]=new boolean[row][col];
        for (int i = 0; i < row; i++) {

            for (int j = 0; j <col ; j++) {
                if (a[i][j]==1){
                    Pair src=new Pair(i,j);
                    queue.add(src);

                    break;
                }
            }

        }

        while (!queue.isEmpty()){
            Pair curr=queue.poll();
            int x=curr.row;
            int y=curr.col;
            //to check they are in bound
            if (x<0||x>=row||y<0||y>=col) continue;

            // agr visited hai aur wall toh bahar niklo andar jane ki jarurat nhi hai
            if (visited[x][y]||a[x][y]==0) continue;
            //check for destination found
            if(a[x][y]==2){
                return true;
            }
            //to mark this visited
            visited[x][y]=true;
            //kya ye jagah wall nhi hai
            //kya ye out of boundary toh nhi hai
            //check ye visited toh nhi hai na
            /*if (x-1>=0 && a[x-1][y]!=0&&!visited[x-1][y]){

                queue.add(new Pair(x-1,y));
                visited[x-1][y]=true;
            }*/
            queue.add(new Pair(x-1,y));
            //right
            queue.add(new Pair(x,y+1));
            queue.add(new Pair(x+1,y));
            queue.add(new Pair(x,y-1));

        }
        return false;


    }
    public static void main(String[] args) {


    }
}
