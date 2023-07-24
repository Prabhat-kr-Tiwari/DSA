package Top100Codes.ImportantCodesrelatedtoArrays;
/*Explanation :
        We are given with an array pairs, inside that array some symmetric pairs exist.
        The problem statement says that we have to find all symmetric pairs that exist in array.
         we can simply use two loops and traverse the 2d array.
        Example,
        Input : arr[5][2] = {{10,20}, {30,40}, {50,60}, {20,10}, {40,30}}
        Output : (10,20) (30,40)*/

import java.util.HashMap;

class Pair{
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
public class SymmetricElementsinanArray {
    static void symmetric(int a[][]){
        for (int i = 0; i <a[0].length ; i++) {
            for (int j = i+1; j <a[0].length ; j++) {
                if (a[i][0]==a[j][1]&&a[i][1]==a[j][0])
                    System.out.println("(" + a[i][0] + ", " + a[i][1] + ")");

            }

        }


    }
    public static void main(String[] args) {
        int arr[][] = new int[5][2];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        arr[2][0] = 5;
        arr[2][1] = 1;
        arr[3][0] = 4;
        arr[3][1] = 3;
        arr[4][0] = 1;
        arr[4][1] = 5;
        symmetric(arr);

    }
}
