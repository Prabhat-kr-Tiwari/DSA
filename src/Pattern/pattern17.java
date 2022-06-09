package Pattern;/*

17       1
        212
       32123
      4321234
       32123
        212
         1     */

public class pattern17 {

    static void pattern17(int n)
    {
        for(int row =1;row<=n;row++)
        {
            for (int space=0;space<n-row;space++)
            {
                System.out.print(" ");
            }

            for (int col = row; col >=1; col--)
            {
                System.out.print(col );
            }
            for (int col = 2; col <=row; col++)
            {
                System.out.print(col );
            }

            //when onee row is printed we need to add a new line
            System.out.println();
        }

    }
    public static void main(String[] args)
    {
        pattern17(5);
    }
}
