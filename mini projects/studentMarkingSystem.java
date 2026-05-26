package practice.StudentMarks;

import java.util.Scanner;

public class studentMarkingSystem {

    public static int calculateTotal(int [] marks){
        int total =0;
        for(int i = 0; i<marks.length; i++){
            total = total + marks[i];
        }
        return total;
    }

    public static double calculateAverage(int total, int subjects){
        return (double) total/subjects;
    }

    public static int highestNumber(int[] marks){
        int highest = marks[0];

        for(int i = 0; i<marks.length; i++){
            if(marks[i] > highest){
                highest = marks[i];
            }
        }

        return highest;
    }

    public static void calculateGrade(double average){
        if(average >= 90){
            System.out.println("Grade: A");
        }
        else if(average >=75){
            System.out.println("Grade: B");
        }
        else if(average >= 50){
            System.out.println("Grade: C");
        }
        else{
            System.out.println("Grade: Fail");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== STUDENT MARKS SYSTEM =====");
        System.out.print("Enter number of subjects: ");

        int subjects = sc.nextInt();

        int[] marks = new int[subjects];

        for(int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int total = calculateTotal(marks);
        double average = calculateAverage(total, subjects);
        int highest = highestNumber(marks);

        System.out.println("\n===== RESULT =====");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        calculateGrade(average);

        sc.close();
    }
}
