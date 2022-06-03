package javaBasicDay2;

public class numberGreaterthanaverageofarray {

    public static void main(String [] args)
    {
        int []a= {1,2,3,4};
        int sum=0;
        int n=a.length;
        //System.out.println(n);
        for (int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        float average=(float)sum/n;
        //System.out.println(sum);
        System.out.println("average is"+average);

        for (int k=0;k<n;k++)
        {
            if (a[k]>average)
            {
                System.out.println(a[k]);
            }
        }
    }
}
