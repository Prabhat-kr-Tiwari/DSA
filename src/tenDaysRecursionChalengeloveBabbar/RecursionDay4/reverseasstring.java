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
    static String reverseStringUsingRecursion(String str,int first,int last)
    {
        if (first>last)
            return str;
        char ch[]=str.toCharArray();

        swapn(ch,first,last);
        first++;
        last--;
         return reverseStringUsingRecursion(str,first,last);

        //System.out.println(str);

    }
    static void swapn(char ch[], int first, int last) {
        //char ch[] = str.toCharArray();
        char temp = ch[first];
        ch[first] = ch[last];
        ch[last] = temp;
        //String s = String.copyValueOf(ch);

    }
    public static String reverse(String str, int i, int j) {
        System.out.println(str);
        // base case
        if (i > j) {
            return str;
        }
        // swap characters at i and j
        char[] chars = str.toCharArray();
        /*char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;*/
        swapn(chars,i,j);
        i++;
        j--;

        // recursive call
        return reverse(new String(chars), i, j);
    }
    public static void main(String[] args) {
        String s="abcde";
        //System.out.println(rev(s, 0, s.length()-1));

        String name = "abcde";
        s = reverse(s, 0, s.length() - 1);
       System.out.println(s);



    }
}






