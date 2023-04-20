/**
 *    Print numbers using recursion (from 1 - < input number> ).
 * ===========================================================
 * File Path     : PrintNumber1.java
 * Author        : Alister D'Souza
 * Date          : 20/04/2023
 *
 */
package Recursion;

import java.util.Scanner;

public class PrintNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var i = sc.nextInt();
        printNum(i);
    }

    static int j = 1;
    /* Recursive function */
    public static void printNum(int i){
        if (j == i+1) return;
        System.out.println(j);
        j++;
        printNum(i);
    }
}
