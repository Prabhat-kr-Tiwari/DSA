package binarysearchproblem1.doubtclearingSession;

public class findupperboundofelement {


    //a[]={2,4,5,6,8,9,12}
    //key=6 o/p=8

    static int upperbound(int a[],int key)
    {
        int l=0;
        int r=a.length-1;
        int ans=-1;
        while (l<=r)
        {
            int mid=(l+r)/2;

            if (a[mid]<=key)
            {
                l=mid+1;
            }else {
                ans=mid;
                r=mid-1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int a[]={2,4,5,6,8,9,12};

        int x=upperbound(a,7);
        System.out.println("index "+x);
        System.out.println(a[x]);
    }

}
