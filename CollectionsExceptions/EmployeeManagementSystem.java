package collec;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
    int id; 
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("salary: " + salary);
    }
}

public class EmployeeManagementSystem {

    static ArrayList<Employee> employees = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addEmp(){

        try {
            System.out.println("enter the employee id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("enter the employee name: ");
            String name = sc.nextLine();

            System.out.println("enter the salary: ");
            double salary = sc.nextDouble();

            if(salary < 0 ){
                throw new IllegalArgumentException("salary can not be zero");
            }

            employees.add(new Employee(id, name, salary));
            System.out.println("Employee Details Saved Successfully");
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            sc.nextLine();
        }
    }

    public static void displayEmp(){
        if(employees.isEmpty()){
            System.out.println("No Employess are found.");
            return;
        }
        System.out.println("-------employee list------");
        for(Employee e : employees){
            e.display();
        }
    }

    public static void SearchEmp(){
        System.out.println("Enter Employee ID to search: ");
        int search = sc.nextInt();

        Boolean found = false;

        for(Employee e: employees){
            if(e.id == search){
                e.display();
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Employee ID not found. ");
        }
    }

    public static void removeEmp(){
        System.out.println("Enter employee ID to remove: ");
        int remove = sc.nextInt();

        for(Employee e: employees){
            if(e.id == remove){
                employees.remove(e);
                System.out.println("Employee ID removed. ");
                return;
            }
        }
        System.out.println("Employee Not Found.");
    }

    public static void main(String[] args) {

        while(true){

            System.out.println("\n========EMPLOYEE MANAGEMENT SYSTEM==========");
            System.out.println("1. ADD EMPLOYEES");
            System.out.println("2. DISPLAY EMPLOYEES");
            System.out.println("3. SEARCH EMPLOYEE");
            System.out.println("4. REMOVE EMPLOYEE");
            System.out.println("5. EXIT.");
            
            System.out.println("ENTER THE CHOICE: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmp();
                    break;
                
                case 2: 
                    displayEmp();
                    break; 

                case 3: 
                    SearchEmp();
                    break; 
                
                case 4: 
                    removeEmp();
                    break; 

                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("INVALID CHOICE");
            }
        }
    }
}
