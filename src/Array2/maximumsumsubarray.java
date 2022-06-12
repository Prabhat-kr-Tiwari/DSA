package Array2;

public class maximumsumsubarray {
    /*static int maxsum(int a[])
    {
        int max=Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            int sum=0;
            for (int j = i; j < a.length; j++) {
                sum=a[i]+a[j];
                if (sum>max)
                {
                    max=sum;
                }
            }
        }
        return max;
    }*/
    static int largestmaximumsumsubarray(int a[])
    {
        //int end,start
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            currsum+=a[i];
            if (maxsum<currsum)
            {
                maxsum=currsum;
                //update end
            }
            if (currsum<0)
            {
                currsum=0;
                //update start
            }
        }
        return  maxsum;
    }
    public static void main(String[] args) {
        int a[]={6,-7,4,-2,1,5,-4};
        //System.out.println(maxsum(a));
        System.out.println(largestmaximumsumsubarray(a));
    }
}
