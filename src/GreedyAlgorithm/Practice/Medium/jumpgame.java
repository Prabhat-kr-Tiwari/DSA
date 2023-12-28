package GreedyAlgorithm.Practice.Medium;

public class jumpgame {



    static int canReach(int[] A, int N) {
        // code here

        int jump=1;
        int steps=A[0];
        int maxreach=A[0];


        for (int i = 0; i < N; i++) {

            if(A[i]==0){
                return 0;
            }
            steps--;
            if (steps==0){
                jump++;
                steps=maxreach-i;
            }
            maxreach=Math.max(maxreach,i+A[i]);
            System.out.println("maxreach"+maxreach);


        }
        System.out.println("last"+maxreach);
        if(maxreach>=A.length){
            return 1;
        }
        return 0;
    }
    static int canReach1(int[] arr, int N) {
        // code here
        // your code here
      int max=0;
        for (int i = 0; i < N-1; i++) {

            max=Math.max(max,arr[i]);
            if (max==0) return 0;
            max--;

        }
        return 1;
    }
    public static void main(String[] args) {

        int N = 6;
        int A[] = {1 ,2, 0,3,0,0};
        System.out.println(canReach1(A,N));
    }
}
