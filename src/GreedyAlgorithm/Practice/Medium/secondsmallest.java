package GreedyAlgorithm.Practice.Medium;

import java.util.Arrays;

public class secondsmallest {


    static String secondSmallest(int S, int D){
        // code here


        if(S==0||S==1||S>=9*D){
            return String.valueOf(-1);
        }

        int res[]=new int[D+1];
        S-=1;
        for (int i = D-1; i >0 ; i--) {

            if(S>9){
                res[i]=9;
                S-=9;
            }else{
                res[i]=S;
                S=0;
            }

        }
        res[0]=S+1;
        System.out.println(Arrays.toString(res));
        int ind=D-1;
        for (int i = D-1; i >=0 ; i--) {

            if(res[i]==9){
                ind=i;
            }else{
                break;
            }
        }
        if(D==1){
            return String.valueOf(S+1);
        }
        res[ind]-=1;
        res[ind-1]+=1;
        System.out.println(Arrays.toString(res));

        String str="";

        for (int i = 0; i < D; i++) {

            str=str+res[i];
        }
       return str;

    }

    public static void main(String[] args) {
        int S = 6;
        int D = 1;
        System.out.println(secondSmallest(S,D));

    }
}
