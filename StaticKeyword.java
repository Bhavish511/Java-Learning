// Static varibale or function would belong to whole class not the object specific
// Static use to Make the properties consistant for all the object 
// Static variable are shared between all the objects of the class.


///** Static Variable should be called with class name.
/// Avoid Static variable calling with objects
class Mobile {
    String brand;
    int price;
    String network;
    static String name;

    // This is the static Block which is called only once,
    // In this we define the or default value of the static variables
    // THE STATIC BLOCK IS CALLED BEFORE THE CONSTRUCTOR CALLED
    static {
        name = "Phone";
        System.out.println("In the static block");
    }
    // constructor
    public Mobile(){
        brand= "";
        price = 200;
        System.out.println("In the Constructor block");
        // WE DON'T INTIALIZE THE STATIC VARIABLE HERE BECAUSE EVERY TIME NEW OBJECT CREATES IT CALLS THE CONSTRUCTOR,
        // SO AT EVERY OBJECT CREATION THE STATIC VARIABLE ARE RE-INITIALLIZED
        // SO IT IS WRONG TO DEFINE OR INITIALIZE THE STATIC VARIABLE IN CONSTRUCTOR
        // THERE IS STATIC BLOCK SO WE DEFINE THERE
        // name = "Phone";
    }

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

    // STATIC METHOD'S ARE CALLED DIRECTLY WITH THE CLASS NAME
    // WE CAN USE STATIC VARIABLE DIRECTLY IN THE STATIC METHOD, BUT NOT NON-STATIC INSTANCES
    // BECAUSE THE NON-INSTANCE VARIABLE REQUIRED A OBJ TO USE THEM OR REQUIRED THE REFERENCE TO USE
    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
        
    }
}

public class StaticKeyword {
    public static void main(String[] args) throws ClassNotFoundException {
        Mobile.name = "Phone";
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1000;
        // Mobile.name = "J5";

        
        obj1.show();
        obj2.show();


        // IF WE DON'T CREATE ANY OBJECT THEN THERE WILLN'T BE CALLED LOADED OR CALLED
        
        Class.forName("Mobile");
        // ABOVE WILL LOAD THE CLASS BY WITHOUT CREATING OBJECT
        // STATIC BLOCK CALLED FIRST THEM CONSTRUTOR IS CALLED
        // BECAUSE THE CLASS LOADED ONCE,
        // ON EVERY OBJECT CREATION THE CONSTRUCTOR IS CALLED BUT THE CLASS LOADED ONCE
        // SO THATS WHY THE STATIC BLOCK EXECUTED FIRST AND THEN CONSTRUCTOR IS CALLED

    }
}
