package collec;

public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println("cannot divide by zero");
        }
        System.out.println("program continues.");
    }
}