package Array3.PracticeProblems;

public class rotateAnArrayByDPlace {

    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        int temp[]=new int[d];

        d=d%n;
        for(int i=0;i<d;i++)
        {
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=n-d;i<n;i++)
        {
            arr[i]=temp[i-(n-d)];
        }
    }
}
