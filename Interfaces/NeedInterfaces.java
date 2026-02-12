package Interfaces;


///// When a company hire the developer (Developer class), and each developer requires the
/// laptop to perform the tasks 
/// So we create the developers class and each developer is assigned a laptop


///// 

class Laptop {
    public void code(){
        System.out.println("Code, Compile and Run");
    }
}

class Desktop{
    public void code(){
        System.out.println("Code, Compile and Run Fater...");
    }
}
class Developer{
    public void devApp(Laptop lap)
    {
        lap.code();
    }
}
public class NeedInterfaces {
    public static void main(String[] args) {
        Developer bhavish = new Developer();
        Laptop BhavishLaptop = new Laptop();
        Desktop BhavishDesktop = new Desktop();
        bhavish.devApp(BhavishLaptop);
        bhavish.devApp(BhavishDesktop); // we can't provide desktop because it needs laptop

    }   
}
