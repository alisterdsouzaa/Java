/*
 *   Check if num is Odd or Even using Bitwise Operators
 * =======================================================
 * File Path     : OddEven.java
 * Author        : Alister D'Souza
 * Date          : 11/04/2023
 *
 */

package Bitwise;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int iNum = input.nextInt();

        boolean Result = isOdd(iNum);
        if(Result == false){
            System.out.println("Entered number "+ iNum + " is a even number");
        }
        else {
            System.out.println("Entered number "+ iNum + " is a Odd number");
        }

    }

    /*
        if lase bit is 1 the number is odd.
       And if last bit is 0 the number is even
    */

    private static boolean isOdd(int n){
        return ((n & 1) == 1);
        /* Any num & by 1 is the same number. */

    }
}
