package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

import java.util.HashMap;

public class maximumSumProblem {

    public static int maxSum(int n)
    {
        if (n==0){
            return 0;
        }

        int res=maxSum(n/2)+maxSum(n/3)+maxSum(n/4);
        return Math.max(res,n);


    }
    //memoization
    public static int  maxSumdp(int n){

        HashMap<Integer,Integer>hm=new HashMap<>();
        return maxSumMemoization(n,hm);

    }
    public static int maxSumMemoization(int n, HashMap<Integer,Integer> hm){
        if (n==0) return 0;
        if (hm.containsKey(n)){
            return hm.get(n);
        }
        int maxSum=maxSumMemoization(n/2,hm)
                +maxSumMemoization(n/3,hm)+maxSumMemoization(n/4,hm);
        int result=Math.max(n,maxSum);
        hm.put(n,result);
        return result;

    }

    public static void main(String[] args) {

        System.out.println(maxSum(12));
        System.out.println(maxSumdp(12));

    }
}
