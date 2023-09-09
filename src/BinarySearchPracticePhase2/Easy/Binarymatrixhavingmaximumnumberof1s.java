package BinarySearchPracticePhase2.Easy;

import java.util.Arrays;

public class Binarymatrixhavingmaximumnumberof1s {


    public static int[] findMaxRow(int[][] mat, int N) {

        int ans[]=new int[2];
        int countOfOne=0;
        int maxCount=0;
        int index=0;
        int previousindex=0;

        for (int i = 0; i < mat[0].length; i++) {
            countOfOne=0;
//            index=i;
            for (int j = 0; j < mat.length ; j++) {
                if (mat[i][j]==1) {
                    countOfOne++;
                }
                if (countOfOne>maxCount){
                    index=i;
                     previousindex=i;
                    maxCount=countOfOne;
                } else if (countOfOne==maxCount) {
                    index=previousindex;
                    maxCount=countOfOne;

                }

            }

        }
        if(maxCount==0){
            index=0;
        }
        int k=0;
        ans[k++]=maxCount;
        ans[k]=index;
        return ans;

        //System.out.println(Arrays.toString(ans));
    }

    public static void main(String[] args) {

        int[][] mat = {
                {1, 1, 1},
                {0, 0, 0},
                {1, 1, 1}
        };

        System.out.println(Arrays.toString(findMaxRow(mat, mat.length)));

    }

}
