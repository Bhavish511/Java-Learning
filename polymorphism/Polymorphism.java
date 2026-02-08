package polymorphism;
class Computer{

}

class Laptop extends Computer{

}
class A{
    public void show(){
        System.out.println("in A Show");
    }
}
class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}

class C extends A{
    public void show(){
        System.out.println("In C show");
    }
    
}
public class Polymorphism {
    public static void main(String[] args) {
        // Dynamic method dispatch

        // Irrespective what type of object you have,
        // why type of variable you create, but all depends which type of object you define

        // the object of parent but refer to its child
        // The reference of super class and object of sub-class
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj  = new C();
        obj.show();

        // same objects behaves different with different objects
        // Laptop obj = new Computer();
    }
}
