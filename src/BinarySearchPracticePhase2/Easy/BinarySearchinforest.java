package BinarySearchPracticePhase2.Easy;

public class BinarySearchinforest {


    static void binary(int a[],int k){
        int l=0;
        int leftans=0;
        int rightans=0;
        int z=1;
        int r=a.length-1;
        while (l<=r){
            int mid=l+(r-l)/2;

            for (int i = 0; i <mid ; i++) {
                leftans+=a[i]-z;

            }
            System.out.println(leftans);
            for (int i = mid; i <r ; i++) {
                rightans+=a[i]-z;

            }
            System.out.println(rightans);
            if(leftans>k){
                r=mid-1;
            }else {
                l=mid+1;
            }
            z++;
        }




    }
    public static void main(String[] args) {
        int a[]={2,3,6,2,4};
        binary(a,4);


    }
}
