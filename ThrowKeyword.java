///// Exceptions
/// errors type:
/// 1) Compile time error: syntax error..
/// 2) Runtime error: Code work fine but suddenly stops working
///     Runtime errors are the exceptions and we have to handle the exception
/// 3) logical error: Everything work fine but output is wrong

public class ThrowKeyword {
    public static void main(String[] args) {
        
        // int i =0;
        // int j = 18/i; // Throw exception
        // System.out.println(j);

        // Handling the exception

        int n = 0;
        int m = 0;
        try {
            m = 18/n;
            if(m==0)
                throw new ArithmeticException("I don't want to print the zero.");
        } catch (ArithmeticException e) { // Arthematic
            m = 18/1;
            System.out.println("Cannot divide by zero. "+e);
        }
        catch(Exception e){ // General exceptions
            System.out.println("Something went wrong.. " + e);
        }
        System.out.println(m);
        System.out.println("Bye..");
    }
}