package JavaCollectionFramework.RevisionPhase2;

import java.util.HashSet;

public class LearnSet {

    public static void main(String[] args) {
        HashSet<String>hashSet=new HashSet<>();
        hashSet.add("a");
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");
        hashSet.add("b");
        System.out.println(hashSet);
    }
}
