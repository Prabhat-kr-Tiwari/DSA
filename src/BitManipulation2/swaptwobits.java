package BitManipulation2;

public class swaptwobits {
    static int Swaptwobits(int n,int i,int j)
    {
        int ith=((n>>i)&1);
        int jth=((n>>j)&1);
        int xor=ith^jth;
        if (xor==0) return n;

        int mask=(1<<i)|(1<<j);
        int res=n^mask;
        return res;
    }

    public static void main(String[] args) {

        System.out.println(Swaptwobits(10,1,2));

    }
}
