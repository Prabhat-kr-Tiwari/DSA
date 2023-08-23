package BinarySearchPracticePhase2.Medium;

public class SearchAnELementInInfiniteSortedArray {



    static int BinarySearch(int[] a, int target,int l,int r){

        while (l<=r){
            int mid=l+(r-l)/2;
            if (a[mid]==target){
                return mid;
            } else if ( a[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }

    static int search(int[] a, int target){
        if(a.length==0) return -1;
        if (a[0]==target) return 0;
        int index=1;

        while (a[index]<=target){
            index*=2;
        }
        return BinarySearch(a,target,index/2,index);

    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        System.out.println(search(a,16));

    }
}
