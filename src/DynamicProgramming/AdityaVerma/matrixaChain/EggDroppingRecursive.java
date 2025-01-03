package DynamicProgramming.AdityaVerma.matrixaChain;

public class EggDroppingRecursive {


    static int eggDrop(int e,int f){

        if(f==0||f==1){
            return f;
        }
        if (e==1) {
            return f;
        }
        int min=Integer.MAX_VALUE;
        for (int i = 1; i <=f ; i++) {
            int temp=1+Math.max(eggDrop(e-1,i-1),eggDrop(e,f-i));
            min=Math.min(min,temp);

        }
        return min;

    }

    public static void main(String[] args) {
        System.out.println(eggDrop(2,10));

    }
}
