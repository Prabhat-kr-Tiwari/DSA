package GreedyAlgorithm.Practice.Medium;

public class Minimumnumberofjumps {

   /* static void minJumps(int[] arr){
        // your code here
        int k=0;
        int count=0;
        int i=0;
       while (i<=arr.length){
           System.out.println("i"+i);
           i+=arr[i];

           count++;
           if(i== arr.length-1){
               count=count-1;
           }
       }
        //System.out.println(i);
        System.out.println(count);
    }*/
    static int minJumps(int[] arr){
        // your code here
        if (arr.length<=1){
            return 0;
        }
        if (arr[0]==0){
            return -1;

        }

        int maxReach=arr[0];
        int steps=arr[0];
        int jumps=1;
        for (int i = 1; i < arr.length; i++) {
            if (i==arr.length-1){
                return jumps;
            }
            maxReach=Math.max(maxReach,i+arr[i]);
            steps--;
            if (steps==0){
                jumps++;
                if(i>=maxReach){
                    return -1;
                }
                steps=maxReach-i;
            }

        }
        return -1;


    }

    public static void main(String[] args) {
        int N = 11;
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
//        Output: 3
        System.out.println(minJumps(arr));


    }
}
