package Top100Codes.GettingStarted;

public class checkprime {

    static boolean isprime(int n,int i){
        if (n<2)
            return false;
        if (i==n){
            return true;
        }
        i+=1;
        return isprime(n,i);
    }

    public static void main(String[] args) {
        int n=3;
        System.out.println(isprime(n,0));
    }

}
