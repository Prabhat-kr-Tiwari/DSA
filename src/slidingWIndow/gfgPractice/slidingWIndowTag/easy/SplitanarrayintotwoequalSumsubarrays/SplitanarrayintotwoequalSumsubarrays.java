package slidingWIndow.gfgPractice.slidingWIndowTag.easy.SplitanarrayintotwoequalSumsubarrays;

public class SplitanarrayintotwoequalSumsubarrays {


    static boolean canSplit(int arr[]) {
        // code here
    int sum=0;
    for (int e:arr){
        sum+=e;
    }
    int halfsum=sum/2;
    for (int prefix:arr){
        halfsum-=prefix;
        if (halfsum==0) return true;
    }
    return false;


    }
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 5};
        int arrq[] = {4, 3, 2, 1};

        System.out.println(canSplit(arrq));

    }
}
