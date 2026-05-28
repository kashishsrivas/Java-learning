package oops;

//inheritance

class Animal{
    void sound(){
        System.out.println("Animals can make sound.");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dogs Barks.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
        d1.bark();
    }
}
