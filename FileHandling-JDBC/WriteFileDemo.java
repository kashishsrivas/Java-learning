package FileHandling;

import java.io.FileWriter;

public class WriteFileDemo {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("Student.txt");
            
            file.write("Kashish\n");
            file.write("Writing my File Handling program");
            file.close();

            System.out.println("Data Saved Successfully");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
