package GreedyAlgorithm.Practice.Easy;

public class BitMagic {


//    public static int bitMagic(int n, int[] arr) {
//        // code here
//        int i = 0;
//        int j = n-1;
//        int count=0;
//
//
//        while (i < j) {
//            if (arr[i] == 0 && arr[j] == 1 || arr[i] == 1 && arr[j] == 0) {
//                arr[i] = arr[i] ^ arr[j];
//                arr[j] = arr[i] ^ arr[j];
//
//                count++;
//
//            }
//            i++;
//            j--;
//
//        }
//
//
//        return count>0?count-1:0;
//    }

    public static int bitMagic(int n, int[] arr) {
        // code here
        int i = 0;
        int j = n-1;
        int count=0;



        while (i<j){
            if (arr[i]!=arr[j]){
                count++;
            }
            i++;
            j--;

        }
        if (count%2==0) return count/2;
        return count/2+1;
    }


    public static void main(String[] args) {
//        System.out.println(0^0);

        int a[]={1,1,1,0,0,1,0,1,1};
        System.out.println(bitMagic(a.length,a));

    }
}
