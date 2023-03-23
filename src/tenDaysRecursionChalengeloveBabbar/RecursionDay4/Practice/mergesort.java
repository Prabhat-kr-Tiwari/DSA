package tenDaysRecursionChalengeloveBabbar.RecursionDay4.Practice;

public class mergesort {

    static void mergeSort(int arr[],int l,int h)
    {
        if (l<h)
        {
            int mid=(l+h)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,h);
            merge(arr,l,mid,h);
        }
    }

    static void merge(int arr[],int l,int mid,int h)
    {

        int b[]=new int[arr.length];
        int i=l;//for first array
        int j=mid+1;//for second array
        int k=l;//for new array
        while (i<=mid&&j<=h)
        {
            if (arr[i]<arr[j])
            {
                b[k]=arr[i];
                i++;
            }else
            {
                b[k]=arr[j];
                j++;
            }
            k++;
        }

        //aisa karen par agar left ka sara elment b mee agya hai toh right ka
        // sara element b me add kar doo
        if(i>mid)
        {
            while (j<=h){
                b[k]=arr[j];
                j++;
                k++;
            }
        }else
        {
            while (i<=mid)
            {
                b[k]=arr[i];
                i++;
                k++;
            }
        }
        for (i = l; i<=h ; i++) {
            arr[i]=b[i];


        }
    }

    public static void main(String[] args) {
        int arr[]={1,3,1,3,12,3,6,7};
        mergeSort(arr,0,arr.length-1);
        for (int w:arr
             ) {
            System.out.print(w+ " ");

        }
    }

}
