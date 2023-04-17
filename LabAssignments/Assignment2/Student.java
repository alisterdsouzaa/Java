/** ===========================================================================================================================================
 *  Problem Statement : Define a Student Class (roll number, name, percentage). Define a default and parameterized constructor.
 *                      Keep a count of objects created. Create objects using parameterized constructor and display the object count after
 *                      each object is created. ( Use static member and method). Also display the contents of each object.
 * ===========================================================================================================================================
 * File Path     : Student.java
 * Author        : Alister D'Souza
 * Date          : 17/04/2023
 *
 */
package LabAssignments.Assignment2;

public class Student {
    private final int rollNumber;
    private String name;
    private double percentage;
    private static int  iCnt = 0;

    /** Default Constructor */
    public Student()
    {
        this.name ="";
        this.rollNumber=0;
        this.percentage=0.0f;
        countObjects();
    }

    public Student(int rollNumber, String name, double percentage) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.percentage = percentage;
        countObjects();
    }

    private void countObjects(){
        iCnt = iCnt + 1;
        //System.out.println("Count of Objects is "+iCnt);
    }

/** Override toString() Method. */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name : ").append(this.name);
        sb.append("\nRoll Number : ").append(this.rollNumber);
        sb.append("\nPercentage : ").append(this.percentage);
        return sb.toString();
    }

    public static void main(String[] args) {
        Student student = new Student(1,"Alister", 99.99);
        Student student1 = new Student(2,"Steffy", 35);
        Student student2 = new Student(3,"Regina", 76.9);
        Student student3 = new Student();
        System.out.println();

        System.out.println(student);
        System.out.println();
        System.out.println(student1);
        System.out.println();
        System.out.println(student2);
        System.out.println();
        System.out.println(student3);
        System.out.println();

        System.out.println("Count of Objects is "+iCnt);

    }
}
