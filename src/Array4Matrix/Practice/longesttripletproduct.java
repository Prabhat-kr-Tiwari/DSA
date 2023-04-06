package Array4Matrix.Practice;

public class longesttripletproduct {
    static Long maxTripletProduct(Long a[], int n)
    {
        // Complete the function
        long product =0;



        for(int i=0;i<n-2;i++)
        {
            long currproduct=a[i]*a[i+1]*a[i+2];
            product=Math.max(currproduct,product);

        }
        return product;
    }
    static Long maxTripletProductnew(Long a[], int n)
    {
        // Complete the function
        long product =0;



        /*for(int i=0;i<n-2;i++)
        {
            long currproduct=a[i]*a[i+1]*a[i+2];
            product=Math.max(currproduct,product);

        }*/

        int l=0;
        int i=0;
        int j=1;
        int k=2;
        int templ=l;
        int tempn=n;
        int templ1=l;
        int tempn1=n;
        int templ2=l;
        int tempn2=n;

        while(templ<=tempn){
            long currproduct=a[i]*a[j]*a[k];
            product=Math.max(currproduct,product);
            i++;
            templ++;
            tempn--;
        }
        while(templ1<=tempn1){
            long currproduct=a[i]*a[j]*a[k];
            product=Math.max(currproduct,product);
            j++;
            templ1++;
            tempn1--;
        }

        while(templ2<=tempn2){
            long currproduct=a[i]*a[j]*a[k];
            product=Math.max(currproduct,product);
            k++;
            templ2++;
            tempn2--;
        }
        return product;
    }

    public static void main(String[] args) {
        Long arr[] = {1L, 2L, 3L, 5L};
        System.out.println(maxTripletProductnew(arr, arr.length));
    }

}
