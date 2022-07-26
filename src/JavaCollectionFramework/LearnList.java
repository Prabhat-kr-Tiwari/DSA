package JavaCollectionFramework;

import java.util.ArrayList;

public class LearnList {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(78);
        list.add(32);
        //list.add("hello");

        System.out.println(list);
        System.out.println(list.get(0));
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i)*2);
        }

    }
}
