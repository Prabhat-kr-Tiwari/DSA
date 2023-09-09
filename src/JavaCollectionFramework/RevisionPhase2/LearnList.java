package JavaCollectionFramework.RevisionPhase2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LearnList {

    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        al.add(23);
        al.add(3);
        al.add(2);
        al.add(32);
        al.add(null);
        al.set(0,89);

        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
       /* for (int i = 0; i <al. size(); i++) {
            System.out.println(al.get(i)*2);

        }
        for (int e:al
             ) {
            System.out.println(e*2);

        }
        System.out.println("---------------Iterator-------------");
        Iterator<Integer>it= al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/
        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        al.remove(0);
        System.out.println(al);
        System.out.println(al.get(0));
        System.out.println(al.contains(null));
        al.addAll(list2);
        System.out.println(al);
        System.out.println("Linked List"+linkedList);
    }
}
