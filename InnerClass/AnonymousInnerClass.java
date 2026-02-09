package InnerClass;


class AnonymousA{
    public void show()
    {   
        System.out.println("In Anonymous A SHow");
    }   
}

class AnonymousB extends AnonymousA{
    public void show()
    {   
        System.out.println("In Anonymous B SHow");
    }   
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        // AnonymousA obj = new AnonymousA();
        // obj.show();
        // AnonymousA obj = new AnonymousB();
        // obj.show();


        // This the method to create the anonymous class,
        // obj3 does have the implementation of its class AnonymousA
        // it had the newly given implementation
        // if you a specific functionality or a functionality for a time being or 
        // we can create the anonymous class and give him a implementation in the mian function
        // same like overloading 
        

        // we only use the pre-declared or pre-defined methods to overload them,
        // we can't create new method in this anonymous class
        AnonymousA obj3 = new AnonymousA()
        {
            public void show()
            {   
                System.out.println("In Anonymous SHow");
            } 
        };
        obj3.show();



    }    
}
