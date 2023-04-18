package LabAssignments.Assignment3.Q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Manager extends Employee {
    private double bonus;

    Manager() {
        super();
        this.bonus = 0;
    }

    Manager(int id, String name, String department, double salary, double bonus) {
        super(id,name,department,salary);
        this.bonus = bonus;
    }

    @Override
    public void accept() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        super.accept();
        System.out.println("Enter Bonus : ");
        bonus = Double.parseDouble(br.readLine());
    }

    public void display() {
        super.display();
        this.toString();
    }

    @Override
    public String toString() {

        return super.toString() + "\nBonus is :"+this.bonus;
    }

    public static void main(String[] args) throws IOException {
        List<Manager> m = new ArrayList<>();
        Employee m1 = new Manager();
        m1.accept();
        m1.display();
    }

}
