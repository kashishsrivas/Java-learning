package oops;

//polymorphism
//same method, different behaviour
class Animal{
    void sound(){
        System.out.println("Animlas can make sound.");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("cats do meow");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.sound();
    }
}
