package Pattern;


public class pattern7 {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 0; i < rows; i++) {
            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = i; k < rows; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

