package Interfaces;


///// When a company hire the developer (Developer class), and each developer requires the
/// laptop to perform the tasks 
/// So we create the developers class and each developer is assigned a laptop

// Developer depend on Laptop

/// To solve the above dependancy we can solve it by:
/// Creating the Computer class and then extend that by laptop and Desktop

///// 

abstract class Computer{
    public abstract void code();
}
class Laptop extends Computer {
    public void code(){
        System.out.println("Code, Compile and Run");
    }
}

class Desktop extends Computer{
    public void code(){
        System.out.println("Code, Compile and Run Fater...");
    }
}
// Developer depend on Laptop

class Developer{
    public void devApp(Computer Cap)
    {
        Cap.code();
    }
}
public class NeedInterfaces {
    public static void main(String[] args) {
        Computer BhavishLaptop = new Laptop();
        Computer BhavishDesktop = new Desktop();
        Developer bhavish = new Developer();
        bhavish.devApp(BhavishLaptop);
        // bhavish.devApp(BhavishDesktop); // we can't provide desktop because it needs laptop

    }   
}
