package AdvancedJava;

import java.util.ArrayList;

public class LambdaDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("kash");
        names.add("reena");

        names.forEach(name -> System.out.println(name));

        //input-> action
    }
}
