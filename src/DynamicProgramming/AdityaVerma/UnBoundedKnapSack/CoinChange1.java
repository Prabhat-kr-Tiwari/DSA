package DynamicProgramming.AdityaVerma.UnBoundedKnapSack;

import Teest.Stack;

import java.util.ArrayDeque;

public class CoinChange1 {


    static int coinChange(int[] coins, int amount) {

        return (int) coinChange(coins,coins.length,amount);
    }
    static long count(int coins[], int N, int sum) {
        // code here.

        return coinChange(coins,N,sum);
    }


    static long coinChange(int a[],int n,int sum){


        long t[][]=new long[n+1][sum+1];
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=sum ; j++) {
                if (i==0){
                    t[i][j]=0;
                }
                if (j==0){
                    t[i][j]=1;
                }
            }
        }
        return coinChange(a,n,sum,t);
    }
    static long coinChange(int a[],int n,int sum,long t[][]){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=sum ; j++) {
                if (a[i-1]<=j){
                    t[i][j]=t[i-1][j]+t[i][j-a[i-1]];
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=sum ; j++) {
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
        return  t[n][sum];
    }

    private static void reverseWordINSentence(String word){


        System.out.println(word);
        Stack stack=new Stack();
        ArrayDeque arrayDeque= new ArrayDeque<>();
        StringBuilder finals=new StringBuilder();
        int count=0;
        for (int i = 0;i<word.length();i++) {


            if (word.charAt(i)==' '){

                System.out.println(arrayDeque);
                System.out.println("word at i "+word.charAt(i));
                for (int j = 0; j <count ; j++) {
                    finals.append(arrayDeque.pop());
                }
                finals.append(" ");
                count=0;

            }else{

                System.out.println(word.charAt(i));
                arrayDeque.push(word.charAt(i));
                count++;
            }

        }
        if (count>0){
            for (int j = 0; j <count ; j++) {
                finals.append(arrayDeque.pop());
            }
        }


        System.out.println(finals);

    }



    public static void main(String[] args) {
        int a[]={1,2,5};
        int sum=11;
//        System.out.println(count(a,a.length,sum));
        String word="Prabhat Kumar Tiwari";
        reverseWordINSentence(word);

    }
}
