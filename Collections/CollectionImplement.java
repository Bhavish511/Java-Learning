package Collections;

import java.util.ArrayList;
import java.util.Collection;
public class CollectionImplement {
    public static void main(String[] args) 
    {
        // <Integer> --> it helps catch the exception at compile time, if there any not at runtime, if we don't use this then runtime exception occurs
        // If we don't use generix (<>) then every value considered as object not the Integer or string 
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);

        System.out.println(nums);
        
        for(int n: nums){
            System.out.println(n);

        }
    }
}
