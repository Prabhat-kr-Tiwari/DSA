package DynamicProgramming.AdityaVerma;

public class CountOfSubsetWithGivenSum {


    static int subsetSum(int a[],int n,int sum)
    {


        int t[][]=new int[n+1][sum+1];
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=sum ; j++) {
                if (i==0){
                    t[i][j]=0;
                }
                if (j==0){
                    t[i][j]=1;
                }

            }

        }
        return subsetSum(a,n,sum,t);
    }
    static int subsetSum(int a[],int n,int sum,int t[][]){
        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=sum ; j++) {
                if (a[i-1]<=j){
                    t[i][j]=t[i-1][j]+t[i-1][j-a[i-1]];
                }else {
                    t[i][j]=t[i-1][j];
                }
            }

        }
        return t[n][sum];
    }


    public static void main(String[] args) {
        int a[]={2,3,5,6,8,10};
        int sum=10;
        System.out.println(subsetSum(a,a.length,sum));;
    }
}
