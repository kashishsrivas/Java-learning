package JDBC;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class Employee{
    int id;
    String name;
    double Salary;

    Employee(int id, String name, double Salary) {
        this.id = id;
        this.name  = name;
        this.Salary = Salary;
    }

    void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + Salary);
    }
}

public class EmployeeDataStorageSystem  {
    
    static Scanner sc = new Scanner(System.in);

    public static void saveEmployee(){
        try {
            
            System.out.println("Employee id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Employee name: ");
            String name = sc.nextLine();

            System.out.println("Employee Salary: ");
            double Salary = sc.nextDouble();

            FileWriter file = new FileWriter("Employee.txt");
            file.write(id + "," + name + "," + Salary+ "\n");
            file.close();
            System.out.println("Employee Data saved.");

        } catch (Exception e) {
            System.out.println("error message: " + e.getMessage());
        }
    }

    public static void viewEmployee(){
        try {
            BufferedReader read = new BufferedReader(new FileReader("Employee.txt"));
            String line;
            while((line = read.readLine()) != null){
                String[] data= line.split(",");
                System.out.println("ID: " + data[0] + "| Name: " + data[1] + "| Salary: " + data[2]);
            }
            read.close();
        } catch (Exception e) {
            System.out.println("error message: " + e.getMessage());
        }
    }
    public static void main(String[] args) {

        int choice;

        do { 
            System.out.println("\n =========EMPLOYEE DATA STORAGE SYSTEM=========");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Exit");

            System.out.println("Enter the choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    saveEmployee();
                    break;
                
                case 2: 
                    viewEmployee();
                    break;
                
                case 3:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice !=3 );
        sc.close();
    }
}
