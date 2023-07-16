package Top100Codes.GettingStarted;

import java.util.ArrayList;

public class PrimeFactorsofanumber {
    /*
    Example :

Input : 12
Output : 2 2 3
    */
    static void prime(int n){

        ArrayList<Integer>al=new ArrayList<>();
        for (int i = 2; i *i<= n; i++) {
            while (n%i==0){
                n=n/i;
                System.out.println(i);
            }


        }
        if (n!=1){
            System.out.println(n);
        }

    }

    public static void main(String[] args) {
        int n=12;
        prime(n);
    }
}
