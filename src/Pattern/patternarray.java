package Pattern;


public class patternarray {
    public static void main(String[] args) {
        int[] arr = {5, 0, 1, 3};

        for (int i = 0; i < arr.length; i++) {
            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = i; k < arr.length; k++) {
                if (k != arr.length - 1) {

                    System.out.print("a"+arr[i] + "");
                } else {
                    System.out.print("b"+arr[i]);
                }
            }

            System.out.println();
        }
    }
}

