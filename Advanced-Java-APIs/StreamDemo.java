package AdvancedJava;

import java.util.ArrayList;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(35);
        numbers.add(40);
        numbers.add(55);

        numbers.stream()
                .filter(n -> n%2 ==0)
                .forEach(System.out::println);
    }
}
