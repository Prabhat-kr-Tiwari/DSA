package BitManipulation2;

public class reverse32bit {

    static Long reversedBits(Long X) {
        // code here
        long res=0;
        int i=0;
        while(i<=31)
        {
            if((X&(1<<i))!=0)
            {
                res+=(1L<<(31-i));
            }
            i++;
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(reversedBits(3L));

    }
}
