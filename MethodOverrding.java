class AOverriding{
    public int add(int n1, int n2){
        System.out.println("in show");
        return n1+n2;
    }
    public void config(){
        System.out.println("In Config A");
    }
}

class BOverriding extends AOverriding{

    // The BOverriding class override the method add of parent,
    // By providing some extension in the functionality of function
    public int add(int n1, int n2){
        System.out.println("Show of B");
        return n1+n2+1;
    }
}

public class MethodOverrding {
    public static void main(String[] args) {
        AOverriding obj = new AOverriding();
        
        System.out.println("A class");
        int r1 = obj.add(3,4);
        System.out.println("value: " + r1);
        BOverriding obj1 = new BOverriding();
        System.out.println("B class");
        int r2 = obj1.add(3,4);       
        System.out.println("value: " + r2);
    }    
}
