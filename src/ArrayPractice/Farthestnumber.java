package ArrayPractice;

public class Farthestnumber {
    static void farthestnumber(int a[],int n){
        int currsmallest=0;
        int currnum=0;
        int index=0;
        int b[]=new int[n];
        int k=0;
        for (int i = 0; i < n; i++) {

            currnum=a[i];
            currsmallest=-1;
            for (int j = i+1; j <n ; j++) {
                if(a[j]<currnum){
                    currsmallest=a[j];
                    index=j;

                }



            }
            if(currsmallest==-1)
            {
                b[k++]=-1;
            }else{
                b[k++]=index;
            }

            if(i==n-1){
                index=-1;
                currsmallest=-1;
                b[n-1]=-1;
            }
           System.out.println("index     "+ index+"      "+"currsmallest     "+  currsmallest);


        }
        for (int e:b
             ) {
            System.out.println(e);

        }


    }

    public static void main(String[] args) {
        int a[]={0, 6, 0};
        farthestnumber(a,a.length);
        /*Input:
N=5
Arr[] = {3, 1, 5, 2, 4}
Output:
3 -1 4 -1 -1
Explanation:
Arr[3] is the farthest smallest element
to the right of Arr[0].
Arr[4] is the farthest smallest element
to the right of Arr[2].
And for the rest of the elements, there is
no smaller element to their right.*/

    }
}
