package BinarySearchPracticePhase2.Easy;

public class Findtheclosestnumber {

    static  int ans=Integer.MAX_VALUE;

    static void findClosetNUmber(int a[],int n,int target){
        int l=0;
        int currans=0;
      //  int ans=0;
        int result=0;
        int currmid=0;

        int r=a.length-1;
        while (l<=r){
            int mid=l+(r-l)/2;
            if (a[mid]<target){
                currans=Math.abs(target-a[mid]);

                if (currans<ans){
                    ans=currans;
                     result=a[mid];

                }
                l=mid+1;
            }else {
                currans=Math.abs(target-a[mid]);
                // currmid=a[mid];
               // ans=currans;
                if (currans<ans&&a[mid]>result){
                    ans=currans;
                    result=a[mid];

                }
                r=mid-1;
            }


        }
        ans=currans;
        System.out.println(result);

    }

    static int closet(int[] a, int target){
        int l=0;
        int r=a.length-1;
        int mid= l+(r-l)/2;
        while (l<=r){

            if (a[mid]==target){
                System.out.println(a[mid]);
                return a[mid];

            } else if (a[mid]>target) {
                r=mid-1;

            }else {
                l=mid+1;

            }

            mid = l+(r-l)/2;
        }
        return r;
    }
    static int closest(int[] a, int target) {
        int l = 0;
        int r = a.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (a[mid] == target) {
                return a[mid];
            } else if (a[mid] > target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        // When l == r, we need to check both elements
        if (l > 0 && Math.abs(target - a[l - 1]) < Math.abs(target - a[l])) {
            return a[l - 1];
        }

        return a[l];
    }


    public static int findClosest(int a[], int n, int target) {
        return closest(a, target);
    }


    public static void main(String[] args) {
        //int a[]={1, 1 ,2 ,3 ,4 ,4 ,5 ,5 ,5,5, 7, 7, 7, 11 ,11, 13, 17, 18, 18, 19};
        int a[]={1,3,5,6,7};
        System.out.println(findClosest(a,a.length,4));
        //System.out.println(closet(a,4));
//        int target=3;
//        int result=closet(a,target);
//        if (result==a.length-1){
//            System.out.println("eqaul to length"+a[result]);
//        }else{
//            if (Math.abs(target-a[result])<Math.abs(target-a[result+1])){
//                System.out.println("chota hai"+a[result]);
//            }else {
//                if (a[result]<a[result+1]){
//
//
//                    System.out.println("last"+a[result+1]);
//                }
//            }
//        }

    }
}
