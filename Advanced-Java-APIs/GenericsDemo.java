package AdvancedJava;

//Generics in Java allow you to write classes, interfaces, 

import java.util.ArrayList;

// and methods that operate on different data types while providing compile-time type safety

public class GenericsDemo{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("kashish");
        names.add("reena");

        for (String name  : names) {
            System.out.println(name);
        }
    }
}
// <String> = Only Strings allowed.