class custmExcep extends RuntimeException{
    public custmExcep(String string){
        super(string);
    }
}

public class CustomExceptions {
    public static void main(String[] args) {
         int n = 0;
        int m = 0;
        try {
            m = 18/n;
            if(m==0)
                throw new custmExcep("I don't want to print the zero.");
        }
        catch (custmExcep e){
            m = 18/1;
            System.out.println("Thats the default output " + e);
        }
        // catch(Exception e){ // General exceptions
        //     System.out.println("Something went wrong.. " + e);
        // }
        System.out.println(m);
        System.out.println("Bye..");
    }
}
