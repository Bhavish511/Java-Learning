package Enums;


// The constructors are private because we are creating object in the class

enum Laptop{
    // objects 
    MacBook(2000), HP, ThinkPad(1500), Dell(2500), Surface(1500);
    // variable
    private int price;
    // Default Constructor
    private Laptop(){
        price = 500;
    }
    // constructor parameterized
    private Laptop(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
    
}

public class Computer_Enum {
        public static void main(String[] args) {
            Laptop lapt = Laptop.MacBook;
            System.out.println(lapt.getPrice());

            for (Laptop lap : Laptop.values()) {
                System.out.println(lap + " : " + lap.getPrice());   
            }
        }
}
