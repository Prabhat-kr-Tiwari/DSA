package sortingalgorithm2;

public class mergesort {

    static void mergeSort(int a[],int l,int h)
    {
        if (l<h)
        {
            int mid=(l+h)/2;
            mergeSort(a,l,mid);
            mergeSort(a,mid+1,h);
            merge(a,l,mid,h);
        }
    }
    static void merge(int a[],int l,int mid,int h)
    {
        int b[]=new int[a.length];
        int i=l;//for left subarray
        int j=mid+1;// j is for right subarray
        int k=l;// for the b array
        while (i<=mid&&j<=h)
        {
            if (a[i]<a[j])
            {
                b[k]=a[i];
                i++;
            }else {
                b[k]=a[j];
                j++;
            }
            k++;
        }
        //agr left side ka sara element b array fill ho gya hai toh right side wale element
        // ko b array me add karo
        if (i>mid)
        {
            while(j<=h)
            {
                b[k]=a[j];
                k++;
                j++;

            }
        }
        //agr right side ka sara element b array fill ho gya hai toh left side wale element
        // ko b array me add karo
        else {
            while (i<=mid)
            {
                b[k]=a[i];
                k++;
                i++;
            }
        }
        for ( i = l; i <=h; i++) {
            a[i]=b[i];
        }
    }
    public static void main(String[] args) {
        int a[]={-2,3,4,112,1,0};
        mergeSort(a,0,a.length-1);
        for (int e:a
             ) {
            System.out.println(e);
        }
    }
}
