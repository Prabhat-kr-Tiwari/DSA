package Top100Codes.GettingStarted;

public class fibonacciseries {
    static int start=0;
    static int second=1;

    static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        int nextterm = 0;
        for (int i = 2; i < n; i++) {

            nextterm = a + b;
            System.out.println(nextterm);
            a = b;
            b = nextterm;
        }


    }
    //using recursion

  /*  f(first, second, n){
        if(second >= n){
            return
        }
        print(first+ second)
        f(second, first+second,n)
    }*/

    static int fib(int n){

        int nexterm=0;
        if (n>0){
            nexterm=start+second;

            start=second;
            second=nexterm;
            System.out.println(nexterm);


            fib(n-1);


        }

        return 0;
    }


    public static void main(String[] args) {
       // fibonacci(4);
        int n=4;

        System.out.println(start);
        System.out.println(second);
       fib(n-2);
    }

}
