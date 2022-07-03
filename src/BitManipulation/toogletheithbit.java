package BitManipulation;

public class toogletheithbit {
    static int Toogletheithbit(int n,int i)
    {
        int mask=1<<i;
        int res=n^mask;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Toogletheithbit(5,1 ));
    }
}
