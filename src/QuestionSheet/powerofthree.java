package QuestionSheet;

public class powerofthree {



    static int powerofthree(int n)
    {
        if (n==0)
            return 1;

        return 3*powerofthree(n-1);
    }

    public static void main(String[] args) {
        System.out.println(powerofthree(2));
    }

}
