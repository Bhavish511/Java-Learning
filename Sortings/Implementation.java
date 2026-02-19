package Sortings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class Implementation {
    public static void main(String[] args) {
        // Simple sort method

        // List<Integer> nums = new ArrayList<>();
        // nums.add(5);
        // nums.add(6);
        // nums.add(10);
        // nums.add(4);
        // nums.add(1);
        // Collections.sort(nums);
        // System.out.println(nums);

        // Sort on specific conditions

        // Comparator<Integer> com = new Comparator<Integer>()
        // {
        // public int compare(Integer i, Integer j)
        // {
        // if(i%10 > j%10){
        // return 1;
        // }
        // else{
        // return -1;
        // }
        // }
        // };

        // List<Integer> nums = new ArrayList<>();
        // nums.add(41);
        // nums.add(31);
        // nums.add(72);
        // nums.add(29);
        // // nums.add(1);
        // Collections.sort(nums,com);
        // System.out.println(nums);

        // Comparator<Student> com = new Comparator<Student>()
        // {
        // public int compare(Student i, Student j)
        // {
        // if(i.age > j.age){
        // return 1;
        // }
        // else{
        // return -1;
        // }
        // }
        // };
        // Optimized way with lambda and terrnary operators
        // Comparator<Student> com = (Student i, Student j) -> {
        //     return i.age > j.age ? 1 : -1;
        // };
        Comparator<Student> com = (Student i, Student j) -> i.age > j.age ? 1 : -1;
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Bhavish"));
        studs.add(new Student(12, "Sunny"));
        studs.add(new Student(18, "Navin"));
        studs.add(new Student(20, "Naresh"));

        System.out.println(studs);

        for (Student std : studs) {
            System.out.println(std.name + " : " + std.age);
        }

        // Collections.sort(studs,com);
        Collections.sort(studs); // Use the class defined comparable method
        System.out.println("After sorting...");
        for (Student std : studs) {
            System.out.println(std.name + " : " + std.age);
        }
    }
}
