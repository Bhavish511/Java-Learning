// Throws ---> use to with methods,
// If methods had exception so it throws the exception to its calling methods,
// if we use this to any then, we handle the exception at when we call, there we handle the exception not in method itself
// use with checked Exception

// class THROWEXCEPTION{
//     public void show(){
//         try {
//             Class.forName("ThrowsKeywords");
//         } catch (ClassNotFoundException e) {
//             System.out.println("Not able to find the class. " + e);
//         }
//     }
// }
// public class ThrowsKeywords {
//     static{
//         System.out.println("Class Loaded");
//     }
//     public static void main(String[] args) {
//         THROWEXCEPTION obj = new THROWEXCEPTION();
//         obj.show();
//     }
// }
/// Same with Throws keyword
class THROWEXCEPTION{
    public void show() throws ClassNotFoundException
    {
        
        Class.forName("Demo");
        // Class.forName("ThrowsKeywords");
    }
}
public class ThrowsKeywords {
    static{
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) //throws ClassNotFoundException
    {
        THROWEXCEPTION obj = new THROWEXCEPTION();

            try {
                obj.show();
            } catch (ClassNotFoundException e) {
                e.printStackTrace(); // Pirnt the track stack which method is class which methods
            }
        // Here call in try catch or add throws ClassNotDoundException on main method
        // try {
            
        //     obj.show();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
    }
}
