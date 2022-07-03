package BitManipulation;

public class poweroftwo {

    static boolean Poweroftwo(int n)
    {
        if ((n&(n-1))==0)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        System.out.println(Poweroftwo(9));
    }
}
