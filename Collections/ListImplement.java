package Collections;

import java.util.ArrayList;
import java.util.List;
public class ListImplement {
    public static void main(String[] args) 
    {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        // Print the index value
        System.out.println(nums.get(2));

        // Print the index of the value
        System.out.println(nums.indexOf(2));
        // System.out.println(nums);
        
        for(int n: nums){
            System.out.println(n);

        }
    }
}
