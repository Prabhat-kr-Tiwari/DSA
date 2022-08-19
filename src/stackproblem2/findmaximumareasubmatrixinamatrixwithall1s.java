package stackproblem2;

import static stackproblem2.findmaximumareainhistogram.maximumareainhistogramoptimiseed;

public class findmaximumareasubmatrixinamatrixwithall1s {

    static int maximumAreaSubMatrix(int a[][])
    {
        int b[]=new int[a[0].length];
        int max=0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <b.length ; j++) {
                if (a[i][j]==0)
                {
                    b[j]=0;
                }
                else {
                    b[j]++;
                }

            }
            int curr=maximumareainhistogramoptimiseed(b);
            max=Math.max(curr,max);

        }
        return max;
    }

    public static void main(String[] args) {
        int a[][]={{1,1,0,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,0}};

        int x=maximumAreaSubMatrix(a);
        System.out.println(x);

    }
}
