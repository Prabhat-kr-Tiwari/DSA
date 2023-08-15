package BinarySearchPracticePhase2.Easy;

public class SearchInsortedrotatedarray {


    static int search(int a[],int target){

        int l=0;
        int r=a.length-1;
        while (l<=r){
            int mid=l+(r-l)/2;

            if(a[mid]==target){
                return 1;
            }
            //left part sorted hai
            if (a[l]<=a[mid]){

                if (target<a[mid]&&target>=a[l]){
                    r=mid-1;
                }else {
                    l=mid+1;
                }

            }else{
                if (target>a[mid]&&target<=a[r]){
                    l=mid+1;
                }else {
                    r=mid-1;
                }

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={3,1};
        System.out.println(search(a,1));


    }
}
