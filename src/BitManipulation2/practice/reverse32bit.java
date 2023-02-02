package BitManipulation2.practice;

public class reverse32bit {

    static long reverse(long n)
    {
        long res=0;
        int i= 0;
        while (i<=31)
        {
            if ((n&(1<<i))!=0)
            {
                res+=(1L<<(31-i));

            }
            i++;

        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(reverse(1));

    }
}
