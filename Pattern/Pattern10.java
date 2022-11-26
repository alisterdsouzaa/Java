//////////////////////////////////////////////////////////////
// Problem Statement 1 : Display pattern
///////////////////////////////////////////////////////////////

/*
I/P = 4

A B C D
A B C D
A B C D
A B C D

*/
package com.Pattern;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number  : ");
        int iNo = input.nextInt();
        displayPattern(iNo);
    }

    public static void displayPattern(int iNo) {
        for (int i = 1; i<=iNo; i++ ) {
            char ch = 'A';
            for (int j = 1; j<=iNo;ch++, j++) {
                System.out.print(ch+"\t");
            }
            System.out.println();

        }
    }
}

