package Interfaces;



@FunctionalInterface
interface funcA 
{
    void show(); 
    // void run();
}
class IMFuncA implements funcA{
    public void show(){
        System.out.println("IMfunc Show");
    }
}
public class FunctionalInterfaces {
    public static void main(String[] args) {
        IMFuncA obj = new IMFuncA();
        obj.show();


        funcA obj1 = new funcA(){
            public void show()
            {
                System.out.println("Anonymous Show");
            }
        };
        
        obj1.show();
    }
}
