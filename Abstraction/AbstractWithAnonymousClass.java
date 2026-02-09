package Abstraction;

abstract class A{
    public abstract void show();
}
public class AbstractWithAnonymousClass {
    public static void main(String[] args) {
        // it throws error, because we can't create the object of an abstract class.
        // A obj = new A();

        // created the object of a anonymous class
        A obj = new A(){
            public void show()
            {
                System.out.println("In Anonymous class");
            }
        };

        obj.show();
    }
}
