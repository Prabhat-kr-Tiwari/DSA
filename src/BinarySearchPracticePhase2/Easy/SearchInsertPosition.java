package BinarySearchPracticePhase2.Easy;

public class SearchInsertPosition {


    static int search(int a[],int target){

        int l=0;
        int r=a.length-1;
        while (l<=r){
            int mid=l+(r-l)/2;
            if (a[mid]==target){
                return mid;
            } else if (target>a[mid]) {
                l=mid+1;

            }else {
                r=mid-1;

            }
        }
        return l;
    }
    public static void main(String[] args) {
        int a[]={0,3,5,6};
        System.out.println(search(a,7));

    }
}
