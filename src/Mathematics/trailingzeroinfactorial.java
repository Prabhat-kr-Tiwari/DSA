package Mathematics;

public class trailingzeroinfactorial {
    static int trailingZeroes(int n) {
        int res=0;
        while(n>0)
        {

            res+=n/5;
            n=n/5;
        }
        return res;

    }

    public static void main(String[] args) {

        System.out.println(trailingZeroes(125));
    }
}
