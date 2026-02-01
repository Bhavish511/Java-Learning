public class Hello {

    public static void main(String args[])
    {
        // System.out.println("scndskjsdv");
        // int num1 = 5;
        // System.out.println(num1);
        // int num2 = 5;
        // System.out.println(num2);
        // int result = num1 + num2;
        // System.out.println(result);

        // Data Type:
        /*

        UNICODE --> Java follows the UNICODE have bigger range
        Primitive Data Types:
            int --> (
                byte(1byte), -2^7 to 2^7-1
                short(2bytes), 
                int(4bytes),
                long(8bytes)), --> in last add the 'l' for representation
             float -->(
             double, --> 8bytes
             float,--> 4 bytes (mention f in last else considered double)
             ),
              character -> 2bytes,
               boolean --> True or false (0,1)
        */
    //    byte num = 1;
    //    float marks = 6.5f;
    //    char c = 'k';
    //    long l = 5558l; 
    //    boolean b = true;

        // literals
        /*
        binary Hex to integar
         */
        // 0b represent binary
        // int num = 0b101;
        // 0x represents hexa
        // int num = 0x7E;

        // Inbuild _ it neglect the _       
        // int num = 1_000_000_0;
        // exponential values
        // double num = 12e10;

        // Type Conversion and casting

        // casting
        // byte b = 127;
        // System.out.println(b);
        // int a = 257;
        // byte k = (byte)a;
        // System.out.println(a);
        // System.out.println(k);

        // float f =5.6f;
        // int t= (int)f;
        // System.out.println(t);
        // // error
        // // b=a;
        // // type casting explixit
        // b = (byte)a;
        // // correct bigger to small in size
        // // implixit conversion

        // a=b;
        

        // Type promotion
        // byte a = 10;
        // byte b = 30;

        // int result = a *b;
        // System.out.println(result); 

        // Byte * Byte should be byte --> but the above operation output is out of range byte and we store in int
    

        //  Arthematic operations
        // int num1 = 7;
        // int num2 = 5;

        // int result  = num1 + num2 ;
        // int result  = num1 - num2 ;
        // int result  = num1 * num2 ;
        // int result  = num1 / num2 ; // return the quotient
        // int result  = num1 % num2 ; // return the remainder
        // num1 =num1 +2;
        // or 
        // num1 += 2;
        // num1 -= 2;
        // num1 *= 2;
        // num1 /= 2;

        // for single increment
        // num1 ++; post // First fetch the value and then increment
        // ++num1; pre // First increment the value then increment
        // for single decrement
        // num1 --;
        // System.out.println(result);

        // Relational Operator
        // < --> less than,
        // > --> Greater than
        // <= --> Less than and equal to 
        // >= --> Greater than and equal to 
        // ! ---> Not
        // == Equal to to
        // != --> Not equal to 

        // int x = 8;
        // int y  = 9;

        // boolean result = x<y;
        // System.out.println(result);
        // int x = 8;
        // int y  = 8;

        // // boolean result = x >= y;
        // boolean result = x <= y;
        // System.out.println(result);
        // int x = 8;
        // int y  = 8;

        // boolean result = x != y;
        // boolean result = x == y;
        // System.out.println(result);

        // Logical operator

        // & - AND Both true --> true, else false
        // | - OR -> Any one true --> true, both false then false
        // ! - NOT --> if true--> false and vice versa


        //  &&   || and !


        // int x = 4;
        // int y = 5;
        // int z = 7;
        // int a = 2;
        // // boolean result = y > x && a > z;
        // // System.out.println(result);; // false
        // // boolean result = y > x || a > z; 
        // // System.out.println(result);; // true
        // boolean result = y > x || a > z; 
        // System.out.println(!result);; // true then ! becomes false
        

        // Conditional Statements

        // int x = 18;
        // if (x > 10 && x <= 20) // 11 - 20
        // {
        //     System.out.println("Hello");
        // } else{
        //     System.out.println("Bye");
        // }

        // int x = 5;
        // int y = 7;
        // int z = 10;

        // if( x > y && x > z ){
        //     System.out.println(x);
        // }else if(y > x && y > z){
        //     System.out.println(y);
        // }else {
        //     System.out.println(z);
        // }

        // Ternary operators

        // int n = 4;
        // int m = 7;
        // int result = 0;
        // if(n%2 == 0){
        //     result = 10;
        // }else{
        //     result = 20;
        // }
        // System.out.println(result);
        
        // result = n%2 == 0 ? 10 : 20;
        // System.out.println(result);
        
    }
}