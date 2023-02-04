package tenDaysRecursionChalengeloveBabbar.RecursionDay4.Practice;

public class reverseanumber {

    static int rev(int num)
    {
        int digits=(int)Math.log10(num)+1;
        return solve(num,digits);

    }
    static int solve(int num,int digits)
    {
        if (num%10==num) return num;
        int digit=num%10;
        return digit*(int)Math.pow(10,digits-1)+solve(num/10,digits-1);

    }

    public static void main(String[] args) {
        System.out.println(rev(123));
    }
}
