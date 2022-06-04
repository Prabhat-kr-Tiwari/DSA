package Pattern;

public class pattern1 {
    /*static void pattern1(int n)
    {}
    public static void main(String[] args)
    {}*/

/*    1.    *****
            *****
            *****
            *****
            *****/
    static void pattern1(int n)
    {
        for(int i =0;i<n;i++)
        {
            for (int j = 0; j <n; j++)
            {
                System.out.print("*");
            }
            //when onee row is printed we need to add a new line
            System.out.println();
        }

    }
    public static void main(String[] args)
    {
        pattern1(5);


    }



}
