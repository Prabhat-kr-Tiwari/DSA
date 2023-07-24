package ArrayPractice;

public class Replaceallzeroswithfive {

    static int convertfive(int num) {
        // Your code here

        int temp = num;
        int digit = 0;
        int x = num;
        int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        int arr[] = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            arr[i] = x % 10;
            x = x / 10;
        }
        int index = 0;
       /* while (x != 0) {
            digit = x % 10;
            arr[index++] = digit;
            x = x / 10;
        }*/
        for (int i = 0; i < count; i++) {
            if (arr[i] == 0) {
                arr[i] = 5;
            }

        }
        for (int e : arr
        ) {
            System.out.println(e);

        }
        int number = 0;
        for (int digi : arr) {
            number = number * 10 + digi;
        }
        return number;


    }

    public static void main(String[] args) {
        System.out.println( convertfive(10004));

    }
}
