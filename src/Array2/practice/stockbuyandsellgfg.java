package Array2.practice;

import java.util.Arrays;
import java.util.List;

public class stockbuyandsellgfg {
    static int Stockbuyandselltwo(int a[])
    {
        int profit=0;
        for (int i = 1; i < a.length; i++) {
            if(a[i]>a[i-1])
            {
                profit+=(a[i]-a[i-1]);

            }

        }
        return profit;

    }


    static void stockBuySellgfg(int prices[])
    {
        List al= Arrays.asList(prices);
        int profit=0;
        int minsofar=prices[0];
        int maxprofit=0;
        int i = 1;
       for (; i < al.size()-1; i++) {
           int element= (int) al.get(i);
           int element2= (int) al.get(i);

            if(element>element2)
            {
                //continue;
               // System.out.println("buy"+i);
                minsofar=Math.min(minsofar,element);
                //buy
                //System.out.println(indexOf(minsofar));
                 profit=prices[i]-minsofar;
                //System.out.println(indexOf(profit));
                maxprofit=Math.max(maxprofit,profit);

            }


        }
        System.out.println("sell"+i);
        //System.out.println(a[i]+"  "+a[i-1]);
        //return profit;
       /* while (a[i]>a[i+1])
        {
            continue;
        }
        System.out.println(i);*/


    }

    public static void main(String[] args) {
       int price[] = { 100, 180, 260, 310, 40, 535, 695 };
       //(0 3) (4 6)
       //int n=A.length;
       // System.out.println(stockBuySellgfg(price));
        stockBuySellgfg(price);
    }
}
