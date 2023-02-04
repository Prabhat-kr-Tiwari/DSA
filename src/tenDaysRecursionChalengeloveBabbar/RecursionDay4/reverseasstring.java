package tenDaysRecursionChalengeloveBabbar.RecursionDay4;

public class reverseasstring {


    static String swap(String str, int first, int last) {
        char ch[] = str.toCharArray();
        char temp = ch[first];
        ch[first] = ch[last];
        ch[last] = temp;
        String s = String.copyValueOf(ch);
        return s;
    }

    static String rev(String str, int first, int last) {
        if (str.length() == 0)
            return "";
        if (str.length() == 1)
            return str;
        str = swap(str, first, last);

        return swap(str, first + 1, last - 1);


    }

    public static void main(String[] args) {
        System.out.println(rev("abcd", 0, 2));
    }
}
