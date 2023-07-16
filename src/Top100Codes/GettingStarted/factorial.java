package Top100Codes.GettingStarted;

public class factorial {

    //using for loop
    static void factor(int n){
        int res=1;
        for (int i = 2; i <=n ; i++) {
            res*=i;



        }
        System.out.println(res);
    }
    //using recursion
    static int fact(int n){
        if (n==0)
            return 1;
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        factor(5);
    }

}
