////*
//   Inheritance --> (is)
// Getting properties of Parent class or base class

public class OOP_Pillers {
    public static void main(String[] args) {
        Calc obj = new Calc();

        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7, 5);
        System.out.println(r1);
        System.out.println(r2);
        AdvanceCalc obj2 = new AdvanceCalc();
        
        int r3 = obj2.add(4, 5);
        int r4 = obj2.sub(7, 5);
        int r5 = obj2.multi(4, 5);
        int r6 = obj2.div(7, 5);
        System.out.println("Single Level Inheritance");
        System.out.println("Calc to Adv Calc Inheritance");
        System.out.println("Advanced Calculator");
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
        
        VeryAdvCalc obj3 = new VeryAdvCalc();
        int r7 = obj3.add(4, 5);
        int r8 = obj3.sub(7, 5);
        int r9 = obj3.multi(4, 5);
        int r10 = obj3.div(7, 5);
        double r11 = obj3.power(2, 2);
        
        System.out.println("MultiLevel Inheritance");
        System.out.println("Calc to Adv Calc to Very Adv Calc Inheritance");
        System.out.println("Very Advanced Calculator");
        System.out.println(r7);
        System.out.println(r8);
        System.out.println(r9);
        System.out.println(r10);
        System.out.println(r11);

        
    }   
}
