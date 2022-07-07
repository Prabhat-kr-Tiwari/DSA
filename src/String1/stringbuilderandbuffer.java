package String1;

public class stringbuilderandbuffer {
    public static void main(String[] args) {

        String a="ok";
        a.concat("HI");
        StringBuilder sb=new StringBuilder("hello");
        System.out.println(sb);
        sb.replace(0,4,"john");
        sb.append("HI");
        System.out.println(a);
        System.out.println(sb);
    }
}
