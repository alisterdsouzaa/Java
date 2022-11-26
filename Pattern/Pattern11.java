//////////////////////////////////////////////////////////////
// Problem Statement 11 : Display pattern
///////////////////////////////////////////////////////////////

/*

A B C D
a b c d
A B C D
a b c d

*/
package com.Pattern;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number  : ");
        int iNo = input.nextInt();
        displayPattern(iNo);
    }

    public static void displayPattern(int iNo) {
        for (int i = 1; i<=iNo; i++ ) {
            char ch = 'A';
            char smallCh = 'a';
            for (int j = 1; j<=iNo; ch++, smallCh++, j++)
            {
                if(i%2 == 0) {
                    System.out.print(smallCh+"\t");
                }
                else {
                    System.out.print(ch+"\t");
                }
            }

            System.out.println();

        }
    }
}

