/**
 * ===========================================================================================================================================
 * Problem Statement : Modify the above program Student.java to create n objects of the Student class. Accept details from the user for each object.
 * ===========================================================================================================================================
 * File Path     : Student.java
 * Author        : Alister D'Souza
 * Date          : 17/04/2023
 */
package LabAssignments.Assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Student1 {
    private final int rollNumber;
    private String name;
    private double percentage;
    private static int iCnt = 0;

    /**
     * Default Constructor
     */
    public Student1() {
        this.name = "";
        this.rollNumber = 0;
        this.percentage = 0.0f;
        countObjects();
    }

    public Student1(int rollNumber, String name, double percentage) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.percentage = percentage;
        countObjects();
    }

    private void countObjects() {
        iCnt++;
        //System.out.println("Count of Objects is "+iCnt);
    }

    /**
     * Override toString() Method.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name : ").append(this.name);
        sb.append("Roll Number : ").append(this.rollNumber);
        sb.append("Percentage : ").append(this.percentage);
        sb.append("\n");
        return sb.toString();
    }


    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        System.out.println("Enter the amount of objects you want to create : ");
        int iSize = Integer.parseInt(br.readLine());
        ArrayList<Student1> studentArray = new ArrayList<>();

        /* Create and Assign values to Objects */

        for (int i = 0; i < iSize; i++) {
            System.out.println("Enter your roll number : ");
            int roll = Integer.parseInt(br.readLine());
            System.out.println("Enter Name : ");
            String name = br.readLine();
            System.out.println("Enter Percentage : ");
            double percentage = Double.parseDouble(br.readLine());
            studentArray.add(new Student1(roll, name, percentage));

        }
        System.out.println(studentArray);
    }

}



