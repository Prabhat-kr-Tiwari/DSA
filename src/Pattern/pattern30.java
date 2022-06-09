package Pattern;/*

30.         1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5      */

public class pattern30 {

    static void pattern30(int n)
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
        pattern30(5);
    }
}
