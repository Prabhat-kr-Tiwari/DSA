package DynamicProgramming.AdityaVerma.matrixaChain;

public class MatrixChain {



    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        return solve(arr,1,arr.length-1);
    }
    
    static int solve(int a[],int i,int j){
        if (i>=j) return 0;
        int min=Integer.MAX_VALUE;
        for (int k=i;k<=j-1;k++){
            int tempans=solve(a,i,k)+solve(a,k+1,j)+a[i-1]*a[k]*a[j];
            if (tempans<min){
                min=tempans;
            }
        }
        return min;
    }
    public static void main(String[] args) {

        int a[]={40,20,30,10,30};
        System.out.println(matrixMultiplication(a.length,a));
    }
}
