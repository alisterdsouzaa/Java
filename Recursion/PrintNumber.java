/**
 *    Print numbers using recursion.
 * =============================================
 * File Path     : Queue.java
 * Author        : Alister D'Souza
 * Date          : 12/02/2023
 *
 */
package Recursion;

import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var i = sc.nextInt();
        printNum(i);
    }

    /* Recursive function */
   public static void printNum(int i){
            if (i==0) return;
            System.out.println(i);
            printNum(i-1);
    }
}
