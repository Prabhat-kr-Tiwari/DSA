package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Minimuminsertionstosortanarray {


    static int minInsertions(int arr[], int N)
    {
        //code here.
        int count=0;
        int newArray[]=new int[N];
        for (int i = 0; i < arr.length; i++) {
            newArray[i]=arr[i];
        }


        for (int i = 0; i <newArray.length -1; i++) {

            if(newArray[i+1]<newArray[i]){
                System.out.println(newArray[i+1]);
                System.out.println(i);
                count++;
                int firstIndex=i;
                int secondIndex=i+1;
                Arrays.sort(newArray,firstIndex,secondIndex);
            }
        }
        System.out.println(Arrays.toString(Arrays.stream(newArray).toArray()));
        System.out.println("count "+count);
        return 1;

    }
    public static void main(String[] args) {

       int arr[] = {2, 3, 5, 1, 4, 7, 6};
        System.out.println(minInsertions(arr,arr.length));
    }
}
