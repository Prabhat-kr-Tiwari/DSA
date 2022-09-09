package HashingBasic;

import java.util.HashSet;

public class countdistinctelement {
    static int CountDistinctElement(int a[]){
        HashSet<Integer>set=new HashSet<>();
        for (int e:a
             ) {
            set.add(e);
        }
        System.out.println(set);
        return set.size();
    }
    public static void main(String[] args) {
        int a[]={1,1,2};
        System.out.println(CountDistinctElement(a));
    }
}
