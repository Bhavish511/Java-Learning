package Annotations;

class A{
    // public void show(){
    //     System.out.println("In A show");
    // }
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In A show");
    }
}

class B extends A{
    // public void show(){
    //     System.out.println("In B show");
    // }
    @Override
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In B show");
    }

}

public class annotations {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
