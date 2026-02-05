public class StringWorking {
    public static void main(String[] args) {
        
        // String is not primitive type it is a class
        // String name = new String("Bhavish"); created the object for name 
        // String name  = "Bhavish";
        // Printing the hashcode 
        // System.out.println(name.hashCode());

        // concat        
        // System.out.println("Hello " + name);

        
        // string concatination
        
        // System.out.println(name.concat(" Kumar"));
        
        // Char at specific position

        // System.out.println(name.charAt(0));
        // System.out.println(name);
        
        // name = name + " Kumar";
        
        // System.out.println(name);

        // Inside in the Heap there is area called String Constant Pool
        // Like below they are pointing the same Address because of the Concept of String constant pool
        // The String constant pool stores the String value/ String literal to the String constant pool 
        // We are updating a string variable it means we are Creating an string literal in String Constant pool the previous value is still there and not modified and it is eligible for garbage collections
        // String s1 = "Bhavish";
        // String s2 = "Bhavish";

        // By default string are Immutable

        // Mutable String ---> it means some thing can be changed
        // String Buffer --> are mutable strings
        // String Builder -> are mutable strings 

        // One difference is :
        //  String Buffer ---> This class thread-safe because its methods are synchronized, making it suitable for use in multi-threaded environments 
        //  String Builder -->This class is not thread-safe and its methods are not synchronized. As a result, it generally offers better performance than StringBuffer and is the preferred choice for single-threaded environments        

        // Immutable String -> it means it can't be changed or unchanged
        // String --> are Immutable 

        // It gives additional 16 charactor of size --> 
        // As it consume continous memory space in heap if there will be no any space avaible,
        // then this 16 character size is there to reference that

        // Increment in buffer --> {oldCapcity * 2 } +  2

        StringBuffer sb = new StringBuffer("Bhavish");
        // Total memory allocated
        System.out.println(sb.capacity());
        // length
        // System.out.println(sb.length());
        
        // Append data in StringBuffer 
        sb.append(" Kumar");
        // sb.append(" Kumar");
        // sb.append(" Kumar");
        System.out.println(sb);
        System.out.println(sb.capacity());
        
        // Delete at specific point
        
        // sb.deleteCharAt(1);
        // System.out.println(sb);
        // Insert at specific position

        sb.insert(0, "Java ");
        sb.insert(13, "Java ");
        System.out.println(sb);
        
        // Set the length of StringBuffer

        sb.setLength(50);

        // set minimun capacity 
        sb.ensureCapacity(100);
        

        
    }
}
