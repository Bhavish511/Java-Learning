package Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetImplement {
    public static void main(String[] args) 
    {
        System.out.println("Hash set, It does not sort the values");
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(66);
        nums.add(56);
        nums.add(88);
        nums.add(20);
        nums.add(15);
        nums.add(99);

        // System.out.println(nums);
        
        for(int n: nums){
            System.out.println(n);

        }
        System.out.println("Tree set, It sort the values");
        Set<Integer> nums1 = new TreeSet<Integer>();
        nums1.add(66);
        nums1.add(56);
        nums1.add(88);
        nums1.add(20);
        nums1.add(15);
        nums1.add(99);

        // System.out.println(nums);
        
        for(int n: nums1){
            System.out.println(n);

        }

        System.out.println("Use collection and Iterator for this");
        Collection<Integer> nums2 = new TreeSet<Integer>();
        nums2.add(66);
        nums2.add(56);
        nums2.add(88);
        nums2.add(20);
        nums2.add(15);
        nums2.add(99);

        Iterator<Integer> values = nums2.iterator();
        while(values.hasNext())
        {
            System.out.println(values.next());
        }
    }
}
