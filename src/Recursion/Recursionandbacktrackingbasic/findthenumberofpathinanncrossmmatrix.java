package Recursion.Recursionandbacktrackingbasic;

public class findthenumberofpathinanncrossmmatrix {


    static int countPathInNCrossMMatrix(int n,int m)
    {
        if (n==1||m==1)
            return 1;
        int rightSideAns=countPathInNCrossMMatrix(n,m-1);
        int downSideAns=countPathInNCrossMMatrix(n-1,m);

        return rightSideAns+downSideAns;

    }

    public static void main(String[] args) {
        System.out.println(countPathInNCrossMMatrix(2,4));

    }
}
