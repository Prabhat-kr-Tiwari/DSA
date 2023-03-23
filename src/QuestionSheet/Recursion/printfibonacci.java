package QuestionSheet.Recursion;

public class printfibonacci {

    static int first = 0;
    static int second = 1;

    static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    static void print(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(fib(i));

        }
    }

    static void fibPrintUsingRecursion(int n) {
        if (n<0)
            return;

        if (n == 0) {
            System.out.println(first);
        }
        if (n == 1) {
            System.out.println(second);
        }
        int res = first + second;
        System.out.println(res);
        first = second;
        second = res;
        fibPrintUsingRecursion(n-1);


    }


    public static void main(String[] args) {
        //print(5);
        fibPrintUsingRecursion(5);

    }
}
