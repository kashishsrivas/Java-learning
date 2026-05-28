package oops;

//class
//this class is outside the main class because of reusability.
class car {
    String brand;
    String colour;
    
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Colour: " + colour);
    }
}

public class ClassesObjects {
    public static void main(String[] args) {
        //object

        car c1 = new car();
        c1.brand = "Audi";
        c1.colour = "Black";
        c1.display();
    }
}
