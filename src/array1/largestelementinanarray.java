package array1;

public class largestelementinanarray {
    static int maxof(int a[])
    {
        int maxIndex=0;
        if(a.length==0) return -1;
        int n=a.length;
        for (int i=1;i<n;i++)
        {
            if (a[i]>a[maxIndex])
            {
                maxIndex=i;
            }
        }
        return maxIndex;
    }
    public static void main(String[] args)
    {
        int a[]={12,553,499,53};
        int max=a[0];
        int n=a.length;
        for (int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(max);
        System.out.println(a[maxof(a)]);
    }

}
