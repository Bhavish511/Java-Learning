package Interfaces.LambdaExpression;
@FunctionalInterface
interface funcA 
{
    void show(int i); // 2
    // void show(); // 1 
    // void run();
}
// class IMFuncA implements funcA{
//     public void show(){
//         System.out.println("IMfunc Show");
//     }
//     public void show1(){
//         System.out.println("IMfunc Show");
//     }
// }


/// Lambda expression doesn't create new file, but the it uses the same parent class
/// 
public class Lambda {
    public static void main(String[] args) {
        // IMFuncA obj = new IMFuncA();
        // obj.show();

        // 1
        // funcA obj1 = new funcA(){
        //     public void show()
        //     {
        //         System.out.println("Anonymous Show");
        //     }
        // };
        // funcA obj1 = () -> {
        //     System.out.println("Anonymous Show");
            
        // };
        
        // obj1.show();
        // funcA obj1 = new funcA(){
        //     public void show(int i)
        //     {
        //         System.out.println("Anonymous Show");
        //     }
        // };
        funcA obj1 = i -> {
            System.out.println("Anonymous Show");
            
        };
        
        obj1.show(5);
    }
}
