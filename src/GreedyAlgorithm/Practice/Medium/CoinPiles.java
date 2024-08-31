package GreedyAlgorithm.Practice.Medium;

import java.util.ArrayList;

public class CoinPiles {

    static int minSteps(int[] A, int N, int K) {
        // code here

        ArrayList<Integer>P=new ArrayList<>();
        ArrayList<Integer>T=new ArrayList<>();
        for (int i = 0; i < N; i++) {

            if (A[i]==1){
                P.add(i);
            }else {
                T.add(i);
            }
        }
        System.out.println(P);
        System.out.println(T);
        int ans=0;
        int s_p=0;
        int s_t=0;
        while (s_t<T.size() && s_p<P.size()){
            if (Math.abs(T.get(s_t)-P.get(s_p))<=K){
                ans++;
                s_t++;
                s_p++;
            }else if (T.get(s_t)<P.get(s_p)){
                s_t++;

            }else {
                s_p++;

            }
        }
        System.out.println(ans);
        return ans;


    }

    public static void main(String[] args) {

        /*P=1;
        T=0*/
       int  N = 5, K = 1;
        int[] arr = {1, 0, 0, 1, 0};
        System.out.println(minSteps(arr,N,K));
    }
}
