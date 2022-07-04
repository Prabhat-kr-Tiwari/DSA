package BitManipulation.practice;

public class findfirstsetbit {

    static int firstsetBit(int n)
    {
       if (n==0)
           return 0;
       int setbit=0;
        for (int i = 0; i < 32; i++) {
            int mask=1<<i;
            if ((mask&n)!=0)
            {
                setbit=i;
                break;
            }

        }
        return setbit+1;
    }
    public static void main(String[] args) {
        System.out.println(firstsetBit(5));

    }
}
