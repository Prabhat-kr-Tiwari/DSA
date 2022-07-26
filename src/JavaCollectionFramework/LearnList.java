package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class LearnList {

    public static void main(String[] args) {
    /*    ArrayList<Integer> list=new ArrayList<>();*/
        Stack<Integer> list=new Stack<>();
        list.add(78);
        list.add(32);
        list.add(8);
        list.add(2);
        //list.add("hello");

        System.out.println(list);
        System.out.println(list.get(0));
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i)*2);
        }
        for (int e:list)
        {
            System.out.println(e*2);
        }
        Iterator<Integer> it= list.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        list.set(0,2);//o(1)
        System.out.println(list);
        list.remove(3);//o(n)
        System.out.println(list);
        list.add(3,44);
        System.out.println(list);
        System.out.println(list.contains(null));
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(0,2);
        list1.addAll(list);
        System.out.println(list1);
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addAll(list1);
        System.out.println(linkedList);


    }
}
