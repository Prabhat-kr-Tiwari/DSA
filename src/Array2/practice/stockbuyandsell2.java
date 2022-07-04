package Array2.practice;

public class stockbuyandsell2 {
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

    public static void main(String[] args) {
        int a[]={5,2,7,3,6,1,2,4};
        System.out.println(Stockbuyandselltwo(a));
    }
}
