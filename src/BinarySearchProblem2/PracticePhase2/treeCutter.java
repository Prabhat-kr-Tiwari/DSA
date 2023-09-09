package BinarySearchProblem2.PracticePhase2;

public class treeCutter {


    static boolean isEnough(int a[],int k,int cut){
        int total=0;
        for (int i = 0; i <a.length ; i++) {

            if (a[i]>cut){
                total+=a[i]-cut;

            }

        }
        return total>=k;
    }




    static int TreeCutter(int a[],int k){
        int l=0;
        int ans=-1;
        int r=-1;
        for (int e:a
             ) {
            r=Math.max(e,r);

        }
        while (l<=r){

            int mid=(l+r)/2;
            if (isEnough(a,k,mid)){
                ans=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int a[]={6,5,10,9,2,4,9,5};
        System.out.println(TreeCutter(a,13));

    }
}
