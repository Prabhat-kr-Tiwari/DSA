package String1.practice;

public class printdigittostring {

    public static void main(String[] args) {
        int num = 32;
        String str = "";
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            str = getString(digit) + str;
            temp /= 10;
        }
        System.out.println(str);
    }

    static String getString(int n) {
        switch (n) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 0:
                return "Zero";
            default:
                return "Wrong Number";
        }
    }
}
