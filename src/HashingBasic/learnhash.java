package HashingBasic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class learnhash {
    public static void main(String[] args) {
       /* HashMap<String ,String >hashMap=new HashMap<>();
        hashMap.put("one ","1");
        hashMap.put("two","2");
        System.out.println(hashMap);
        HashSet<Integer > hashSet=new HashSet<>();
        hashSet.add(6);
        hashSet.add(89);
        hashSet.add(78);*/

        ///shallow checking
        Set<student> rollcall=new HashSet<>();
        student s1=new student(1,"prabhat");
        student s2=new student(2,"prabhu");
        student s3=new student(3,"bhat");
        student s4=new student(4,"sonu");
        rollcall.add(s1);
        rollcall.add(s2);
        rollcall.add(s3);
        rollcall.add(s4);

        System.out.println(rollcall);
        student s5=new student(4,"sonu");
        rollcall.add(s5);
        System.out.println(rollcall);
    }

}
class student{
    int rollNo;
    String name;

    public student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public String toString(){
        return "["+name+", "+rollNo+"]";
    }
}

