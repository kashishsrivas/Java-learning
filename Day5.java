package fundamentals;

//if-else-if-else

import java.util.Scanner;

public class Day5 {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        if(age>18){
            System.out.println("Wow you old 😮‍💨");
        } 
        else if(age==18) {
            System.out.println("YOU ARE SAFE 👀");
        } 
        else{
            System.out.println("Broooo!! you young. GO STUDY 🤬");
        }
    }
}
