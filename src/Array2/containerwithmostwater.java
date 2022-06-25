package Array2;
public class containerwithmostwater {
    static int mostwaterusingloop(int a[])
    {
        int area=0;
        int maxarea=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            int left=a[i];
            for (int j = i+1; j < a.length; j++) {
                int right=a[j];
                int dist=j-i;
                area=Math.min(left,right)*dist;
                maxarea=Math.max(maxarea,area);
            }
        }
        return maxarea;
    }
    //using two pointer approach
    static int withmostwater(int a[])
    {
        int maxArea=0;
        int l=0;
        int r=a.length-1;
        while (l<r)
        {
            int height=Math.min(a[l],a[r]);
            int distance=r-l;
            int area=height*distance;
            maxArea=Math.max(maxArea,area);
            if (a[l]<a[r])
            {
                l++;
            }
            else {
                r--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int a[]={1,8,6,2,5,4,8,3,7};
        System.out.println(mostwaterusingloop(a));
        System.out.println(withmostwater(a));
    }
}