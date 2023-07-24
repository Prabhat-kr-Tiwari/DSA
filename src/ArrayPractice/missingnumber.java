package ArrayPractice;

public class missingnumber {


    public static int missingNumber(int A[], int N)
    {
        // Your code goes here

        int sum=0;
        int n=A.length;
        int x=n+1;
        sum=(x*(x+1))/2;
        //System.out.print(sum);
        int currsum=0;
        for(int i=0;i<N;i++)
        {
            currsum+=A[i];
        }
        //System.out.println(currsum+"--");
        return (sum-currsum);
    }

    public static void main(String[] args) {
        int a[]={1,4,3};
        System.out.println(missingNumber(a,a.length));


    }
}
