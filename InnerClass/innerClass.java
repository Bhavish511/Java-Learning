package InnerClass;



class A
{
    int age;
    public void show(){
        System.out.println("IN A SHOW");
    }
    static class B
    {
        public void config()
        {
            System.out.println("IN A Config");

        }
    }
}

public class innerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // can't access because class is inside the class
        // B obj1 = new B();

        // if we want to create the object of inner class then we need to first specify where it belongs then create the object of outer class, then we can create the object of the inner class
        // Creating object of inner (non-static class)
        
        // A.B obj1 = obj.new B();
        // obj1.config();

        // If You don't want to create the object of outer class then
        // then make the inner class as statc then we can create the object like
        // Static keyword use only for the inner class to make the class static
        A.B obj3 = new A.B();
        obj3.config();
    }
}
