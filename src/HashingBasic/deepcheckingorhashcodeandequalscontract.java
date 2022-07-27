package HashingBasic;

import java.util.HashSet;
import java.util.Set;

public class deepcheckingorhashcodeandequalscontract {



    public static void main(String[] args) {


        ///Deep checking or hashcode and equals contract
        Set<Students> rollcall=new HashSet<>();
        Students s1= new Students(1,"prabhat");
        Students s2=new Students(2,"prabhu");
        Students s3=new Students(3,"bhat");
        Students s4=new Students(4,"sonu");
        rollcall.add(s1);
        rollcall.add(s2);
        rollcall.add(s3);
        rollcall.add(s4);

        System.out.println(rollcall);
        Students s5=new Students(4,"sonu");
        rollcall.add(s5);
        System.out.println(rollcall);

       /* //if roll no are same that means student are same
        Students s1= new Students(1,"prabhat");
        Students s2=new Students(1,"prabhu");
        Students s3=s1;
        System.out.println(s1.equals(s2));
        //so here the equals method check the reference

        //hamlogo ko isi ko override karna tha using equals method in Students class
        System.out.println(s3.equals(s1));*/

    }
}
class Students {
    int rollNo;
    String name;

    public Students(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public String toString(){
        return "["+name+", "+rollNo+"]";
    }

    //ab dekho jis jis bande ka hashcode bane ga ab roll no ke hisab se bane ga
    // ab roll no agr doo student ka same hai toh same student nhi toh different student hai
    @Override
    public int hashCode(){
        return rollNo;
    }
   @Override
    public boolean equals(Object object)
    {
        Students students=(Students) object;
        if (this.rollNo==students.rollNo)
        {
            return true;
        }
        return false;
    }

}
