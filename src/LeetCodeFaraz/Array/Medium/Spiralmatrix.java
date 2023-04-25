package LeetCodeFaraz.Array.Medium;


import java.util.ArrayList;
import java.util.List;

class Spiralmatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0;int right=m-1;
        int top=0;int bottom=m-1;
        List<Integer>list=new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }

        while(top<=bottom && left<=right&&list.size()<m*n)
        {


            //right
            for(int i=left;i<=right&&list.size()<m*n;i++)
            {
                list.add(matrix[top][i]);
            }
            top++;
            //bottom
            for(int i=top;i<=bottom&&list.size()<m*n;i++)
            {
                list.add(matrix[i][right]);
            }
            right--;

            //left
            if(top<=bottom)
            {
                for(int i=right;i>=left&&list.size()<m*n;i--)
                {
                    list.add(matrix[bottom][i]);

                }


                bottom--;

            }

            //top
            if(left<=right){
                for(int i=bottom;i>=top&&list.size()<m*n;i--)
                {
                    list.add(matrix[i][left]);
                }
                left++;
            }

        }
        return list;



    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
}
