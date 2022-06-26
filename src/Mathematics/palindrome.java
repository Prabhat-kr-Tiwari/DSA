package Mathematics;

public class palindrome {
    static boolean palindromeNumber(int n){
        int rev=0;
        int temp=n;
        while (temp>0)
        {
            int ld=temp%10;
            rev=rev*10+ld;
            temp=temp/10;
        }
        return n==rev;
    }

    public static void main(String[] args) {

        System.out.println(palindromeNumber(1221));
    }
}
