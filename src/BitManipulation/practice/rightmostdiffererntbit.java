package BitManipulation.practice;

public class rightmostdiffererntbit {

    static int Rightmostdiffererntbit(int m,int n)
    {
        int count=1;
        if (m==n) return -1;
        while ((m&1)==(n&1))
        {
            count++;
            m=m>>1;
            n=n>>1;
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(Rightmostdiffererntbit(11,9));

    }
}
