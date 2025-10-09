package leetcode75.ArraysString.CanPlaceFlowers;

public class CanPlaceFlowers {


    static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean canPlacePrev = (i == 0) || (flowerbed[i - 1] == 0);
                boolean canPlaceAfter = (i==flowerbed.length-1) || (flowerbed[i + 1] == 0);
                if (canPlaceAfter&&canPlacePrev){
                    flowerbed[i]=1;
                    count++;
                }
            }

        }
        return count >= n;
    }

    public static void main(String[] args) {
       int [] flowerbed = {1,0,0,0,1};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed,n));
    }


}
