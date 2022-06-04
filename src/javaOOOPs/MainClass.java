package javaOOOPs;
class Animal{
    //properties
    int legs;
    String name;
    static int count;
    void  walk()
    {
        count++;
        System.out.println(name+"is walking");
    }
    void  walk(int steps)
    {
        System.out.println("animal is walking");
    }
    public Animal()
    {
        System.out.println("calling the constructor");
    }
    public Animal(String name)
    {
        System.out.println("was passed while ctreating ");
    }


}

public class MainClass {
    public static void main(String [] args)
    {
        Animal a1=new Animal();
        Animal a2=new Animal("tom");
        a1.name="bob";
        a1.legs=2;
        a1.walk();
        a1.walk(8);
       // System.out.println(a1.name+a1.legs);
        System.out.println(Animal.count);
    }


}
