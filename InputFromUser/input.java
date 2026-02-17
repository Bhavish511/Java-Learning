package InputFromUser;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
import java.util.Scanner;

public abstract class input {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        // int num = System.in.read(); // It gives you the ASCII value to entered value

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in); // It is resourse

        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);

        // bf.close();

        // ALternative for Input
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        System.out.println(num1);

        sc.close();
    }
}
