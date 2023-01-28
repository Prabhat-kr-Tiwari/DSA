package Recursion.RecursionandBackTracking2;

public class sumofanumberusingrecursion {
    static int sum(int n) {
        int sum = 0;
        int temp;
        while (n > 0) {
            temp = n % 10;
            sum += temp;
            n = n / 10;

        }
        return sum;
    }

    //using recursion
    static int sumoOfDigits(int n) {
        if(n==0)
            return 0;
        int sum = 0;
        int lastDigit;

        lastDigit = n % 10;

        return lastDigit+sumoOfDigits(n / 10);

    }

    public static void main(String[] args) {
        System.out.println(sum(2314));
        System.out.println(sumoOfDigits(2341));
    }
}
