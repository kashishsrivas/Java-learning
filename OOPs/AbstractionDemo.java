package oops;

//abstraction
abstract class vehicle{
    abstract void start();
}

class Car extends vehicle{
    void start(){
        System.out.println("car is starting.");
    } 
}
public class AbstractionDemo {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
    }
}
