package Enums;

// Enums are the constants
// We can't extend the enums
// We can create the constructor, variables 

enum Status{
    Running, Failed, Pending, Success;
}
public class enums {
    public static void main(String[] args) {
        Status s = Status.Running;
        
        System.out.println(s);
        // It will print the index or order
        System.out.println(s.ordinal());

        // Get all 
        Status[] st = Status.values();
        System.out.println(st); // print reference
        System.out.println(st[0]); 
        // Print all status
        for(Status sta: st){
            System.out.println(sta + "  " + sta.ordinal()); 
        }

        Status sp = Status.Success;
        if(sp == Status.Pending){
            System.out.println("Please wait...");
        }
        else if(sp == Status.Running){
            System.out.println("All Good...");
        }
        else if(sp == Status.Failed){
            System.out.println("Try Again...");
        }
        else {
            System.out.println("Done...");
        }
        
        switch (sp) {
            case Running:
                System.out.println("All Good...");
                
                break;
            case Failed:
                System.out.println("Try Again...");
                break;
            case Pending:
                System.out.println("Please wait...");   
                break;
            default:
                System.out.println("Done...");
                break;
        }

        System.out.println(sp.getClass().getSuperclass());
    }
}
