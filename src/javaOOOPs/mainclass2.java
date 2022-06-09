package javaOOOPs;


class Person {
    String name;
    int age;

    static int count;

    Person() {
        count++;
        System.out.println("person is being created");
    }

   Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
        walking(this);
    }

    void walking(Person obj) {
        System.out.println(name+" is walking");
        age += 10;
    }
}

public class mainclass2 {

    public static void main(String[] args) {

       Person p1 = new Person("Anuj", 25);

        System.out.println(p1.name+" "+p1.age);

        /*System.out.println(Person.count);
        Person p1 = new Person();
        System.out.println(Person.count);*/
        /*Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p2.count);*/


    }

}

