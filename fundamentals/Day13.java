package fundamentals;

//palindrome number

import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("number: ");
        int num = sc.nextInt();

        //int num = 121;
        int org = num;
        int reverse = 0;

        while(num>0){
            int digit = num %10;
            reverse = reverse * 10 + digit;
            num = num/10;
        }

        if(org == reverse){
            System.out.println("palindrome number: " + reverse);
        }
        else{
            System.out.println("not a palindrome: " + reverse);
        }
    }
}
