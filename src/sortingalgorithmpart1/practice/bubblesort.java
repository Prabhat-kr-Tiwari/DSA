package sortingalgorithmpart1.practice;

public class bubblesort {
    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }


    static void bubble(int a[],int n){
        int count=0;

        for (int i = 0; i <n-1 ; i++) {
//            boolean isSwapped=false;
            for (int j = 0; j <n-i-1 ; j++) {
//                System.out.println("count");
//                System.out.println(count++);
                if(a[j+1]<a[j]){
//                    isSwapped=true;
                    swap(a,j,j+1);
                }

            }
//            if(!isSwapped) break;

        }

    }

    public static void main(String[] args) {
        int a[]={9,5,2,6,3,1,1};
        bubble(a,a.length);
        for (int e:a
             ) {
            System.out.println(e);

        }

    }
}
