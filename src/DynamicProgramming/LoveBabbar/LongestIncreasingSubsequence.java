package DynamicProgramming.LoveBabbar;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {



    static int solve(int a[],int n,int curr,int  prev){


        if (curr==n) return 0;
        //include
        int take=0;
        if (prev==-1||a[curr]>a[prev]){
            take=1+solve(a,n,curr+1,curr);
        }
        //exclude;
        int exclude=solve(a,n,curr+1,prev);
        return Math.max(take,exclude);

    }
    static int solveMemo(int a[],int n,int curr,int  prev,int dp[][]){


        if (curr==n) return 0;
        if (dp[curr][prev+1]!=-1)
            return dp[curr][prev+1];
        //include
        int take=0;
        if (prev==-1||a[curr]>a[prev]){
            take=1+solveMemo(a,n,curr+1,curr,dp);
        }
        //exclude;
        int exclude=solveMemo(a,n,curr+1,prev,dp);
        return dp[curr][prev+1]=Math.max(take,exclude);

    }
    static int lis(int arr[]) {

//        return solve(arr, arr.length, 0,-1);
        int dp[][]=new int[arr.length+1][arr.length+1];
        for (int i = 0; i <= arr.length; i++) {  // Use `<=` to cover `arr.length`
            for (int j = 0; j <= arr.length; j++) {  // Use `<=` to cover `arr.length`
                dp[i][j] = -1;
            }
        }
        return solveMemo(arr, arr.length, 0,-1,dp);
    }
    public static void main(String[] args) {

        int[] arr = {5, 8, 3, 7, 9, 1};
        System.out.println(lis(arr));
        List<Integer> lsi=new ArrayList<>();
        int range = 10;
        for(int i = 0; i < range; i++){
            lsi.add(i);
        }
        /*List<Integer> newlist=new ArrayList<>();
        int listsize=lsi.size();
        if (!lsi.isEmpty()){
            if (listsize==1){
                    newlist.add(lsi.get(0));
            } else if (listsize==2) {
                newlist.add(lsi.get(0));
                newlist.add(lsi.get(1));

            } else if (listsize==3) {
                newlist.add(lsi.get(0));
                newlist.add(lsi.get(1));
                newlist.add(lsi.get(2));

            }else {
                newlist.add(lsi.get(0));
                newlist.add(lsi.get(1));
                newlist.add(lsi.get(2));
            }

        }*/

        int printListSize = Math.min(lsi.size(), 3);

        for(int i = 0 ; i < printListSize; i++){
            System.out.println(lsi.get(i));
        }



        /*
        System.out.println(newlist);*/


    }
}
