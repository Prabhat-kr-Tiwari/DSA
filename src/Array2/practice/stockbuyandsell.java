package Array2.practice;

public class stockbuyandsell {
    static int maxProfit(int[] prices) {
        int n=prices.length;
        int minsofar=prices[0];
        int maxprofit=0;
        for(int i=0;i<n;i++)
        {
            minsofar=Math.min(minsofar,prices[i]);
            int profit=prices[i]-minsofar;
            maxprofit=Math.max(maxprofit,profit);
        }
        return maxprofit;

    }


    public static void main(String[] args) {
       int a[]={3,1,4,8,7,2,5};
        System.out.println(maxProfit(a));

    }
}
