package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

public class Charulandvessels {

    static boolean canFillContainer(int[] arr, int k) {
        // code here
        boolean found=false;
        for (int i = 0; i < arr.length; i++) {
            int quotient=k/arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (quotient==arr[j]){
                    found=true;
                }

            }
        }
        return found;
    }

    public static void main(String[] args) {
       int  arr[] = {6, 3, 4, 2, 1};
       int k = 20;
     int    ar[] = {2, 4, 3};
     int q = 15;
        System.out.println(canFillContainer(ar,q));
    }
}
