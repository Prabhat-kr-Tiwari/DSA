package Array2;

public class longestlengthofallconsecutive1s {



    static int maxlength(int a[],int n)
    {
        int count=0;
        int result=0;
        for (int i = 0; i < n; i++) {
            if (a[i]==0)
                count=0;
            else {
                count++;
                result=Math.max(result,count);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int a[]={0,0,1,1,1,0,1,1,1,1};
        int n=a.length;

        System.out.println( maxlength(a,n));
    }
}
