package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapImplement {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();
        students.put("Bhavish",56 );
        students.put("Qasim",76 );
        students.put("Sunny",66 );
        students.put("Asad",96 );

        System.out.println(students);
        System.out.println(students.get("Bhavish"));

        System.out.println(students.values());

        System.out.println(students.keySet());

        for(String key : students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }

        students.

    }    
}
