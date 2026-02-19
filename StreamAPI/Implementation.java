package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Implementation {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,2);

        System.out.println(nums);

        System.out.println("Sum After Double the even number");
        int sum = 0;
        for(int n: nums)
        {
            if(n%2==0){
                n = n*2;
                sum = sum +n;
            }
        }
        System.out.println(sum);

        // Printing the whole list
        // for (int i = 0; i < nums.size(); i++) {
        //     System.out.println(nums.get(i));
        // }
        // OR 
        // for(int n : nums){
        //     System.out.println(n);
        // }
        // OR 
        // nums.forEach(n -> System.out.println(n));
        
        
        // Through the consumer
        // Consumer<Integer> con = new Consumer<Integer>() {
            
        //     public void accept(Integer n){
        //         System.out.println(n);
        //     }
        // };
        // Consumer<Integer> con =  n -> System.out.println(n);
        // nums.forEach(con);

        // Stream API usage
        // Once we use it then we can't use it again
        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2 ==0);
        // Stream<Integer> s3 = s2.map(n -> n*2);

        // Above in one line
        int result = nums.stream()
        .filter(n-> n%2==0)
        .map(n->n*2)
        .reduce(0,(c,e)-> c+e);
        // int result = s3.reduce(0,(c,e)-> c+e);
        System.out.println(result);
        // s3.forEach(n -> System.out.println(n));
        // s1.forEach(n -> System.out.println(n));
    }
}
