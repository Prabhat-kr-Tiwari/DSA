package DynamicProgramming.AdityaVerma;

import java.util.ArrayList;

public class MinimumSubsetSumDifference {


    static int subset(int a[],int n,int sum){


        boolean t[][]=new boolean[n+1][sum+1];
        for (int i = 0; i <= n ; i++) {

            for (int j = 0; j <=sum ; j++) {
                if (i==0){
                    t[i][j]=false;
                }
                if (j==0){
                    t[i][j]=true;
                }

            }

        }
        return subset(a,n,sum,t);
    }
    static int subset(int a[],int n,int sum, boolean t[][]){
        for (int i = 1; i <= n ; i++) {

            for (int j = 1; j <=sum ; j++) {
                if (a[i-1]<=j){
                    t[i][j]=t[i-1][j-a[i-1]]||t[i-1][j];
                }else{
                    t[i][j]=t[i-1][j];
                }

            }

        }
        ArrayList arrayList=new ArrayList();
        for (int j = 0; j <=sum/2 ; j++) {
            if (t[n][j]){

                arrayList.add(j);
            }
        }
        System.out.println(arrayList);
        int mn=Integer.MAX_VALUE;
        for (int i = 0; i < arrayList.size(); i++) {
            mn = Math.min(mn, (sum - 2*(Integer)( arrayList.get(i)))); // Casting to Integer
        }
        return mn;


//        return 1;

    }

    public static void main(String[] args) {
        int a[]={3,9,7,3};
        System.out.println(subset(a,a.length,22));

    }
}
