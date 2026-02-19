package Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;


public class MapImplement {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();

        // // Put check if present then update that on the basis of key else add new
        // students.put("Bhavish",56 );
        // students.put("Qasim",76 );
        // students.put("Sunny",66 );
        // students.put("Asad",96 );
        // students.put("Asad",55 );

        // System.out.println(students);
        // System.out.println(students.get("Bhavish"));
        // // Get all the values
        // System.out.println(students.values());
        // // Get all the keys
        // System.out.println(students.keySet());

        // for(String key : students.keySet()){
        //     System.out.println(key + " : " + students.get(key));
        // }
        Map<String,Integer> students1 = new Hashtable<>();

        // Put check if present then update that on the basis of key else add new
        students1.put("Bhavish",56 );
        students1.put("Qasim",76 );
        students1.put("Sunny",66 );
        students1.put("Asad",96 );
        students1.put("Asad",55 );

        System.out.println(students1);
        System.out.println(students1.get("Bhavish"));
        // Get all the values
        System.out.println(students1.values());
        // Get all the keys
        System.out.println(students1.keySet());

        for(String key : students1.keySet()){
            System.out.println(key + " : " + students1.get(key));
        }

        // students.

    }    
}
