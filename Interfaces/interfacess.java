package Interfaces;

///// Interfaces is not a class.
/// In the interfaces every method is public abstract method.
/// interfaces means---> construct the class in which all the methods are public abstract methods.
/// We can't instanciate it like abstract class.
/// No error while creating reference like interfaceName referenceName;
/// Interfaces says i will tell you what are the methods you need, but now implement it, its your (class) job to implement them for you.

/// In the interfaces all the variable are STATIC AND FINAL 
/// Because---> we don't instantiate the interface
/// Class implements {not extends} the interfaces ( so we get only methods not variables)
/// Interfaces don't have own memory in the heap
/// If you don't have memory how can you have non-final memory!!!!!!!!!


/////// A class implements multiple interfaces
//// but Class should define all the methods of each interface.


///// interfaces inheritance achieved by etends keyword
/// 
/// 

// class - class --> extends
// class - interface --> implements
// interface - interface -> extends

interface Abst
{
    // variable in interfaces are STATIC AND FINAL
    int age=44;  // FINAL AND STATIC
    String area="karachi"; // FINAL AND STATIC
    void show();
    void config();
}
interface X
{
    void run();
}

interface Y 
{

}
class B implements Abst,X
{
    public void show(){
        System.out.println("In Show");
    }
    public void config(){
        System.out.println("In config");

    }
    public void run()
    {
        System.out.println("In Run");
    }
}

public class interfacess {
    public static void main(String[] args) {
        Abst obj;
        obj = new B();
        obj.show();
        // B obj = new B();
        // obj.show();

        // WE DIRECTLY ACCESS THE INTERFACE Variable through interface name, doesn't require object.

        System.out.println(Abst.age);

        // We can't change the value of variable
        // Abst.area = "Hydrabad";
    }
}
