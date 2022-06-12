package array1;

public class secondlargest {
    static int seconlar(int a[])
    {
        if (a.length<2) return -1;
        int largest=0;
        int secondlargest=-1;
        for (int i=1;i<a.length;i++)
        {
            if (a[i]>a[largest])
            {
                secondlargest=largest;
                largest=i;
            }
            else if(a[i]<a[largest])
            {
                if (secondlargest==-1||a[secondlargest]<a[i])
                {
                    secondlargest=i;
                }
            }
        }
        return secondlargest;
    }

    public static void main(String[] args)
    {
        int a[]={212,32,3,22};

        System.out.println(a[seconlar(a)]);

    }
}
