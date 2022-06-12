package array1;

public class reversethearray {

    public static void main(String[] args)
    {
        int a[]={12,3,4,5};
        int n=a.length;
        int x[]=new int[n];
        int j=n;

        for (int i = 0; i < n; i++) {
            x[j-1]=a[i];
            j--;
        }
        for (int e:x
             ) {
            System.out.println(e);
        }
    }
}
