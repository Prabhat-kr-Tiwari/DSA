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




    public static void main(String[] args) {
        Checkevenorodd(244);

    }
}
