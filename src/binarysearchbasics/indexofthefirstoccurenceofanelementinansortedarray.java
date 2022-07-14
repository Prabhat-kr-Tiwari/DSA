package binarysearchbasics;

public class indexofthefirstoccurenceofanelementinansortedarray {


    static int leftOccurence(int a[],int key)
    {
        int l=0;
        int ans=-1;
        int r=a.length-1;
        while (l<=r)
        {
            System.out.println("l="+l+"  "+"r="+r );
            int mid=(l+r)/2;
            System.out.println("mid"+mid);
            if (a[mid]==key)
            {
                ans=mid;
                r=mid-1;

            }
            else if (key>a[mid])
            {
                l=mid+1;
            }
            else {
                r=mid-1;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int a[]={1,2,4,4,4,5,9,9,11,11,11,14};
        System.out.println(leftOccurence(a,11));

    }
}
