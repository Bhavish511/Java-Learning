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

public class Method {
    public static void main(String[] args) {
        Computer obj = new Computer();

        obj.playMusic();
        String str = obj.getMePen(8);
        // System.out.println(obj.getMePen(10));
        System.out.println(str);
    }
}
