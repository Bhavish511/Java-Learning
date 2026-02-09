package TypeCasting;

class A{
    public void show1(){
        System.out.println("In A Show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("In B Show");
    }

}

public class UpDownCasting {
    public static void main(String[] args) {

        ////// TYPE CASTING
        // double d = 4.5;
        // System.out.println(d);
        // // Type Cast Double into the integar value loss the precision
        // int i = (int) d;
        // System.out.println(i);


        // A obj =  new A();
        // obj.show1();

        // Upcasting --> type of parent -> And object of child and referred to parent        
        // A obj1 = (A) new B();
        // obj1.show1();

        // DownCasting 
        // Parent Refering to the child 
        A obj = new B();

        // obj.show2(); // Error because the object is created of a parent class, that means the parent doesn't have the access to its child but the child had access to its parents
        B obj3 = (B) obj;
        obj3.show2();

        // Above the first creating obj of A parent and refered to Child
        // and then Create the object of B child and refered to object created of parent with refered child
    }
}
