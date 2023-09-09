package Accenture;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class autobibliography {
    static int auto(String s){
        HashSet<String>hs=new HashSet<>();
        HashMap<String,Integer>hm=new HashMap<>();

        int k=0;
        int count=0;
        // Counting character frequencies
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hm.put(String.valueOf(c), hm.getOrDefault(String.valueOf(c), 0) + 1);
        }
        System.out.println(hm);
        StringBuilder ne= new StringBuilder();
        for (Map.Entry<String,Integer>entry: hm.entrySet()){
            ne.append(entry.getKey());
        }
        System.out.println(ne);
        for (int i = 0; i <s.length() ; i++) {
            hs.add(String.valueOf(s.charAt(i)));

        }
        // Compare HashSet and StringBuilder content
        String hsContent = String.join("", hs);
        String neContent = ne.toString();
        System.out.println("hs"+hsContent);
        System.out.println("ne"+neContent);

         if(hsContent.equals(neContent)){
             return hs.size();
        }
        return 0;

    }

    public static void main(String[] args) {
        String s="72110";

        System.out.println(auto(s));
    }
}
