package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFileDemo {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Student.txt"));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
