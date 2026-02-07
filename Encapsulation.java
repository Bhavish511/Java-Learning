// Keeping it close
// Binding the data with methods to access them


//////  By Default The integers are assigned 0 
/// By default String ( objects) are assigned null
class Human{

    // access modifiers
    private int age=11;
    // private String name="Bhavish";



    ////**
    /// this keyword
    /// this points to instance variable 
    /// It reference or differenciate the instance variable from the local variables
    /// if you don't want to use this keyword then
    /// pass the obj itself to set the value
    /// 
    /// like: obj.setAge(int age, Human obj){ Human obj1 = obj; obj1.age=age};
    /// Human obj = new Human();
    /// obj.setAge(23,obj);
    /// 
    /// Above will work fine 
    /// 
    // */
    private int age;
    private String name;

    // Constructor named will be same as class name
    // Constructor Not return anything
    // Any object creation will call the constructor
    public Human(){
        // age = 
        System.out.println("In Default Constructor");
    }
    
    // Parameterized constructor
    public Human(int age, String name){
        this.age = age;
        this.name = name;
        System.out.println("In Parameterized Constructor");
        // age = 
        // System.out.println("In Constructors");
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(12,"Omesh");
        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());
        // System.out.println(obj.getAge());
        // System.out.println(obj.getName());
        obj.setAge(23);
        obj.setName("Bhavish");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        // obj.age = 23;
        // obj.name = "Bhavish";
        // System.out.println(obj.name);
    }    
}
