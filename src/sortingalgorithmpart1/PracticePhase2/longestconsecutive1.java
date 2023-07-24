package sortingalgorithmpart1.PracticePhase2;

public class longestconsecutive1 {
    static void longest(int a[]){
        int maxlength=0;
        int currlength=0;
        int n=a.length;
        for (int i = 0; i < n; i++) {
            if (a[i]>0){
                currlength++;
            }
            if (a[i]==0){
                currlength=0;
            }
            if (currlength>maxlength){
                maxlength=currlength;
            }

        }
        System.out.println(maxlength);
    }
    public static void main(String[] args) {
        int a[]={1,1,1,0,0,1,0,1,1,1,1,1,0,1};
        longest(a);

    }
}
