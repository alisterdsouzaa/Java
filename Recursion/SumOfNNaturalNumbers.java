/**
 *    Print sum of N Natural Numbers.
 * =============================================
 * File Path     : SumOfNNaturalNumbers.java
 * Author        : Alister D'Souza
 * Date          : 20/04/2023
 *
 */
package Recursion;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
       // var iResult =
                sumOfNaturalNumber(n);
        //System.out.println(iResult);

    }

    static long sum =0;
    static int i = 1;
   static int iCnt = 0;
    private static void sumOfNaturalNumber(int n) {
        if(iCnt == n){
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        i++; iCnt++;
        sumOfNaturalNumber(n);
    }
}
