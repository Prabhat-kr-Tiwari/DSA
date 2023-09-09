package JavaCollectionFramework.RevisionPhase2.Abstraction;

public class Abstraction {
    public static void main(String[] args) {
        employee e=new employee();
        person p=e;
        LivingBeing lobj=e;

        vehicle v=new scooty();

    }
}


//using abstract keyword

abstract class electronicItem {
    abstract void battery();
}

abstract class vehicle {


    abstract void start();
    void brake(){// cannot achieve true abstraction
        System.out.println("Vehicles brakes");
    }

}

class scooty extends vehicle {

    @Override
    void start() {

    }


}

class car extends vehicle {

    @Override
    void start() {

    }
}

//using interfaces

interface person {
    void walk();

}
interface  LivingBeing{
    void walk();
    void breadth();
}

class employee implements person,LivingBeing {

    @Override
    public void walk() {

    }

    @Override
    public void breadth() {

    }
}
