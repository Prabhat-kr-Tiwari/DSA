package Pattern;

/*2.    *
        **
        ***
        ****
        *****                */

public class pattern2 {

    static void pattern2(int n)
    {
        for(int row =1;row<=n;row++)
        {
            for (int col = 1; col <=row; col++)
            {
                System.out.print("*");
            }
            //when onee row is printed we need to add a new line
            System.out.println();
        }


    }
    public static void main(String[] args)
    {
        pattern2(4);


    }
}
