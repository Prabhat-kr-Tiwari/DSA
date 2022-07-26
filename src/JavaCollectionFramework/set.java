package JavaCollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {
        Set<String>set=new HashSet<>();
        set.add("Apple");
        set.add("orange");
        set.add("Apple");
        set.add("Banana");
        set.add("Kiwi");
        System.out.println(set);
        TreeSet<String>treeSet=new TreeSet<>();//treeset sort the element
        treeSet.addAll(set);
        System.out.println(treeSet);
        LinkedHashSet<String> linkedHashSet=new  LinkedHashSet<>();//it maintains the order
        linkedHashSet.addAll(set);
        System.out.println(linkedHashSet);


        Set<String>set1=new HashSet<>();
        set1.add("Apple");
        set1.add("orange");

        set1.add("Kiwi");
        set.removeAll(set1);
        System.out.println("set1"+set1);
        System.out.println("set"+set);


    }

}
