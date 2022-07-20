package binarysearchproblem1.doubtclearingSession;

public class findinsertpositioninasortedarrray {


    static int insertposition(int a[],int key)
    {
        int l=0;
        int r=a.length-1;
        while (l<=r)
        {
            int mid=(l+r)/2;
            if (a[mid]==key)
            {
                return mid;
            }
            if (a[mid]>key)
            {
                r=mid-1;
            }
            else {
                l=mid+1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int a[]={1,3,4,6,7,8,10};
        System.out.println(insertposition(a,5));
        int x=insertposition(a,11);
        System.out.println(a[x]);
    }

}
