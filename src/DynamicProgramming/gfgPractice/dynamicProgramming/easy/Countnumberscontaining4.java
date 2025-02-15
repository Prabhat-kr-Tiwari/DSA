package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

public class Countnumberscontaining4 {

    static int result=0;

    public static int countNumberswith4(int n) {
        if (n==0) return 0;
        int currentNumber=n;
        countNumberswith4(n-1);

        while (currentNumber != 0) {
            System.out.println("number"+currentNumber);
            int currdigit = currentNumber % 10; // Get the last digit
            if (currdigit==4){
                result++;
                System.out.println("currdigit->>>"+currdigit);
                break;
            }
            currentNumber = currentNumber / 10; // Remove the last digit
        }
        return result;
    }

    static void findDigit(int n) {
        while (n != 0) {
            int currdigit = n % 10; // Get the last digit
            System.out.println(currdigit); // Print the current digit
            n = n / 10; // Remove the last digit
        }
    }
    public static int NewcountNumberswith4(int n) {
        if (n==0) return 0;
        int currentNumber=n;
        int result=NewcountNumberswith4(n-1);
        while (currentNumber != 0) {
            int currdigit = currentNumber % 10; // Get the last digit
            if (currdigit==4){
                result++;
                break;
            }
            currentNumber = currentNumber / 10; // Remove the last digit
        }
        return result;
    }
    
    public static void main(String[] args) {

//        System.out.println();
//        findDigit(914);
        System.out.println(countNumberswith4(9));

    }
}
