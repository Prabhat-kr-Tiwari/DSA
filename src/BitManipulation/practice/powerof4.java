package BitManipulation.practice;

public class powerof4 {

    static int isPowerOfFour(long n)
    {
        // Your code here

        if(n==0) return 0;
        while(n!=1)
        {
            if(n%4!=0)
            {
                return 0;

            }
            n=n/4;
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));

    }
}
