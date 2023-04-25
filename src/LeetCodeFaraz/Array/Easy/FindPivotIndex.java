package LeetCodeFaraz.Array.Easy;

public class FindPivotIndex {

    public static int pivotIndex(int[] a) {

        int leftsum=0;
        int rightsum=0;
        int n=a.length;
        int i = 0;
        for (; i <a.length ; i++) {
            leftsum=0;
            rightsum=0;
            int x=0;
            while (x<i){
                leftsum+=a[x++];

            }
            int y=i+1;
            while (y<n){
                rightsum+=a[y++];
            }

            /*if (rightsum==leftsum){
                return i;
            }*/
            if (rightsum==leftsum){
                return i;
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        int a[]={1,7,3,6,5,6};
        System.out.println(pivotIndex(a));
    }
}
