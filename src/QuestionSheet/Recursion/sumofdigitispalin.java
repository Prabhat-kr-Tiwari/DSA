package QuestionSheet.Recursion;


class sumofdigitispalin {

    static boolean palin(int n)
    {
        int rev=0;
        int temp=n;
        int digit=0;
        while(temp!=0)
        {
            digit=temp%10;
            rev=(rev*10)+digit;
            temp=temp/10;
        }
        if(rev==n)
        {
            return true;
        }
        return false;
    }
    static int sum(int n)
    {
        int sum=0;
        int digit=0;
        while(n!=0)
        {
            digit=n%10;
            sum+=digit;
            n=n/10;
        }
        return sum;
    }
    static int isDigitSumPalindrome(int N) {
        // code here
        int x=sum(N);
        if(!palin(x))
        {
            return 0;
        }

        return 1;

    }

    public static void main(String[] args) {
        System.out.println(isDigitSumPalindrome(56));
    }
}
