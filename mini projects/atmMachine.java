package practice.ATMMachine;

import java.util.Scanner;

public class atmMachine {

    // Check Balance Method
    public static void checkBalance(double balance) {

        System.out.println("Current Balance: " + balance);

    }

    // Deposit Method
    public static double deposit(double balance, double amount) {

        balance = balance + amount;

        System.out.println(amount + " Deposited Successfully");

        return balance;

    }

    // Withdraw Method
    public static double withdraw(double balance, double amount) {

        if(amount > balance) {

            System.out.println("Insufficient Balance");

        }
        else {

            balance = balance - amount;

            System.out.println(amount + " Withdrawn Successfully");

        }

        return balance;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 1000;

        while(true) {

            System.out.println("\n===== ATM MACHINE =====");

            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:

                    checkBalance(balance);

                    break;

                case 2:

                    System.out.print("Enter deposit amount: ");

                    double depositAmount = sc.nextDouble();

                    balance = deposit(balance, depositAmount);

                    break;

                case 3:

                    System.out.print("Enter withdraw amount: ");

                    double withdrawAmount = sc.nextDouble();

                    balance = withdraw(balance, withdrawAmount);

                    break;

                case 4:

                    System.out.println("Thank You For Using ATM");

                    sc.close();

                    return;

                default:

                    System.out.println("Invalid Choice");

            }

        }

    }

}

