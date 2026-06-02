package collec;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        
        ArrayList<String> student = new ArrayList<>();
        
        student.add("kashish"); 
        student.add("vasu");
        student.add("ishaan");

        System.out.println(student);

        System.out.println("first student: " + student.get(0));
        System.out.println(student.contains("anu"));
    }
}

// add() - insert, get() - access, remove() - delete, size()- total elements, contains() - check elements