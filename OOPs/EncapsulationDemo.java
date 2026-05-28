package oops;

//encapsulation
class Student{
    private int marks;

    //setter
    public void setMarks(int marks){
        this.marks = marks;
    }

    //getter
    public int getMarks(){
        return marks;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setMarks(85);
        System.out.println("Marks Obtained: " + s1.getMarks());
    }
}
