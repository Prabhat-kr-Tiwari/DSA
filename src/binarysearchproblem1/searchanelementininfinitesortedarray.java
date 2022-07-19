package binarysearchproblem1;

public class searchanelementininfinitesortedarray {
    static int binarysearch(int a[],int key,int l,int r)
    {
        while (l<=r)
        {
            int mid=l+(r-l)/2;
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
    static int search(int []a,int key)
    {
        if (a.length==0)return -1;
        if (a[0]==key) return 0;
        int index=1;
        while (a[index]<=key)
        {
            index*=2;
        }
        return binarysearch(a,key,index/2,index);
    }
    public static void main(String[] args) {
        int a[]={1,2,4,5,6,7,8,9,16,17,18,19,23,24,25,27,28,29,30,31};
        System.out.println(search(a,8));
    }
}
