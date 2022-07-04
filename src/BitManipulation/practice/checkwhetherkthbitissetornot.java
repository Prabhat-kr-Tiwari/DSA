package BitManipulation.practice;

public class checkwhetherkthbitissetornot {
    static boolean checkKthBit(int n, int k)
    {
        // Your code here
        int mask=1<<k;
        if((n&mask)==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkKthBit(4,1));

    }
}
