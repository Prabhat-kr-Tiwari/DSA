package internalworkingofhashmap;

import java.util.Objects;

public class Mainclasas {

    public static void main(String[] args) {
        String s="CAT";
        String s2="ACT";

        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
    }
}
class Student{
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo);
    }

    String name;
    int rollNo;

}
