package ArrayPractice;

public class CountInversions {

    /*inversions: It is a variable that keeps track of the total number of inversions found so far.

mid: It represents the index that divides the array into two subarrays during the merging process.
It is calculated as the middle index of the current subarray.

i: It is an index variable that points to the current element in the left subarray.

mid - i + 1: This part calculates the number of elements in the right subarray that are less than the
 current element in the left subarray (i.e., the number of inversions). The reason this works is that
 both the left and right subarrays are sorted in non-decreasing order, so if a[i] > a[j], where j is an
  index in the right subarray, then all elements from a[i] to a[mid] will also be greater than a[j.

For example, let's say the left subarray is [4, 6, 9] and the right subarray is [1, 3, 8], and we are
 comparing the first element of the left subarray (i.e., a[i] = 4) with the elements of the right subarray.
  In this case, mid is the index of the last element in the left subarray (i.e., mid = 2). Now, i = 0, and we
  compare a[i] with all the elements in the right subarray:

a[i] > a[0], so there are 3 inversions (all elements in the right subarray are less than 4).
a[i] > a[1], so there are 3 inversions (all elements in the right subarray are less than 4).
a[i] < a[2], so there are 0 inversions (no element in the right subarray is less than 4).
The total number of inversions is 3 + 3 + 0 = 6, which correctly counts all the inversions between the two
subarrays.

+=: It is the shorthand for the addition assignment operator. It adds the value on the right side of the
operator to the variable on the left side and assigns the result back to the variable.

So, the line inversions += (mid - i + 1); increments the inversions variable by the number of inversions
found while merging the two subarrays. This process ensures that the function can accurately count all the
inversions in the array during the merge sort algorithm.




*/
    static int inversions=0;

    static void mergeSort(long a[],long l,long h)
    {
        if (l<h)
        {
            long mid=(l+h)/2;
            mergeSort(a,l,mid);
            mergeSort(a,mid+1,h);
            merge(a,l,mid,h);
        }
    }
    static void merge(long a[],long l,long mid,long h)
    {

        long b[]=new long[a.length];
        long i=l;//for left subarray
        long j=mid+1;// j is for right subarray
        long k=l;// for the b array
        while (i<=mid&&j<=h)
        {
            if (a[(int) i]<a[(int) j])
            {
                b[(int) k]=a[(int) i];
                i++;
            }else {

                b[(int) k]=a[(int) j];
                j++;
                inversions += (mid - i + 1);

            }
            k++;
        }
        //agr left side ka sara element b array fill ho gya hai toh right side wale element
        // ko b array me add karo
        if (i>mid)
        {
            while(j<=h)
            {
                b[(int) k]=a[(int) j];
                k++;
                j++;

            }
        }
        //agr right side ka sara element b array fill ho gya hai toh left side wale element
        // ko b array me add karo
        else {
            while (i<=mid)
            {
                b[(int) k]=a[(int) i];
                k++;
                i++;
            }
        }
        for ( i = l; i <=h; i++) {
            a[(int) i]=b[(int) i];
        }

    }

    static void countInv(int a[]){

        int count=0;
        int n=a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (a[i]>a[j]){
                    System.out.println(a[i]);
                    count++;
                }

            }

        }
        System.out.println(count);


    }

    public static void main(String[] args) {

        /*Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5
has three inversions (2, 1), (4, 1), (4, 3).*/
       long[] arr = {468L, 335L, 1L, 170L, 225L, 479L, 359L,463L, 465L, 206L, 146L, 282L, 328L,
               462L, 492L, 496L, 443L, 328L, 437L, 392L, 105L, 403L, 154L, 293L, 3L,83, 422L, 217L, 219L,
               396L, 448L, 227L, 272L, 39L, 370L, 413L, 168L, 300L, 36L, 395L, 204L, 312L, 323L};
       // countInv(arr);
        long n= arr.length;
        mergeSort(arr,0, n-1);
        System.out.println(inversions);

    }
}
