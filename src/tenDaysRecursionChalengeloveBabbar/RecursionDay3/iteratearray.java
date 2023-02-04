package tenDaysRecursionChalengeloveBabbar.RecursionDay3;

public class iteratearray {
    static void iterateArray(int[] array, int index) {
        if (index == array.length) {
            return;
        }
        System.out.println(array[index]);
        iterateArray(array, index + 1);
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        iterateArray(array, 1);

    }



}

