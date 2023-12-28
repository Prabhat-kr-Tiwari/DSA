package AskedByAsif;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class sumOfFIrst100Primenumber {



    static boolean primeNo(int n,int i){
        if(n<=2){
            return n == 2;
        }
        if(n%i==0){
            return false;
        }
        if(i*i>n){
            return true;
        }
        i+=1;
        return primeNo(n,i);

    }
    static void  sum(int n){
        int sumo=0;
        ArrayList<Integer>al=new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if(primeNo(i,2)){
                sumo+=i;
            }
        }
        System.out.println(sumo);


    }
    static void pr(int num) {
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; // If num is divisible by any number other than 1 and itself, it's not prime
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }




    public static void main(String[] args) {
      //  sum(100);

        pr(100);


    }
}
