package Interfaces.LambdaExpression;

@FunctionalInterface
interface Cal{
    int add(int a, int b);
}
public class ReturnWLambda {
    public static void main(String[] args) {
        Cal obj = new Cal() {
            public int add(int a, int b){
                return a+b;
            }
        };

        System.out.println(obj.add(5,10));

        // Cal obj1 = (a,b) ->{
        //     return a+b;
        // };
        // System.out.println(obj1.add(4,7));

        // OR
        Cal obj1 = (a,b) -> a+b;
        System.out.println(obj1.add(4,7));
    }
}
