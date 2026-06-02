package collec;

import java.util.HashMap;

//key->value
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> student = new HashMap<>();
        student.put(101, "kash");
        student.put(102, "ishaan");

        System.out.println(student);
        System.out.println("student 101: " + student.get(101));
    }
}