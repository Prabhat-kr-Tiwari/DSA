package ArrayPractice;

public class LastindexofOne {
    public static int lastIndex(String s) {
        int n=s.length();
        for (int i = n-1; i >=0; i--) {
           // System.out.println(s.charAt(i));
            if (s.charAt(i)=='1'){

                return i;
            }

        }
        return -1;


    }

    public static void main(String[] args) {
        System.out.println(lastIndex("00001"));

    }
}
