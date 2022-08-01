package BinarySearchProblem2.practice;

public class emptythetank {

//ye galat hai code par question sahi hai

    static long minDaysToEmpty(long C, long l) {
        long newcap=0;
        long i=0;
        long x=0;
        for(;i<Integer.MAX_VALUE;i++)
        {
            if(newcap>C)
            {
                newcap=C;
            }
            else if(newcap<C)
            {

                newcap=newcap+l;
                newcap=newcap-i;
            }

            if(newcap==0)
            {
                x=i;
            }
        }
        return (int)x;
    }

    public static void main(String[] args) {
        int c=6;int l=1;
        System.out.println(minDaysToEmpty(c,l));

    }
}
