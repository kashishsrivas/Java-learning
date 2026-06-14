package AdvancedJava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

class Employee{
    int id;
    String name;
    Double salary;

    Employee(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("id: " + id + " | name: " + name + " | salary: " + salary);
    }
}

public class EmployeeAnalyticsSystem {
    static ArrayList<Employee> emp = new ArrayList<>();
    static  Scanner sc = new Scanner(System.in);

    public static void addEmployee(){
        System.out.println("Enter the employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the employee name: ");
        String name = sc.nextLine();

        System.out.println("Enter the employee Salary: ");
        Double salary = sc.nextDouble();

        emp.add(new Employee(id, name, salary));

        System.out.println("Employee added successfully.");
    }

    public static void viewEmployees(){
        if(emp.isEmpty()){
            System.out.println("Employee not found.");
        }

        System.out.println("/n======Employee List======");

        emp.forEach(Employee::display);
    }

    public static void highestSalaryEmployee(){
        Optional<Employee> highestSal = 
                                emp.stream()
                                    .max(Comparator.comparingDouble(e -> e.salary));
        
        if(highestSal.isPresent()){
            System.out.println("\nHighest Salary Employee: ");
            highestSal.get().display();

        } else{
            System.out.println("no employee found");
        }
    }

    public static void averageSalary(){
        double avg = 
                emp.stream()
                    .mapToDouble(e -> e.salary)
                    .average()
                    .orElse(0);
        
        System.out.println("average Salary: " + avg);
    }

    public static void filterEmployees(){
        System.out.println("Minimum Salary: ");

        double minSal = sc.nextDouble();

        emp.stream()
            .filter(e -> e.salary >= minSal)
            .forEach(Employee::display);
    }

    public static void searchEmployee(){
        System.out.println("Enter the Employee ID: ");

        int searchId = sc.nextInt();

        Employee found = null;

        for(Employee e : emp){
            if(e.id == searchId){
                found = e;
                break;
            }
        }

        if(found != null){
            found.display();
        } else{
            System.out.println("Employee Not Found.");
        }
    }

    public static void main(String[] args) {
        int choice;

        do {

            System.out.println("\n===== EMPLOYEE ANALYTICS SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Highest Salary Employee");
            System.out.println("4. Average Salary");
            System.out.println("5. Filter By Salary");
            System.out.println("6. Search Employee");
            System.out.println("7. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    highestSalaryEmployee();
                    break;
                case 4:
                    averageSalary();
                    break;
                case 5:
                    filterEmployees();
                    break;
                case 6:
                    searchEmployee();
                    break;
                case 7:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while(choice != 7);
        sc.close();
    }
}
