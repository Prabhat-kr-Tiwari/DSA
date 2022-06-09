package Pattern;

/*19.   *        *
        **      **
        ***    ***
        ****  ****
        **********
        ****  ****                             n
        ***    ***
        **      **
        *        *          */

public class pattern19 {

    static void pattern19(int n)
    {
        for(int row =1;row<n;row++)
        {
            //for (int space=row+1;space<col-1;space++)
            {
                System.out.print(" ");
            }

            for (int col = 1; col <=n; col++)
            {
                System.out.print("* " );
            }
           /* for (int col = 2; col <=row; col++)
            {
                System.out.print("*" );
            }*/

            //when onee row is printed we need to add a new line
            System.out.println();
        }

    }
    public static void main(String[] args)
    {
        pattern19(10);
    }
}
