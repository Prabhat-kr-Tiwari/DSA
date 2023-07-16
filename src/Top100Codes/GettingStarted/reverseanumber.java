package Top100Codes.GettingStarted;

public class reverseanumber {

    static int reverse(int n){
        int newnum = 0;

        int temp=n;
        while (temp!=0){
            int last=temp%10;

            newnum = newnum * 10 + last;
            temp=temp/10;

        }
        /*if (newnum<0)
        {
           // System.out.println("-");
            return newnum;
        }*/
        return newnum;

    }

    public static void main(String[] args) {
        int n=-12345;
        System.out.println(reverse(n));

    }
}
