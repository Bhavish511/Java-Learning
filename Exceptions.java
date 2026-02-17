///// Exceptions
/// errors type:
/// 1) Compile time error: syntax error..
/// 2) Runtime error: Code work fine but suddenly stops working
///     Runtime errors are the exceptions and we have to handle the exception
/// 3) logical error: Everything work fine but output is wrong

public class Exceptions {
    public static void main(String[] args) {
        
        // int i =0;
        // int j = 18/i; // Throw exception
        // System.out.println(j);

        // Handling the exception

        int n = 2;
        int m = 0;
        // String str = null;
        int[] nums = new int[5];
        try {
            m = 18/n;
            System.out.println(nums[1]);
            System.out.println(nums[3]);
            // System.out.println(str.length());
        } catch (ArithmeticException e) { // Arthematic
            // if(e)
            System.out.println("Cannot divide by zero.");
        }catch(ArrayIndexOutOfBoundsException e){ // ArrayIndexOutBounds exceptions
            System.out.println("Cannot fetch value stay in limit");
        }
        catch(Exception e){ // General exceptions
            System.out.println("Something went wrong.. " + e);
        }
        System.out.println(m);
    }
}
