package oops;

//interfaces
//Interface defines rules.
interface Animals {
    void sound();
}

class Lion implements Animals {
    public void sound() {
        System.out.println("Lion roars");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Lion l1 = new Lion();
        l1.sound();
    }
}