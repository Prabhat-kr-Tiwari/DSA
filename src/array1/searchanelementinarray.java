package array1;

public class searchanelementinarray {
    public static void main(String[] args)
    {
        int a[]={1,2,4,6,5};
        int key=13;
        int res=-1;

        for (int i=0;i<a.length;i++)
        {
            if (a[i]==key)
            {
                res=i;
                break;
            }
        }
        if (res==-1)
        {
            System.out.println("element not found");
        }
        else {
            System.out.println("elment found at" +res);
        }
    }
}
