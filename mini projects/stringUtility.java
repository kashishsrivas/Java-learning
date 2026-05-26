package practice.stringUtilityApp;

import java.util.Scanner;

public class stringUtility {
    
    public static void reverseString(String str){
        System.out.println("reversed String: ");

        for(int i = str.length() - 1; i >=0; i--){
            System.out.println(str.charAt(i));
        }
        System.out.println();
    }

    public static void palindrome(String str){
        String reverse = "";

        for(int i = str.length() -1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("palindrome Number");
        } else{
            System.out.println("not a palindrome number");
        }
    }

    public static void countVowels(String str){
        int count = 0;
        str = str.toLowerCase();

        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'a' ||ch == 'e' ||ch == 'o' ||ch == 'i' ||ch == 'u'){
                count ++;
            }
        }
        System.out.println("Total Vowels: " + count);
    }

    public static void removeSpace(String str){
        String result = str.replace(" ", "");
        System.out.println("Removed Spaces: " + result);
    }

    public static void countWords(String str){
        String[] words = str.trim().split("\\s+"); 
        System.out.println("Total Words: " + words.length);
    }

    public static void characterFreq(String str){
        char target;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character to find frequency: ");

        target = sc.next().charAt(0);

        int count =0;

        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == target){
                count++;
            }
        }
        System.out.println("Frequency of '" + target + "' is: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== STRING UTILITY APP =====");
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        while(true) {
            System.out.println("\n1. Reverse String");
            System.out.println("2. Palindrome Check");
            System.out.println("3. Count Vowels");
            System.out.println("4. Remove Spaces");
            System.out.println("5. Count Words");
            System.out.println("6. Character Frequency");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    reverseString(str);
                    break;
                case 2:
                    palindrome(str);
                    break;
                case 3:
                    countVowels(str);
                    break;
                case 4:
                    removeSpace(str);
                    break;
                case 5:
                    countWords(str);
                    break;
                case 6:
                    characterFreq(str);
                    break;
                case 7:
                    System.out.println("Program Closed");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
