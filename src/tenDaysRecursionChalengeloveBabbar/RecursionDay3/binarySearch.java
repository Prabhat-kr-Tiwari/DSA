package tenDaysRecursionChalengeloveBabbar.RecursionDay3;

public class binarySearch {
    static void print(int ar[],int s,int e)
    {
        for (int i = s; i <=e ; i++) {
            System.out.print(ar[i]+" ");

        }
        System.out.println();
    }

    static boolean bs(int ar[],int s,int e,int key)
    {
        print(ar,s,e);
        if (s>e)
            return false;
        int mid=(s+e)/2;
        if (ar[mid]==key)
            return true;
        if (ar[mid]<key)
        {
            return bs(ar,mid+1,e,key);

        }else {
            return bs(ar, s, mid-1, key);
        }
    }

    public static void main(String[] args) {
        int ar[]={1,2,3,4,5};
        int key=5;
        System.out.println(bs(ar,0, ar.length-1, key));

    }
}
