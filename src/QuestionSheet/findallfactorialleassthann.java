package QuestionSheet;

import java.util.ArrayList;

public class findallfactorialleassthann {
    static long fact=1L;
    static ArrayList<Long> factorialNumbers(long N){
        // code here

        ArrayList<Long> al=new ArrayList<>();
        for(int i=1;i<=N&&fact<N;i++)
        {
            System.out.println(al);
            fact=i*fact;
            if(fact<=N)
            {
                al.add(fact);
            }
          /*  if(fact>N)
            {
                return al;
            }*/

        }
        return al;
    }

    public static void main(String[] args) {
        System.out.println(factorialNumbers(10));
    }
}
