package binarysearchproblem1;

public class findsquarerootofintger {

    static int squareroot(int n)
    {
        int ans=1;
        if (n==0)return 0;
        int l=1;
        int r=n;
        while (l<=r)
        {
            int mid=(l+r)/2;
            int midsq=mid*mid;

            if (midsq==n)return mid;
            if (midsq>mid) r=mid-1;
            else ans=mid;
            l=mid+1;

        }
        return ans;

    }
  /*  public int mySqrt(int x) {
        if(x==0) return 0;

        int ans=1;
        int l=1;
        int r=x;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            int midsq=mid*mid;
            if(midsq==x) return mid;
            if(midsq>x) r=mid-1;
            else{
                ans=mid;
                l=mid+1;
            }

        }
        return ans;
    }*/

    public static void main(String[] args) {
        System.out.println(squareroot(4));

    }
}
