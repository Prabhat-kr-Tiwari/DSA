package BinarySearchPracticePhase2.Easy;

public class Indexoffirst1inasortedarrayof0sand1s {


    static int find(int a[]){

        int l=0;
        int ans=0;
        int r=a.length-1;
        while (l<=r){
            int mid=l+(r-l)/2;
            if (a[mid]==1){
                ans=mid;
                r=mid-1;
            } else if (a[mid]>=1) {
                r=mid-1;

            }else {
                l=mid+1;
            }
        }
        return ans;
    }
    public long firstIndex(long a[], long n)
    {
        // Your code goes here
        long l=0;
        long ans=0;
        long r=a.length-1;
        while (l<=r){
            int mid= (int) (l+(r-l)/2);
            if (a[mid]==1){
                ans=mid;
                r=mid-1;
            } else if (a[mid]>=1) {
                r=mid-1;

            }else {
                l=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[]={0,0,0,0,0,1,1,1,1};
        System.out.println(find(a));

    }
}
