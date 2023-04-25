package LeetCodeFaraz.Array.Easy;

public class PascalTriangle {

    //1:Given row and column tell the element at that place
    //R=5 C=3 ans=6

    static int funNcR(int N,int R){
        long  res=1;
        N=N-1;
        R=R-1;
        for (int i = 0; i < R; i++) {
            res=res*(N-i);
            res=res/(i+1);

        }
        return (int)res;
    }
    //2.Print the nth Row
    static void printNthRow(int N){
        for (int c = 1; c <=N ; c++) {
            System.out.println(funNcR(N,c));

        }
    }

    public static void main(String[] args) {
        //System.out.println(funNcR(6,6));
        printNthRow(5);
    }
}
