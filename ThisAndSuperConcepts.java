/// super()--> Means call the constructor of super class (parent class);
///** Every class in Java Extends the Oject class(We don't mention but it extends)


class A{
    public A(){
        super();
        System.out.println("In A");
    }
    public A(int n){
        super();
        System.out.println("In A int");
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("In B");
    }
    public B(int n){

        this();
        // super();
        // super(n);
        System.out.println("In B int");
    }

    public void show(){
        System.out.println("IN SHOW");
    }
}



public class ThisAndSuperConcepts {
    public static void main(String[] args) {
        B obj = new B();
        // new B(); // anonymous object
        // new B().show(); // anonymous object can use again
        // B obj = new B(5);
        obj.show();
    }
}
