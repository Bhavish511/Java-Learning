package ObjectClassIM;
// Every class Extend the Object, we don't mention but it is always there
// class A extends Object{

// }

class Laptop{
    String model;
    int price;

    public String toString(){

        return "Hey";
    }
    // Don't implement equals like below, comparing object depends on multiple properties

    // public boolean equals(Laptop that){
    //     return this.model.equals(that.model) && this.price == that.price;
    // }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
}


public class objectClass {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "HP";
        obj.price = 1000;

        // printing the above it implicitly calling toString() method
        // Not define in class
        // System.out.println(obj.toString()); // ObjectClassIM.Laptop@2f92e0f4
        System.out.println(obj); // Hey
    } 
}
