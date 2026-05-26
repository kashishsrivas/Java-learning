package practice.numberAnalyzer;

import java.util.Scanner;

public class numberAnalyzer {
    public static void checkEvenOdd(int a){
        if(a % 2 == 0){
            System.out.println("even");
        } else{}
        System.out.println("odd");
    }

    public static void checkPrime(int num){
        
        boolean isPrime = true;

        if( num <=1 ){
            isPrime = false;
        }

        for(int i = 2; i<num; i++){
            if(num%i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("prime number");
        } else{
            System.out.println("not a prime number");
        }
    }

    public static void fact(int num){
        int fact = 1;

        for(int i = 1; i<= num; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while (true) { 
            System.out.println("\n========= Welcome to Number Analyzer ==========");
            System.out.println("1. check Even Odd");
            System.out.println("2. Check Prime Number");
            System.out.println("3. Check Factorial");
            System.out.println("4. exit");

            System.out.println("Enter the choice");

            int choice = sc.nextInt();

            if(choice == 4){
                System.out.println("Number Analyzer Closed");
                break;
            }

            System.out.println("Number: ");
            int num = sc.nextInt();


            switch(choice){

                case 1:
                    checkEvenOdd(num);
                    break;

                case 2: 
                    checkPrime(num);
                    break;

                case 3:
                    fact(num);
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }

        sc.close();
    }
}

