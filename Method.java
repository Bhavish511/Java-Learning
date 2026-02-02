class Computer 
{
    public void playMusic(){
        System.out.println("Music Playing.....");
    }

    public String getMePen(int amount){
        if (amount >= 10) {
            return "pen "+ amount;
        }
        else
            return "Nothing";
    }
    // public String getMePen(int amount){
    //     return "pen "+ amount;
    // }
    
}

class Calculator
{
    // Method Overloading

    /**
     * @param x
     * @param y
     * @return
     */
    public int add(int x, int y){
        return x+y;
    }
    /**
     * @param x
     * @param y
     * @param z
     * @return
     */
    public int add(int x, int y,int z){
        return x+y+z;
    }
    /**
     * @param x
     * @param y
     * @param z
     * @return
     */
    public double add(double x, int y,int z){
        return x+y+z;
    }
}

public class Method {
    public static void main(String[] args) {
        // Computer obj = new Computer();

        // obj.playMusic();
        // String str = obj.getMePen(8);
        // // System.out.println(obj.getMePen(10));
        // System.out.println(str);

        Calculator objcal = new Calculator();

        int r1 = objcal.add(2,3);
        System.out.println("Two sum: " + r1);
        int r2 = objcal.add(2,3,7);
        System.out.println("Three sum: " + r2);

    }
}
