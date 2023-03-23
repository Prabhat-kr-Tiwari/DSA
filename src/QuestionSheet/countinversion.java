package QuestionSheet;

/*public class countinversion {
}*/
class countinversion
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.

    static long merge(long a[], long s, long mid, long e)
    {
        // Your code here
        long swaps=0L;

        //find length
        int len1=(int)(mid-s+1L);
        int len2=(int)(e-mid);

        //create array of that size
        long a1[]=new long[len1];
        long a2[]=new long[len2];
        int originalArrayIndex=(int)s;

        //cpoy array elements
        for(int i=0;i<len1;i++)
        {
            a1[i]=a[originalArrayIndex];
            originalArrayIndex++;
        }
        for(int i=0;i<len2;i++)
        {
            a2[i]=a[originalArrayIndex];
            originalArrayIndex++;
        }

        //merge two sorted array
        originalArrayIndex=(int)s;

        int index1=0;
        int index2=0;
        while(index1<len1&&index2<len2)
        {
            if(a1[index1]<a2[index2])
            {
                a[originalArrayIndex]=a1[index1];
                index1++;
                originalArrayIndex++;

            }else{
                a[originalArrayIndex]=a2[index2];
                originalArrayIndex++;
                index2++;
                swaps+=(long)((mid+1)-(s+index1));

            }
        }
        while(index1<len1)
        {
            a[originalArrayIndex]=a1[index1];
            originalArrayIndex++;
            index1++;
        }
        while(index2<len2)
        {
            a[originalArrayIndex]=a2[index2];
            originalArrayIndex++;
            index2++;
        }
        return swaps;



    }
    static long mergeSort(long arr[], long s, long e)
    {
        long count=0;
        //code here
        if(s>=e)
            return count;
        long mid=(s+e)/2;

        count+=mergeSort(arr,s,mid);
        count+=mergeSort(arr,mid+1,e);
        count+=merge(arr,s,mid,e);
        return count;

    }
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        return (long)(mergeSort(arr,(long)0,(long)arr.length-1));

    }

    public static void main(String[] args) {
        long a[]={8, 4, 2, 1};
        System.out.println(mergeSort(a,0,a.length-1));

    }
}
