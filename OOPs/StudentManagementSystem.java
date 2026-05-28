package oops;

import java.util.Scanner;

class Student{

    int id;
    String name;
    int marks;

    //constructor
    Student(int id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    //Display Student details
    void displayStudent() {
        System.out.println("\n Student id: " + id);
        System.out.println(" Student name: " + name);
        System.out.println(" Student marks: "+ marks);

        if(marks >= 90){
            System.out.println(" Grade A");
        } else if (marks >= 75) {
            System.out.println(" Grade B");
        } else if(marks >= 50){
            System.out.println(" Grade C");
        } else{
            System.out.println(" Grade Fail");
        }
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Students: ");
        int n = sc.nextInt();

        Student[] stud = new Student[n];

        for(int i = 0; i<n; i++){
            System.out.println("Enter the student details: " + (i+1));

            System.out.println("enter the id:");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.println("enter the name: ");
            String name = sc.nextLine();

            System.out.println("enter the marks: ");
            int marks = sc.nextInt();

            //creating object
            stud[i] = new Student(id, name, marks); 
        }

        System.out.println("\n============STUDENT DETAILS============ ");

        int total = 0;
        int high = stud[0].marks;

        for(int i =0; i<n; i++){
            stud[i].displayStudent();//method calling
            total += stud[i].marks;

            if(high < stud[i].marks){
                high += stud[i].marks;
            }
        }

        double avg = (double)total/n;

        System.out.println("\nAverage marks: " + avg);
        System.out.println("Highest Marks: " + high);


        sc.close();
    }
}