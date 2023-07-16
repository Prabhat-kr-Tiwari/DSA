package Top100Codes.GettingStarted;

public class checkpalindrome {

    static int reverse(int n){
        int temp=n;
        int newnum=0;
        while (temp!=0){
            newnum=newnum*10+temp%10;
            temp=temp/10;

        }
        return newnum;

    }

    static boolean ispalin(int n){
        int result=reverse(n);
        if (n==result){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        int n=12322;
        System.out.println(ispalin(n));
    }

}
