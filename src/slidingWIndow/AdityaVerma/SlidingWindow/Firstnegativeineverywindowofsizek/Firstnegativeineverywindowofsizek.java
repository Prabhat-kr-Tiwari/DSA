package slidingWIndow.AdityaVerma.SlidingWindow.Firstnegativeineverywindowofsizek;

import java.util.ArrayList;
import java.util.List;

public class Firstnegativeineverywindowofsizek {


    static List<Integer> firstNegIntBruteForce(int arr[], int k) {
        // write code here
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i <=arr.length-k; i++) {
            boolean found = false;
            for (int j  = i; j < i+k; j++) {
                if (arr[j]<0){
                    found=true;
                    ans.add(arr[j]);
                    break;
                }
            }
            if (!found){
                ans.add(0);
            }
        }
        return ans;
    }

    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here

        ArrayList<Integer> negativeNumberList =  new ArrayList<>();
        ArrayList<Integer> ansList =  new ArrayList<>();

        int i=0;
        int j=0;
        int size= arr.length;;
        while (j<size){
            //calculation
            if (arr[j]<0){
                negativeNumberList.add(arr[j] );
            }


            if ((j-i+1)<k){
                j++;
            } else if ((j-i+1)==k) {
                //get ans from calculato
                if (!negativeNumberList.isEmpty()) {

                    ansList.add(negativeNumberList.get(0));
                    //this also works same as maintain window size
                   /* if (arr[i]==negativeNumberList.get(0)){
                        negativeNumberList.remove(0);
                    }*/
                }else {
                    ansList.add(0);
                }


                //maintain window size
                // maintain window: remove only if the outgoing element is the same as the first negative
                if (!negativeNumberList.isEmpty() && arr[i] == negativeNumberList.get(0)) {
                    negativeNumberList.remove(0);
                }

                //slide
                i++;
                j++;

            }
        }
        return ansList;


    }
    public static void main(String[] args) {

      int[]  arr = {-8, 2, 3, -6, 10};
        int k = 2;
        System.out.println(firstNegIntBruteForce(arr,k));
        System.out.println(firstNegInt(arr,k));
    }
}
