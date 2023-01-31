package Recursion.DoubtRecursion;

public class SubsetSum {

    static boolean subsetsum(int sum,int a[],int N){
        if(sum<0) return false;
        if (N<0) return false;
        if (sum==0) return true;
        return subsetsum(sum-a[N],a,N-1)||subsetsum(sum,a,N-1);
    }
    public static void main(String[] args) {
        int a[]={3,34,4,12,5,2};
        System.out.println(subsetsum(9,a,a.length-1));

    }
}
