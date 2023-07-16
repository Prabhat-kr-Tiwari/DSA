package Top100Codes.GettingStarted;

public class sumoffirstnnaturalnumber {
    static int getsum(int n){
        if (n==0)
            return n;
        return n+getsum(n-1);

    }

    public static void main(String[] args) {
        int n=3;
        System.out.println(getsum(n));

    }
}
