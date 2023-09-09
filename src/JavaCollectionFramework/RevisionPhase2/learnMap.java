package JavaCollectionFramework.RevisionPhase2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class learnMap {

    public static void main(String[] args) {
        HashMap<Integer,String>hs=new HashMap<>();
        hs.put(1,"a");
        hs.put(2,"b");
        hs.put(3,"c");
        hs.put(4,"d");
        if (!hs.containsKey(4)){
            hs.put(4,"d");
        }

        //here it updates the previous if key is already presesent
       // hs.put(1,"e");
        hs.putIfAbsent(1,"e");
        System.out.println(hs);
        Set<Map.Entry<Integer,String>> entrySet=hs.entrySet();
        for (Map.Entry<Integer, String> entries:entrySet){
            System.out.print(entries.getKey());

            System.out.print(entries.getValue());
            System.out.println();

        }
    }
}
