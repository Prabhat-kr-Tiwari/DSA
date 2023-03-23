package QuestionSheet;

public class sumofdigits {
    static void sum(int n)
    {
        int temp=n;
        int sum=0;
        while (temp!=0)
        {

            int digit=temp%10;
            sum+=digit;
            temp/=10;

        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        sum(123);

    }
}
