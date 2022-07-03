package BitManipulation.practice;

public class setthekthbit {

    static int setKthBit(int N,int K){
        // code here
        int mask=1<<K;
        if((N&mask)==0)
        {
            N=N|mask;
            return N;
        }
        else
        {
            return N;
        }
    }
    public static void main(String[] args) {
        System.out.println(setKthBit(10,2));

    }
}
