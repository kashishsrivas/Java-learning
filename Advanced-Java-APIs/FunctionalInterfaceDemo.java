package AdvancedJava;

//functional interface
interface Greeting{
    void sayHello();
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Greeting g = 
            () -> System.out.println("Hello kashish"); //lambda expression 

        g.sayHello();
    }
}
