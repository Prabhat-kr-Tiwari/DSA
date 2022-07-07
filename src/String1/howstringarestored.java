package String1;

import java.util.Locale;

public class howstringarestored {

    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        String s3=new String("Hello");
        //== check the reference of it ,it won't check what stored in it
        System.out.println(s1==s2);
        System.out.println(s1==s3);

        //String are immutable once created they never change
        //if we change then a new string is created
        String s4=s1+"abc";
        System.out.println(s4);
        String s5=s1.concat("a").replace("H","e");
        System.out.println(s5);
        System.out.println(s1);
        System.out.println(s1.equals(s3));

        s1.toLowerCase(Locale.ROOT);
        System.out.println(s1);

    }
}
