/**
 * ===========================================================================================================================================
 * Problem Statement : Define a  class Employee having private members - id, name, department, salary. Define default & parameterized constructors.
 * Create a subclass called "Manager" with private member bonus. Define methods accept and display in both the classes.
 * Create n objects of the manager class and display the details of the manager having maximum salary ( Salary + bonus ).
 * ===========================================================================================================================================
 * File Path     : Employee.java
 * Author        : Alister D'Souza
 * Date          : 18/04/2023
 */
package LabAssignments.Assignment3.Q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee() {
        this.id = 0;
        this.name = "";
        this.department = "";
        this.salary = 0.0;
    }

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void accept() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter ID : ");
        id = Integer.parseInt(br.readLine());

        System.out.println("Enter Name : ");
        name = br.readLine();

        System.out.println("Enter Department : ");
        department = br.readLine();

        System.out.println(" Enter salary : ");
        salary = Double.parseDouble(br.readLine());
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {

       return  "  ID is : "+this.id +
               "\n Name is :"+this.name+
               "\n Department is :"+this.department+
               "\n Salary is :"+this.salary;

    }

}
