/**
 *    Check if input a Number or Not
 * ============================================
 * File Path     : ValidNumberOrNot.java
 * Author        : Alister D'Souza
 * Date          : 24/04/2023
 *
 */
package Java;

import java.util.Scanner;

public class ValidNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you Number :");
        String number = sc.next();
        boolean flag;
        flag = isNumberOrNot(String.valueOf(number));

        if (flag) {
            System.out.println("Input is a number :" + number);
        } else {
            System.out.println("Input is not a number " + number);
        }

    }

    public static boolean isNumberOrNot(String number){
        try {
            Integer.parseInt(number);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
