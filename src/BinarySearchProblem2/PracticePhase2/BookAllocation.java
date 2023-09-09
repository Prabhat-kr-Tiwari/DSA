package BinarySearchProblem2.PracticePhase2;

public class BookAllocation {


    static boolean isSafe(int a[],int k,int pages){
        int student=0;
        int cur=a[0];
        for (int i = 1; i <a.length ; i++) {

            if (a[i]>pages) return false;
            cur+=a[i];
            if (cur>pages){
                student++;
                cur=a[i];

            }

        }
        if(cur>pages) return false;
        return student<=k;
    }

    static int books(int a[],int k){
        int pages=0;
        int l=0;
        int r=0;
        for (int e:a
             ) {
            r+=e;

        }

        while (l<=r){
            int mid=(l+r)/2;
            if (isSafe(a,k,mid)){
                pages=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return pages;
    }
    public static void main(String[] args) {
        int a[]={3,1,4,7,2,5,2,9};
        System.out.println(books(a,2));

    }
}
