package BitManipulation.practice;

public class checkevenorodd {
    //using xor operation
    static void Checkevenorodd(int n)
    {
        if ((n^1)==n+1)
        {
            System.out.println("even" );
        }
        else {
            System.out.println("odd");
        }
    }
    //using and operation
    static void Checkevenoroddusingandoperation(int n)
    {
        if ((n&1)==0)
        {
            System.out.println("even" );
        }
        else {
            System.out.println("odd");
        }
    }
    //using or operation
    static void Checkevenoroddusingoroperation(int n)
    {
        if ((n|1)==n+1)
        {
            System.out.println("even" );
        }
        else {
            System.out.println("odd");
        }
    }





    public static void main(String[] args) {
        Checkevenorodd(244);
        Checkevenoroddusingandoperation(244);
        Checkevenoroddusingoroperation(244);

    }
}
