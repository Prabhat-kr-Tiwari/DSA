package FrazDSA.Recursion;


import java.util.ArrayList;
import java.util.List;

public class printseries {
    public static List<Integer> printSeries(int n, int k) {
        // Write your code here
        List<Integer>output=new ArrayList();
        //if()


        if(n>0)
        {
            output.add(n);
            printSeries(n-k,k);
        }
        else{
            output.add(n);
            printSeries(n+k,k);
        }
        return output;
    }

    public static void main(String[] args) {
        int n=5;
        int k=2;
        System.out.println(printSeries(n,k));
    }
}
