package ArrayPractice;

public class Rowwithmax1s {

    static int rowWithMax1s(int a[][], int n, int m) {


        int countOfOne=0;
        int row=0;
        int max=0;

        for (int i = 0; i < n; i++) {
            countOfOne=0;
            for (int j = 0; j < m; j++) {
                if (a[i][j]==1){
                    countOfOne++;

                }

            }
            if(countOfOne>max){
                max=countOfOne;
                System.out.println("max          ->"+max);
                row=i;
            }

        }
        return max>0?row:-1;
        // code here
    }

    public static void main(String[] args) {

       int  Arr[][] = {{0, 1, 1, 1},
               {0, 0, 1, 1},
               {1, 1, 1, 1},
               {0, 0, 0, 0}};
       int a[][]={{0,0},
               {0,0}};

        System.out.println(rowWithMax1s(Arr,4,4));

    }
}
