package sortingalgorithmpart1.PracticePhase2;

public class subarraywith0sum {

    static void sum(int a[]){
        int sum=0;

        int n=a.length;
        int start=0;
        int end=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                sum+=a[j];
                start=i;
                end=j;
                if (sum==0){
                    System.out.println("True");
                    System.out.println("i:"+i);
                    System.out.println("J:"+j);
                }


            }

        }
        //System.out.println("false");

    }

    public static void main(String[] args) {
        int a[]={2,3,1,-4,3};
        sum(a);


    }
}
