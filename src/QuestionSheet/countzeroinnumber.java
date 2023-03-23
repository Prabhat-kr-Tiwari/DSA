package QuestionSheet;

public class countzeroinnumber {

    static int countzero(int num)
    {
        int count =0;
        int temp=num;
        while (temp!=0)
        {
            int digit=temp%10;
            if (digit==0)
            {
                count++;
            }
            temp=temp/10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countzero(1000000000));
    }

}
