package Pattern;

public class pattern28 {

    static void pattern28(int n)
    {
        for(int row =1;row<=2*n-1;row++)
        {
            int totalcolinrow=row>n?2*n-row:row;

            int totalnoofspaces=n-totalcolinrow;
            for (int s=0;s<totalnoofspaces;s++)
            {
                System.out.println(" ");
            }
            for (int col = 1; col <=totalcolinrow; col++)
            {
                System.out.print("*  "  );
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
