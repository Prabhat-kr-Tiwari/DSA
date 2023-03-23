package tenDaysRecursionChalengeloveBabbar.RecursionDay4;

import static java.lang.Math.log10;

public class reverseanumber {
    static int rev = 0;

    static int revNum(int num) {
        if (num == 0)
            return 0;
//        int temp = num;
        int digit = num % 10;
        rev = (rev * 10) + digit;
        revNum(num / 10);
        return rev;


    }

    static int revNumber2(int num) {
        int digit = (int) Math.log10(num) + 1;
        return solve(num, digit);
    }

    static int solve(int num, int digit) {
        if(num % 10 == num){
            return num;
        }
        int digits = num % 10;
        return digits * (int) Math.pow(10, digit - 1) + solve(num / 10, digit - 1);
    }
    //using loop
    static int revUsingLoop(int num)
    {
        int sum=0;
        while (num!=0)
        {
            int digit=num%10;
            int digits=(int)Math.log10(num)+1;
            if(digit!=0)
            {
                sum+=digit*Math.pow(10,digits-1);
            }
            //digits--;
            num=num/10;
        }
        return sum;
    }


    public static void main(String[] args) {
//        System.out.println(revNum(-20));
//        System.out.println(revNumber2(20));
        System.out.println(revUsingLoop(1230));
    }
}
