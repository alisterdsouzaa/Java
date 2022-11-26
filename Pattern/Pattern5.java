///////////////////////////////////////////////////////////////////////////////
// Problem Statement 5 : Accept number form user and Display the below pattern.
///////////////////////////////////////////////////////////////////////////////

/*
 I/P = 8
 O/P = 2 4 6 8 10 12 14 16
 */

package com.Pattern;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter input :");
        int iValue = input.nextInt();

        displayPattern(iValue);
    }

    public static void displayPattern(int iNo){
        int iMultiply;
        for (int iCnt = 1; iCnt<=iNo; iCnt++ )
        {
            iMultiply = iCnt * 2;
            System.out.print(iMultiply+" ");
        }
    }
}
