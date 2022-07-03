package BitManipulation;

public class findithbit {
    static int findithbit(int n,int i)
    {

        int mask=1<<i;
        if ((n&mask)==0)
        {
            return 0;
        }
        else {
            return 1;
        }
    }

    public static void main(String[] args) {


        System.out.println(findithbit(5,1));
    }
}
