class Calculator {
    int a;
    public int add(int x,int y){
        // System.out.println("in Add: "+ (x+y));
        // return 0;
        int r = x+y;
        return r;
    }
    
}

public class OOP {
    public static void main(String[] args) {
        int num1= 5;
        int num2 = 6;
        
        Calculator objCalculator = new Calculator();
        int result = objCalculator.add(num1,num2);


        // int result = num1 + num2;
        System.out.println(result);
    }
}
// Object Oriented Programming
// Object - Properties and behaviours


// Class