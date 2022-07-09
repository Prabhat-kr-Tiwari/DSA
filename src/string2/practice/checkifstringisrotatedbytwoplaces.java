package string2.practice;

public class checkifstringisrotatedbytwoplaces {

    public static boolean isRotated(String str1, String str2)
    {
        if(str1.length()!=str2.length())
            return false;
        int n=str1.length();
        str1=str1+str1;
        int found=str1.indexOf(str2);
        System.out.println(found);
        if(found==2||found==n-2)
            return true;
        return false;

    }


    public static void main(String[] args) {
        String a = "amazon";
        String b = "azonam";
        System.out.println(isRotated(a,b));

    }
}
