package Top100Codes.GettingStarted;

/*A Number that can be represented as the sum of it's factors except the number itself is
known as the Perfect Number.*/


import java.util.ArrayList;

/*
Example
Input : 6
Output : Yes, It's a Prefect Number
Explanation : Number = 6
Factors of 6 except 6 are 1, 2 and 3.
When we add the three we get 6 itself. Therefore, it's a Perfect Number.
*/
public class PerfectNumber {
    static ArrayList<Integer>al;
    static void factorofNumber(int n){


    }

    static int sum(int a,int b){
        return a+b;
    }
    static void perfecno(int n){
        al=new ArrayList<>();

        for (int i = 1; i <n ; i++) {
            if (n%i==0){
                al.add(i);
            }


        }
        int ans=0;
        for (int e:al
             ) {
            ans+=e;


        }
        if (n==ans){
            System.out.println("Perfect");
        }else{
            System.out.println("Not perfect");
        }
    }

    public static void main(String[] args) {
        perfecno(2);
    }
}
