package finalKeyword;


// final Keyword 
// It can be used with keyword, class or method
// 



// If a class is use final keyword----->
// it stops inheritance, doesn't allow to extend this call
// final class CalulatorFinal{
//     public void show(){
//         System.out.println("In CalFinal Show");
//     }
//     public void add(int n1,int n2){
//         System.out.println(n1+n2);
//     }
// }

// error
// class AdvCalFinal extends CalulatorFinal{

// }


// class CalulatorFinal{

//     // Final keyword with method:
//     // It stops the methods from overriding make them inaccessible for overriding

//     public final void show(){
//         System.out.println("In CalFinal Show");
//     }
//     public void add(int n1,int n2){
//         System.out.println(n1+n2);
//     }
// }
// class AdvCalFinal extends CalulatorFinal{
//     public void show(){
//         System.out.println("In AdvCalFinal Show");

//     }
// }

public class Finalkeyword {
    public static void main(String[] args) {

        // It behaves like const type
        // if we assign a value then we can't change it
        final int num = 8;
        // num = 9;
        System.out.println(num);

        // CalulatorFinal obj = new CalulatorFinal();
        // obj.show();
        // obj.add(4,4);
        
    }  
}
