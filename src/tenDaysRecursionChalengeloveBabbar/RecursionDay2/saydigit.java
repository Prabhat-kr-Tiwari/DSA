package tenDaysRecursionChalengeloveBabbar.RecursionDay2;

public class saydigit {

    static void say(int n) {
        String s = "";
        if (n == 0) return;
        String arr[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        while (n != 0) {
            int digit = n % 10;
            n = n / 10;
            //if (arr[digit])
            // s=s.concat(arr[digit-1]);
            s = arr[digit - 1] + s;
            //System.out.println(arr[digit - 1]);
        }
        System.out.println(s);
    }

    static void sayUsingRecursion(int n, String arr[]) {
        if (n == 0)
            return;
        int digit = n % 10;
        n = n / 10;
        sayUsingRecursion(n, arr);
        System.out.println(arr[digit]);
    }

    public static void main(String[] args) {
        String arr[] = {"Zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        sayUsingRecursion(23, arr);

    }
}
