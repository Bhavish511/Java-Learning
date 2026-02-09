package Abstraction;

// ABSTRACT
// --> Abstracts method should have Abstract class.
// --> Abstract class does not mandatory to have Abstract methods
// --> The A is extends an Abstract then it should define all the abstract method.
// --> We can't create the object of abstract class
// --> but we can reference the abstract 
// --> Like    Car obj = new WangonR();


//// --> If you don't want to implement the all methods of abstract class then,
/// you can also make the abstract with which methods you want to implement and then,
/// make a new class and extends this from above one,
/// and define those and use them 
/// Like below the Car class had fly method but WagonR doesn't want to implement then we have to make the WagonR to abstract and then,
/// make a new class Updated WagonR to implement drive method
abstract class Car{

    // declaring abstract method
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Music Playing");
    }
}

abstract class WagonR extends Car{
    public void drive(){
        System.out.println("Driving WagonR..");
    }
}

class UpdatedWagonR extends WagonR{ // concrete class
    public void fly(){
        System.out.println("Fly....");
    }
}
public class AbstractKeyWord {
    public static void main(String[] args) {

        // Error because of the Car is abstract class
        // Car obj = new Car();
        // Car obj = new WagonR(); // remove the abstract them we can do
        // Car obj = new WagonR();
        Car obj = new UpdatedWagonR();

        obj.drive();
        obj.playMusic();
    }    
}
