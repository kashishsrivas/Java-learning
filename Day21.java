package fundamentals;

//Strings : Collection of Characters
//Strings are object in Java

//reverse String
public class Day21 {
    public static void main(String[] args) {
        
        String str  = "Hello";

        for(int i = str.length() - 1; i>=0; i--){
            System.out.println(str.charAt(i));
        }
    }
}
