package JavaCollectionFramework.LearningAbstraction;

public class Abstraction {
    public static void main(String[] args) {
        employee obj=new employee();
        Person obj1=new employee();
        Person ob=obj;
        LivingBeing lobj=obj;
        //Person p1=new Person(); interface cannot be instantiated
        //Vehicle v1=new Vehicle(); they are abstract so we cannot instantiate but using implements class
        //we can instantiate
        Vehicle v1=new scooty();//this is also known as casting
    }
}
//using abstract keyword
abstract class ElectronicItem{
    abstract void battery();
}
abstract class Vehicle{
    // if a method in the class is abstract then the class must be abstract
    abstract void start();
    void breaks(){//cannot achieve two abstraction
        System.out.println("vehicle breaks");
    }
}
class scooty extends Vehicle/*,ElectronicItem*/{
    //ovverride means this method is coming from the anywhere //use for speeling check
    @Override
    void start() {
    }
}
class car extends  Vehicle{
    @Override
    void start() {
    }
}
//using interfaces
//java doesnot support multiple inheritance
//interface support multiple inheritance
interface Person{
    void walk();
}
interface LivingBeing{
    //in iterface methods are by default abstract we do not need to specify explicitly
    //by default they are public and abstract
    abstract void walk();
    void breath();
}
class employee implements Person,LivingBeing{

    @Override
    public void walk() {

    }

    @Override
    public void breath() {

    }
}
class students implements Person{

    //above livingbeing and person have same method in walk but there is no ambiguity because we have to implements
    //our methods in class in which we are implemneting
    @Override
    public void walk() {
        System.out.println("Student walking");
    }
}
