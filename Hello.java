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
        
        
        // Switch case

        // int n = 8;
        // if (n == 1)
        //     System.out.println("Monday");
        // else if (n == 2)
        //     System.out.println("Tuesday");
        // else if (n == 3)
        //     System.out.println("Wednesday");
        // else if (n == 4)
        //     System.out.println("Thursday");
        // else if (n == 5)
        //     System.out.println("Friday");
        // else if (n == 6)
        //     System.out.println("Saturday");
        // else if (n == 7)
        //     System.out.println("Sunday");
        // else
        //     System.out.println("Enter Valid Number");

        // switch (n) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Enter valid Number");
        //         break;
        // }


        // LOOPS --> Repeatation
        // LOOPS --> while, do while, for

        // repeat 100 times, or on certain condition

        // WHILE LOOP 
        // Infinite Loop
        // while (true) {
        //     System.out.println("Hi");
        // }

        // int i = 1; // iterator
        // while (i <= 5) {
        //     System.out.println("Hi " + i);
        //     i++;
        // }
        // int i = 1; // iterator
        // while (i <= 5) {
        //     int j = 1; // second iterator
        //     System.out.println("Hi " + i);
        //     while (j <= 3) {
        //         System.out.println("Hello");
        //         j++;
        //     }
        //     i++;
        // }

        // do while loop 
        // You want to process 1 time even if you condition is false
        // int i = 1;
        // do {
        //     System.out.println("Hi " + i);
        //     i++;

        // } while (i < 5);


        // FOR LOOP 

        // for(int i=1;i<5;i++ )
        // {
        //     System.out.println(i);
        // }
        // for(int i=5;i>0;i-- )
        // {
        //     System.out.println(i);
        // }
        // for(int i=1; i<=5; i++ )
        // {
        //     System.out.println("DAY " + i);
        //     for(int j = 1; j<=9 ; j++){
        //         System.out.println(" " + (j+8) + " - " + (j+9));
        //     }  
        // }
    }
}