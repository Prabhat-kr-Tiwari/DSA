package binarysearchproblem1.doubtclearingSession;

public class longestcommonprefixusingdivideandconquer {
    static String commonprefix(String[]a,int l,int r)
    {
        int n=a.length;
        l=0;
        r=n-1;
        if (l>r) return null;
        if(l+1==r) return commonUtil(a[l],a[r]);
        if(l<=r)
        {
            int mid=(l+r)/2;
            String left=commonprefix(a,l,mid);
            String right=commonprefix(a,mid+1,r);
            return commonUtil(left,right);
        }
        return null;
    }


    static String commonUtil(String a,String b)
    {
        String result = "";
        int i;
        int j;
        for (i=0, j =0; i < a.length()&&j<b.length(); i++,j++) {
            if (a.charAt(i)!=b.charAt(j))
            {
                break;

            }
            result+=a.charAt(i);

        }
        return result.substring(0,i);
    }

    public static void main(String[] args) {

        String[] arr = {"geeksforgeeks", "geeks",
                "geek", "geezer"};
        System.out.println(arr.length);
        commonprefix(arr,0,arr.length-1);
    }
}
