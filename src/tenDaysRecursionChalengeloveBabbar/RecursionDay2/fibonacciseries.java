package tenDaysRecursionChalengeloveBabbar.RecursionDay2;

public class fibonacciseries {
    static  void fibonacii(int n){
        int start=0;
        int second=1;
        if (n==0)
        {
            System.out.println("0");
        }
        if (n==1)
        {
            System.out.println("1");
        }
        int third=start+second;
        start=second;
        second=third;
    }
    static int fib(int n)
    {
        if (n==0) return 0;
        if (n==1) return 1;
        return (fib(n-1)+fib(n-2));
    }
    static void print(int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.println(fib(i));
            //fib(i);

        }
    }
    static int printUsingRecursion(int n)
    {
        int res=0;
        if (n==0) return 0;
        if (n==1) return 1;
        int x=printUsingRecursion(n-1);
        int y=printUsingRecursion(n-2);
        //int res=x+y;
        //int res=0;
       //System.out.println("res"+res);
        res=(printUsingRecursion(n-1)+printUsingRecursion(n-2));
        //System.out.println((printUsingRecursion(n-1)+printUsingRecursion(n-2)));
        return res;

    }
    static void pr(int n)
    {
        while (n!=0)
        {
            System.out.println(printUsingRecursion(n-1));
        }

    }


    public static void main(String[] args) {
        //System.out.println(fib(6));
        print(6);
      //  System.out.println(printUsingRecursion(6));
        //fib(5);

    }
}
