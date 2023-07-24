package Top100Codes.HappiestMind;

import java.util.Arrays;

public class permutationoftwoarrayareequal {
    static void permutation(int a1[],int a2[]){
        Arrays.sort(a1);
        Arrays.sort(a2);
        boolean arePermuation=Arrays.equals(a1,a2);
        if (arePermuation){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }


    public static void main(String[] args) {
        int []a1={1,2,5,3,7,0,7,3,5,2,1};
        int []a2={7,3,1,2,5,0,5,2,1,3,7};
        permutation(a1,a2);
    }
}
