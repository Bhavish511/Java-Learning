import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class finallyKeyword {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // int i = 0;
        // int j = 0;

        // try {
        //     j = 18 / i;
        //     System.out.println("Bye");
        // } catch (Exception e) {
        //     System.out.println("Something went wrong.");
        //     System.out.println("Bye");
        // }
        // // This block will execute irrespective of Exception occurs or not this block
        // // will execute
        // // we can skip the catch block with the help of this block

        // // Also used to close the resource
        // finally {
        //     System.out.println("Byee.");
        // }
        int num1 = 0;
        // BufferedReader br = null;
        // try{
        //     // InputStreamReader in = new InputStreamReader(System.in);
        //     br = new BufferedReader( new InputStreamReader(System.in));
        //     num1 = Integer.parseInt(br.readLine());
        //     System.out.println(num1);
        // }
        // finally{
        //     br.close();
        // }


        // tryResource method
        try (BufferedReader br = new BufferedReader( new InputStreamReader(System.in))) {
            num1 = Integer.parseInt(br.readLine());
            System.out.println(num1);
        };
    }
}
