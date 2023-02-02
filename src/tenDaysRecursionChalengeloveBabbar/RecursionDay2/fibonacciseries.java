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
}
