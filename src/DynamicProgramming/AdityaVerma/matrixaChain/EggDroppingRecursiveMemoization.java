package DynamicProgramming.AdityaVerma.matrixaChain;

public class EggDroppingRecursiveMemoization {


    static int solve(int e,int f){
        // Create a 2D array for memoization
        int[][] t = new int[e + 1][f + 1];

        // Initialize all values in the array to -1
        for (int i = 0; i <= e; i++) {
            for (int j = 0; j <= f; j++) {
                t[i][j] = -1;
            }
        }

        // Add logic to solve the problem
        // Example:
        return eggDrop(e, f, t);
    }
    static int eggDrop(int e, int f, int[][] t){

        if(f==0||f==1){
            return f;
        }
        if (e==1) {
            return f;
        }
        int min=Integer.MAX_VALUE;
        if(t[e][f]!=-1){
            return t[e][f];
        }
        for (int i = 1; i <=f ; i++) {
            int temp=1+Math.max(eggDrop(e-1,i-1,t),eggDrop(e,f-i,t));
            min=Math.min(min,temp);

        }
        t[e][f]=min;
        return min;

    }

    public static void main(String[] args) {
        System.out.println(solve(2,10));

    }
}
