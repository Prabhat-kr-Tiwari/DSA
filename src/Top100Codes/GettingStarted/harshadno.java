package Top100Codes.GettingStarted;

/*
Harshad number or not using Java :
Harshad number is a number or an integer in base 10 which is completely divisible by sum of  its digits.

For better understanding let us consider an example.

Example :

Suppose a number 24 .
Calculate the sum of digits of the number (2 + 4) = 6 .
Check whether the number entered by user is completely divisible by sum of its digits or not.
*/
public class harshadno {
    static void har(int n){
        int temp=n;
        int digit=0;
        int sum=0;
        while (temp!=0){
            digit=temp%10;
            sum+=digit;

            temp=temp/10;
        }
        if (n%sum==0){
            System.out.println("harshad");
        }else{
            System.out.println("not");
        }
    }

    public static void main(String[] args) {
        int  n=24;
        har(n);

    }
}
