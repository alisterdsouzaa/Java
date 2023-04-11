/*
 * =========================================================================================
 * File Path         : LeapYear.java
 * Author            : Alister D'Souza
 * Date              : 11/04/2023
 * Problem Statement : Check if i/p year is a Leap Year
 * =========================================================================================
 */

package Java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a year to check if it is a leap year : ");
        int year = Integer.parseInt(br.readLine());

        /*
            A leap year is found by checking the divisibility of the year with 4 and 400.
            If a year is perfectly divisible by 4, then it is a leap year.
            However, if it is a century year (ending with 00), then it will be checked with 400.

         */
        if((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)){
            System.out.println(year +" is a leap year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}
