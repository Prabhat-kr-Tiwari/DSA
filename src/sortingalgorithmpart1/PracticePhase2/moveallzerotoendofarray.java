package sortingalgorithmpart1.PracticePhase2;

public class moveallzerotoendofarray {
    static void move(int a[]){
        int n=a.length;
        int[] newarrray = new int[n];
        int j=0;
        for (int i = 0; i <n ; i++) {
            if (a[i]>0){
                newarrray[j++]=a[i];
            }

        }
        printArray(newarrray);

    }
    static void printArray(int a[]){
        for (int e:a
        ) {
            System.out.print(e+" ");
            // System.out.println();

        }
    }

    public static void main(String[] args) {
        int a[]={8,0,1,3,0,0,5};
        move(a);
        //printArray(a);
    }
}
