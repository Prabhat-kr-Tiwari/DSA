//package PatternByKunalKushwaha;
package Pattern;

public class pattern28 {

    static void pattern28(int n)
    {
        for(int row =0;row<2*n;row++)
        {
            int totalcolinrow=row>n?2*n-row:row;

            int totalnoofspaces=n-totalcolinrow;
            for (int s=0;s<totalnoofspaces;s++)
            {
                System.out.print(" ");
            }
            for (int col = 0; col <totalcolinrow; col++)
            {
                System.out.print("*  " );
            }
            //when onee row is printed we need to add a new line
            System.out.println();
        }


    }
    public static void main(String[] args)
    {
        pattern28(5);


    }
}
