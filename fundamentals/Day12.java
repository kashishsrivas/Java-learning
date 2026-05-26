package fundamentals;

//reverse number

import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is the number you want to reverse?");

        int num = sc.nextInt();

        //int num = 1234;
        int reversedNumber = 0;

        while(num>0){
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num = num/10;
        }
        System.out.println(reversedNumber);
    }
}
