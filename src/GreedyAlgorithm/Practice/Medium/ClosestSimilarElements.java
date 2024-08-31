package GreedyAlgorithm.Practice.Medium;

public class ClosestSimilarElements {

    public static boolean closestSimilarElements(int n, int[] arr, int indexDifference,
                                                 int valueDifference) {

        boolean result=false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
               if(i!=j){
                   if (Math.abs(i-j)<=indexDifference){
                       if (Math.abs(arr[i]-arr[j])<=valueDifference){
                           result=true;
                       }
                   }
               }
            }

        }
        return result;


    }

    public static void main(String[] args) {
      /*  int n = 4;
        int Arr[ ] = {1, 2, 3, 1};
       int indexDifference = 3;
        int valueDifference = 0;*/

         int n = 6;
        int gallery[ ] = {1, 5, 9, 1, 5, 9};
        int indexDifference = 2;
        int valueDifference = 3;
        System.out.println(closestSimilarElements(n,gallery,indexDifference,valueDifference));
    }
}
