package DynamicProgramming.AdityaVerma;

public class Countthenumberofsubsetwithagivendifference {



    static int countOfSubset(int a[],int diff){
        int n=a.length;
        int sumOfArray=0;
        for (int e:a
             ) {
            sumOfArray+=e;
        }
        //the subset sum should be even
        if((diff+sumOfArray)%2 != 0) return 0;
        int sumS1=(diff+sumOfArray)/2;
        return subset(a,n,sumS1);
    }



    //subset with given sum
    static int subset(int a[],int n,int sum){
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
        return subset(a,n,sum,t);
    }
    static int subset(int a[],int n,int sum ,int t[][]){


        // t[0][0]=1;



        for (int i = 1; i <=n ; i++) {

            for (int j = 0; j <=sum ; j++) {
                if (a[i-1]<=j){
                    t[i][j]=(t[i-1][j-a[i-1]]+t[i-1][j])%1000000007;;
                }else{
                    t[i][j]=t[i-1][j];
                }
            }

        }
        return t[n][sum];

    }

    public static void main(String[] args) {
        int a[]={1,1,2,3};
        int diff=1;
        System.out.println(countOfSubset(a,diff));
    }
}
