package BitManipulation.practice;

public class unsettheithbit {
    static int unsetKthBit(int N,int K){
        // code here
        int mask=1<<K;
        if((N&mask)==0)
        {

            return N;
        }
        else
        {
            return N^mask;
        }
    }

    public static void main(String[] args) {

        System.out.println(unsetKthBit(10,1));

    }
}
