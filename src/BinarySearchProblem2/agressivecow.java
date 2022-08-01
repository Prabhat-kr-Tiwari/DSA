package BinarySearchProblem2;
public class agressivecow {
    private static boolean canAccomodate(int[] a, int k, int distance) {

        int prev=a[0];
        int cows=1;
        for (int i = 0; i < a.length; i++) {

            if (a[i]-prev>=distance)
            {
                cows++;
                prev=a[i];
            }
        }
        return cows>=k;
    }
    static int agressiveCow(int a[],int k)
    {
        int l=1;
        int r=a[a.length-1];
        int ans=-1;

        if (a.length<k) return -1;
        while (l<=r)
        {
            int mid=(l+r)/2;
            if (canAccomodate(a,k,mid))
            {
                ans=mid;
                l=mid+1;

            }
            else {
                r=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[]={1,2,4,8,9};
        int k=3;
        System.out.println(agressiveCow(a,k));
    }
}
