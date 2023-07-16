package PrepInsta.Top100Codes.ImportantCodesrelatedtoArrays;

import java.util.HashSet;

public class reverseString {

    static void removeduplicates(String s){


        char []n=s.toCharArray();
        HashSet<Character>str=new HashSet<>();
        for (char x:n
             ) {
            str.add(x);

        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        String s="Prabhat";
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        sb.reverse();
        System.out.println(sb);
        removeduplicates(s);
    }
}
