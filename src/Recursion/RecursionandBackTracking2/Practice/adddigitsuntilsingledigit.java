package Recursion.RecursionandBackTracking2.Practice;

/*Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
        Example 1:

        Input: num = 38
        Output: 2
        Explanation: The process is
        38 --> 3 + 8 --> 11
        11 --> 1 + 1 --> 2
        Since 2 has only one digit, return it.*/
public class adddigitsuntilsingledigit{
    static int addDigits(int num) {
        int sum=0;
        int temp;

        while(num>0||sum>9)
        {
            if (num == 0) {
                num = sum;
                sum = 0;
            }
            temp=num%10;
            sum+=temp;
            num=num/10;

        }
        return sum;

    }

    static int add(int n)
    {
        int sum=0;
        int temp;

        while(n>0)
        {
            temp=n%10;
            sum+=temp;
            n=n/10;

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
}
