package BinarySearchPracticePhase2.Medium;

public class findSquareRoot {


    static int squareRoot(int n){

        int i=1;
        for(;i*i<=n;i++){
            if(i*i==n){
                return i;
            }
        }
        return i-1;
    }
    static int square(int n){

        int result=n/2;
        int l=1;
        int r=n;
        while (l<=r){
            int mid=l+(r-l)/2;
            if (mid*mid==n){
                return mid;
            } else if (mid*mid>n) {
                r=mid-1;

            }else {
                l=mid+1;
            }
        }
        return -1;

    }
    static int floorsquare(int n){

        int result=n/2;
        int l=1;
        int r=n;
        int ans=0;
        while (l<=r){
            int mid=l+(r-l)/2;
            int midsq=mid*mid;
            if (midsq==n){
                return mid;
            } else if (midsq>n) {
                r=mid-1;

            }else {
                ans=mid;
                l=mid+1;
            }
        }
        return ans;

    }
    static long floorSqrt(long n)
    {
        // Your code here

        long l=1;
        long r=n;
        long ans=0;
        while(l<r){
            int mid= (int) ((l+r)/2);
            int midsq=mid*mid;
            if(midsq==n){
                return mid;
            }else if(midsq>n){
                r=mid-1;
            }else{
                ans=mid;
                l=mid+1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int n=44;
        System.out.println(floorSqrt(n));


    }
}
