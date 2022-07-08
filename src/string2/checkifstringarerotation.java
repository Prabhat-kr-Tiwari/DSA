package string2;

public class checkifstringarerotation {

    static boolean rotation(String s1,String s2)
    {
        if(s1.length()!=s2.length())return false;
        String doubles=s1+s2;
        if (doubles.contains(s2))return true;

        return false;
    }
    public static void main(String[] args) {
        System.out.println(rotation("abcd","cdab"));
    }
}
