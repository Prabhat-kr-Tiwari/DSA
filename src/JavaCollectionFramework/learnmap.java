package JavaCollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class learnmap {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("BAll",1);
        map.put("car",3);
        map.put("bat",2);
        map.put("bicket",3);
        map.put("BAll",4);
        map.putIfAbsent("bat",5);
        System.out.println(map);
        System.out.println(map.get("BAll"));
        Set<Map.Entry<String,Integer>> entries=map.entrySet();
        for (Map.Entry<String,Integer>entry:entries)
        {
            System.out.println(entry);

        }
    }
}
