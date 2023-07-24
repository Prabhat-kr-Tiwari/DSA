package sortingalgorithmpart1.PracticePhase2;

public class maximumSumSubarray {
    static void  max(int a[]){
        int maxsum=0;
        int currsum=0;
        int n=a.length;
        for (int i = 0; i < n; i++) {
            currsum+=a[i];
            if (currsum<0){
                currsum=0;
            }
            if (currsum>maxsum)
            {
                maxsum=currsum;
            }

        }
        System.out.println(maxsum);
    }

    public static void main(String[] args) {
        int a[]={3,-4,2,-3,-1,7,-5};
        max(a);

    }
}
