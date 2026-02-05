class Student {
    int rollno;
    String name;
    int marks;

    
}
public class Array {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // 1D Array
        // int num[] = {3,7,2,4};
        // printing value
        // System.out.println(num[0]);
        // changing value
        // num[1] = 10;
        // System.out.println(num[1]);
        
        // initialize empty array (0's array)
        // int arr[] = new int[4];
        // arr[0] = 1;
        // arr[1] = 4;
        // arr[2] = 5;
        // arr[3] = 6;
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);

        // printing array with loop
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        // Multidimensional Array
        // 3 rows and 4 cols
        // int nums[][] = new int[3][4];
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         nums[i][j] = i + j + 10;
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // int random = (int)Math.random() * 10;
        // asigning random values using Math.random() and priting 
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         nums[i][j] = (int)(Math.random() * 10);
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();
        // System.out.println();
        // System.out.println();
        // System.out.println();


        // another way to iterate array
        // for (int n[] :nums) {
        //     for(int m: n){
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();   
        // }



        // 3 Dimentional Array
         
        // int arrr[][][] = new int[3][4][5];
        // int value = 1;
        // for (int i = 0; i < arrr.length; i++) {
        //     for (int j = 0; j < arrr[i].length; j++) {
        //         for (int k = 0; k < arrr[i][j].length; k++) {
        //             arrr[i][j][k] = value++;
        //         }
        //     }
        // }
        // for( int arrs[][]: arrr){
        //     for(int arr[]:arrs){
        //         for(int a:arr){

        //             System.out.print(a + " ");

        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }
        // for (int i = 0; i < arrr.length; i++) {
        //     System.out.println("Layer " + i);
        //     for (int j = 0; j < arrr[i].length; j++) {
        //         for (int k = 0; k < arrr[i][j].length; k++) {
        //             System.out.print(
        //                 "arrr[" + i + "][" + j + "][" + k + "] = " + arrr[i][j][k] + "   "
        //             );
        //         }
        //         System.out.println();
        //     }
        //     System.out.println("---------------");
        // }





        // Jagged Array

        // int jagged[][] = new int[3][]; // jagged array

        // jagged[0]= new int[3];
        // jagged[1]= new int[4];
        // jagged[2]= new int[2];

        // for (int i = 0; i < jagged.length; i++) {
        //     for (int j = 0; j < jagged[i].length; j++) {
        //         jagged[i][j] = (int)(Math.random() * 10);
        //         System.out.print(jagged[i][j] + " ");
        //     }
        //     System.out.println();
            
        // }
        // System.out.println();
        // System.out.println();
        // System.out.println();
        // System.out.println();
        
        // // another way to iterate the array
        
        // for(int n[]: jagged){
        //     for(int  m: n){
        //         System.out.print(m + " ");

        //     }
        //     System.out.println();
        // }



        // int arrs[] =  new int[6];
        // arrs[0] = 4;
        // arrs[1] = 8;
        // arrs[2] = 3;
        // arrs[3] = 7;

        // for(int m:arrs){
        //     System.out.println(m);
        // }

        // object 1
        Student stdobj = new Student();
        stdobj.rollno = 1;
        stdobj.name = "Bhavish";
        stdobj.marks = 50;
        // object 2
        Student stdobj1 = new Student();
        stdobj1.rollno = 2;
        stdobj1.name = "Qasim";
        stdobj1.marks = 60;
        // object 3
        Student stdobj2 = new Student();
        stdobj2.rollno = 3;
        stdobj2.name = "Sunny";
        stdobj2.marks = 70;
        // object 4
        Student stdobj3 = new Student();
        stdobj3.rollno = 4;
        stdobj3.name = "Omesh";
        stdobj3.marks = 80;

        // 
        // System.out.println(stdobj1);
        // It prints the address of the object not the values of the object
        Student students[] = new Student[4];
        students[0]= stdobj;
        students[1]= stdobj1;
        students[2]= stdobj2;
        students[3]= stdobj3;
        
        // for (int i = 0; i < students.length; i++) {
        //     System.out.println(students[i].name + " : " + students[i].marks);
        // }

        // for Enhanced for loop 

        for (Student student : students) {
            System.out.println(student.name + ":" + student.marks);
        }


        int arr[] = new int[4];
        arr[0] = 1;
        arr[1] = 4;
        arr[2] = 5;
        arr[3] = 6;

        for (int i : arr) {
            System.out.println(i);
        }
    }
}