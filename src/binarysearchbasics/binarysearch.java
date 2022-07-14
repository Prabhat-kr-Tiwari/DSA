package binarysearchbasics;

public class binarysearch {
    static int bs(int a[],int key)
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
            if (key>a[mid])
            {
                l=mid+1;
            }
            else {
                r=mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4};
        System.out.println(bs(a,3));

    }
}
