package DynamicProgramming.AdityaVerma.matrixaChain;
public class MatrixChainMemoization {
    static int matrixChain(int a[],int i,int j){
        int n=a.length;
        int t[][]=new int[n][n];
        for (int k = 0; k < n; k++) {
            for (int l = 0; l <n ; l++) {
                t[k][l]=-1;
            }
        }
        return matrixChainDp(a,i,j,t);
    }
    static int matrixChainDp(int a[],int i,int j,int t[][]){
        if (i>=j) return 0;
        if (t[i][j]!=-1) return t[i][j];
        int min=Integer.MAX_VALUE;
        for (int k = i; k<=j-1 ; k++) {
            int tempans=matrixChainDp(a,i,k,t)+matrixChainDp(a,k+1,j,t)+a[i-1]*a[k]*a[j];
            if (tempans<min){
                min=tempans;
            }
        }
        return t[i][j]=min;
    }
    public static void main(String[] args) {

//        int a[]={40,20,30,10,30};
       int a[]={ 3,1,5,8};
        System.out.println(matrixChain(a,1,a.length-1));
    }
}
