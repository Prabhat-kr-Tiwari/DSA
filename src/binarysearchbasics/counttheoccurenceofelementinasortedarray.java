package binarysearchbasics;

import java.util.ArrayList;

public class counttheoccurenceofelementinasortedarray {

    static int leftOccurence(int a[], int key)
    {
        int l=0;
        int left=-1;
        int r=a.length-1;
        while (l<=r)
        {
            //System.out.println("l="+l+"  "+"r="+r );
            int mid=(l+r)/2;
            //System.out.println("mid"+mid);
            if (a[mid]==key)
            {
                left=mid;
                r=mid-1;

            }
            else if (key>a[mid])
            {
                l=mid+1;
            }
            else {
                r=mid-1;
            }

        }
        return left;
    }
    static int lastOccurence(int a[], int key)
    {
        int l=0;
        int right=-1;
        int r=a.length-1;
        while (l<=r)
        {
            //System.out.println("l="+l+"  "+"r="+r );
            int mid=(l+r)/2;
            //System.out.println("mid"+mid);
            if (a[mid]==key)
            {
                right=mid;
                l=mid+1;

            }
            else if (key>a[mid])
            {
                l=mid+1;
            }
            else {
                r=mid-1;
            }

        }
        return right;
    }

    static int countoccurence(int[] nums, int target) {
       /* ArrayList<Integer> al=new ArrayList<>();*/


        int left=leftOccurence(nums,target);
       /* al.add(x);*/
        int last=lastOccurence(nums,target);
        /*al.add(y);*/
        /*int[] arr = al.stream().mapToInt(i -> i).toArray();

        return arr;*/
        int y=last-left+1;
        return y;



    }

    public static void main(String[] args) {
        int a[]={1,2,4,4,4,5,9,9,11,11,11,14};
        System.out.println(countoccurence(a,11));
        int count=0;
        int key=11;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==key)
            {
                count++;
            }


        }
        System.out.println(count);


    }
}
