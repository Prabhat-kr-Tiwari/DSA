package Top100Codes.GettingStarted;

public class StrongNumber {
    /*For a number to be a Strong Number, the sum of Factorial of each digit of the number must
    be equal to the number itself*/

    static int fact(int n){
        if (n==0)
            return 1;
        return n*fact(n-1);
    }
    static void strongnumber(int n){
        int ans=0;
        int temp=n;
        int digit=0;
        while (temp!=0){
            digit=temp%10;
            ans=ans+fact(digit);
            temp=temp/10;
        }
        if (ans==n){
            System.out.println("Strong no");
        }else{
            System.out.println("Not strong");
        }

    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(fact(4));
        strongnumber(145);

    }
}
