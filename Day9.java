package fundamentals;

//multiplication table (table of 5)

import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("what's the number you want");
        int a = sc.nextInt(); 

        for(int i =1; i<=10; i++){
                System.out.println(a*i);
        }

    }
}
