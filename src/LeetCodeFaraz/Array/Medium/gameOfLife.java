package LeetCodeFaraz.Array.Medium;

public class gameOfLife {

    static boolean isvalidNeighbour(int x,int y,int[][]board)
    {
        return (x>=0&&x<board.length&&y>=0&&y<board[0].length);
    }

    public static void gameOfLife(int[][] board) {

        int dx[]={0,0,1,1,1,-1,-1,-1};
        int dy[]={1,-1,1,-1,0,0,1,-1};
        for(int row=0;row<board.length;row++)
        {
            for(int col=0;col<board[0].length;col++)
            {
                int count_live_neighbors=0;
                for (int i = 0; i < 8; i++) {
                    int curr_x=row+dx[i],curr_y=col+dy[i];
                    if (isvalidNeighbour(curr_x,curr_y,board)&&Math.abs(board[curr_x][curr_y])==1)
                    {
                        count_live_neighbors++;
                    }

                }
                if (board[row][col]==1&&(count_live_neighbors<2||count_live_neighbors>3))
                {
                    board[row][col]=-1;
                }
                if (board[row][col]==0&&(count_live_neighbors==3))
                {
                    board[row][col]=2;
                }
            }
        }
        for(int row=0;row<board.length;row++)
        {
            for (int col=0;col< board[0].length;col++)
            {
                if (board[row][col]>=1)
                {
                    board[row][col]=1;
                }else{
                    board[row][col]=0;
                }
            }

        }

    }

    public static void main(String[] args) {
        int board[][] = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gameOfLife(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length ; j++) {
                System.out.println(board[i][j]);

            }
            System.out.println(" ");

        }

    }
}
